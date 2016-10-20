package br.gov.rn.pm.enem.controller;

import br.gov.rn.pm.enem.dao.PolicialDAO;
import br.gov.rn.pm.enem.dao.VagaDAO;
import br.gov.rn.pm.enem.model.Policial;
import br.gov.rn.pm.enem.model.Vaga;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="marcacao")
@SessionScoped
public class  MarcacaoController implements Serializable{
    
    private String login;
    private String senha;
    private List<Vaga> vagas;
    private Policial policial = new Policial();
    private Vaga vaga;
    private List<Vaga> vagasConflitantes = new ArrayList();
    private String teste;    
    private List<Vaga> marcadas = new ArrayList();
    
    public String confirmar(){
        VagaDAO vagadao = new VagaDAO();
        List<Vaga> lista = vagadao.listarVagasPorPolicialId(policial.getId()); 
        vagasConflitantes.clear();
        for (Vaga vagaTmp : lista) {
            //verifica se horário de início entra em choque com outras vagas já cadastradas
            if (
                    (   
                        vaga.getInicio().after(vagaTmp.getInicio()) 
                        && 
                        vaga.getInicio().before(vagaTmp.getTermino())
                    )
                    || vaga.getInicio().equals(vagaTmp.getInicio())
                    || vaga.getInicio().equals(vagaTmp.getTermino())
                )
                
            {
                    vagasConflitantes.add(vaga);
                    vagasConflitantes.add(vagaTmp);
                    return "/conflito?faces-redirect=true";
                }
            
            //verifica se horário de início entra em choque com outras vagas já cadastradas
            if (
                    (   
                        vaga.getTermino().after(vagaTmp.getInicio()) 
                        && 
                        vaga.getTermino().before(vagaTmp.getTermino())
                    )
                    || vaga.getTermino().equals(vagaTmp.getInicio())
                    || vaga.getTermino().equals(vagaTmp.getTermino())
                )
                
            {   vagasConflitantes.add(vaga);
                    vagasConflitantes.add(vagaTmp);
                    return "/conflito?faces-redirect=true";
            }   
        }
        
        
        vaga.setPolicial(policial);
        vagadao.update(vaga);
        
        return "/comprovante?faces-redirect=true";
        
    }
    
    public String logar(){
        PolicialDAO pmdao = new PolicialDAO();
        List<Policial> listaPolicial = pmdao.findAllLike("matricula", login);
        if (listaPolicial.size() == 1){
            policial = listaPolicial.get(0);
            if (policial.verificarSenha(senha)){
                VagaDAO daovaga = new VagaDAO();
                marcadas = daovaga.findAllLike("policial_id",String.valueOf(policial.getId()));
                vagas = daovaga.listarVagasSemPolicial();
                return "/listaVagas?faces-redirect=true";        
            }
        }        
        return "/cancelar?faces-redirect=true";
    }
    
    
    public String escolher(int id){
        VagaDAO daoVaga = new VagaDAO();        
        vaga = daoVaga.findByPrimaryKey(id);
        /*
        marcadas = daoVaga.listarVagasPorPolicialId(policial.getId()); 
        vagasConflitantes.clear();
        for(Vaga vg : marcadas){
            if (
                    (vg.getInicio().equals(this.vaga.getInicio()))
                    ||
                    (vg.getTermino().equals(this.vaga.getTermino()))
                    ||
                    (vg.getInicio().equals(this.vaga.getInicio()))
                    ||
                    (vg.getTermino().equals(this.vaga.getTermino()))
                    ||
                    ((vg.getInicio().after(this.vaga.getInicio())) && (vg.getInicio().before(this.vaga.getTermino())))
                    ||
                    ((vg.getTermino().after(this.vaga.getInicio())) && (vg.getTermino().before(this.vaga.getTermino())))
                )                    
                {
                vagasConflitantes.add(this.vaga);
                    vagasConflitantes.add(vg);
                    return "/conflito?faces-redirect=true";
                }else{
                    System.out.println("Verificação dos horários");
                    System.out.println("Nova vaga:" + vaga.toString());
                    System.out.println("Reservado: " + vg.toString());
                    
                }
        }
        */
    
        return "/marcacao?faces-redirect=true";
    }
    
    /* Getters e Setters */

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public Policial getPolicial() {
        return policial;
    }

    public void setPolicial(Policial policial) {
        this.policial = policial;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTeste() {
        teste = vaga.toString();
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public List<Vaga> getVagasConflitantes() {
        return vagasConflitantes;
    }

    public void setVagasConflitantes(List<Vaga> vagasConflitantes) {
        this.vagasConflitantes = vagasConflitantes;
    }

    public List<Vaga> getMarcadas() {
        return marcadas;
    }

    public void setMarcadas(List<Vaga> marcadas) {
        this.marcadas = marcadas;
    }
    
    
    
    
    
}
