package br.gov.rn.pm.enem.controller;

import br.gov.rn.pm.enem.dao.EscalaDAO;
import br.gov.rn.pm.enem.dao.LocalDAO;
import br.gov.rn.pm.enem.dao.OperacaoDAO;
import br.gov.rn.pm.enem.dao.OpmDAO;
import br.gov.rn.pm.enem.dao.PolicialDAO;
import br.gov.rn.pm.enem.dao.VagaDAO;
import br.gov.rn.pm.enem.model.Escala;
import br.gov.rn.pm.enem.model.Local;
import br.gov.rn.pm.enem.model.Operacao;
import br.gov.rn.pm.enem.model.Opm;
import br.gov.rn.pm.enem.model.Policial;
import br.gov.rn.pm.enem.model.Vaga;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "escalaMB")
@ViewScoped
public class EscalaController {
    
    private Escala escala = new Escala();
    private Opm opm;
    private Operacao operacao;
    private List<Opm> opms;
    private List<Operacao> operacoes;
    private Policial policial;
    private Local local;
    private List<Vaga> vagas = new ArrayList();
    private Vaga vaga = new Vaga();

    public EscalaController() {
        OpmDAO odao = new OpmDAO();
        opms = odao.findAll();
        
        OperacaoDAO opdao = new OperacaoDAO();
        operacoes = opdao.findAll();
        
        policial = new Policial();
        
    }
    
    public List<Local> consultarLocais (String consulta){
        LocalDAO ldao = new LocalDAO();
        return ldao.findAllLike("nome", consulta);
    }
    
    public List<Policial> consultarPoliciais (String consulta){
        PolicialDAO pdao = new PolicialDAO();
        return pdao.findAllLike("matricula", consulta);
    }
    
    public String salvar(){        
       // escala.setOpm(opm);       
//        System.out.println("opm: " + opm.toString());
//        escala.setOperacao(operacao);
//        System.out.println("operacao: " + operacao.toString());
//        escala.setVagas(vagas);
//        System.out.println("vagas: " + vagas.toString());
//        EscalaDAO edao = new EscalaDAO();
//        edao.create(escala);
//        escala = new Escala();
        return "escala/index?faces-redirect=true";
    }
    
    public  void inserir_vaga(){
        vaga.setPolicial(policial);
        vaga.setLocal(local);
        vagas.add(vaga);
        vaga = new Vaga();
    }
    
    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public List<Opm> getOpms() {
        return opms;
    }

    public void setOpms(List<Opm> opms) {
        this.opms = opms;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    public Policial getPolicial() {
        PolicialDAO pdao = new PolicialDAO();
        List<Policial> lista = pdao.findAllLike("matricula", policial.getMatricula());
        if (lista.size() == 1){
            policial = lista.get(0);        
        }else{
            policial = new Policial();
        }
        return policial;
        
    }

    public void setPolicial(Policial policial) {   
        this.policial = policial;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Opm getOpm() {
        return opm;
    }

    public void setOpm(Opm opm) {
        this.opm = opm;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }
    
}
