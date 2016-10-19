package br.gov.rn.pm.enem.controller;

import br.gov.rn.pm.enem.dao.PolicialDAO;
import br.gov.rn.pm.enem.dao.VagaDAO;
import br.gov.rn.pm.enem.model.Policial;
import br.gov.rn.pm.enem.model.Vaga;
import java.io.Serializable;
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
    private String teste;
    
    public String confirmar(){
        
        PolicialDAO pmdao = new PolicialDAO();
        pmdao.update(policial);
        
        VagaDAO vagadao = new VagaDAO();
        vaga = vagadao.findByPrimaryKey(vaga.getId());
        if (vaga.getPolicial() == null){
            vaga.setPolicial(policial);
            vagadao.update(vaga);
            policial = new Policial();
            return "/comprovante?faces-redirect=true";
        }else{            
            return "/cancelar?faces-redirect=true";
        }
    }
    
    public String logar(){
        String retorno =  "/cancelar?faces-redirect=true";
        PolicialDAO pmdao = new PolicialDAO();
        List<Policial> listaPolicial = pmdao.findAllLike("matricula", login);
        if (listaPolicial.size() == 1){
            policial = listaPolicial.get(0);
                        
            if (policial.getSenha().equals(senha)){
                VagaDAO daovaga = new VagaDAO();
                List<Vaga> listaVaga = daovaga.findAllLike("policial_id", String.valueOf(policial.getId()));
                if (listaVaga.size() == 1){
                    vaga = listaVaga.get(0);
                    policial = new Policial();
                    retorno = "/comprovante?faces-redirect=true";
                }else{
                    vagas = daovaga.listarVagasSemPolicial();
                    retorno = "/listaVagas?faces-redirect=true";
                }          
            }
        }        
        return retorno;
    }
    
    
    public String escolher(Vaga vaga){
        
        this.vaga = vaga;
        
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
    
    
    
    
    
}
