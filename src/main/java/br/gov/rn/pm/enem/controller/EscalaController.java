package br.gov.rn.pm.enem.controller;

import br.gov.rn.pm.enem.dao.EscalaDAO;
import br.gov.rn.pm.enem.dao.LocalDAO;
import br.gov.rn.pm.enem.dao.OperacaoDAO;
import br.gov.rn.pm.enem.dao.OpmDAO;
import br.gov.rn.pm.enem.dao.PolicialDAO;
import br.gov.rn.pm.enem.model.Escala;
import br.gov.rn.pm.enem.model.Local;
import br.gov.rn.pm.enem.model.Operacao;
import br.gov.rn.pm.enem.model.Opm;
import br.gov.rn.pm.enem.model.Policial;
import br.gov.rn.pm.enem.model.Vaga;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "escalaMB")
@ViewScoped
public class EscalaController {
    
    private Escala escala = new Escala();
    private int idOpmSelecionada;
    private int idOperacaoSelecionada;
    private List<Opm> opms;
    private List<Operacao> operacoes;
    private List<Escala> escalas;
    private Policial policial = new Policial();
    private Local local;
    private List<Local> locais;

    public EscalaController() {
        OpmDAO odao = new OpmDAO();
        opms = odao.findAll();
        
        OperacaoDAO opdao = new OperacaoDAO();
        operacoes = opdao.findAll();
        
        EscalaDAO edao = new EscalaDAO();
        escalas = edao.findAll();
    }
    
    public String salvar(){
        OpmDAO odao = new OpmDAO();
        escala.setOpm(odao.findByPrimaryKey(idOpmSelecionada));
        
        OperacaoDAO opdao = new OperacaoDAO();
        escala.setOperacao(opdao.findByPrimaryKey(idOperacaoSelecionada));
        
        EscalaDAO edao = new EscalaDAO();
        edao.create(escala);
        escalas.add(escala);
        escala = new Escala();
        return "escala/index?faces-redirect=true";
    }
    
    public  void inserir_vaga(){
        Vaga vaga = new Vaga();
        vaga.setPolicial(policial);
        vaga.setLocal(local);
        escala.getVagas().add(vaga);
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

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }

    public int getIdOpmSelecionada() {
        return idOpmSelecionada;
    }

    public void setIdOpmSelecionada(int idOpmSelecionada) {
        this.idOpmSelecionada = idOpmSelecionada;
    }

    public int getIdOperacaoSelecionada() {
        return idOperacaoSelecionada;
    }

    public void setIdOperacaoSelecionada(int idOperacaoSelecionada) {
        this.idOperacaoSelecionada = idOperacaoSelecionada;
    }

    public Policial getPolicial() {
        PolicialDAO pdao = new PolicialDAO();
        List<Policial> lista = pdao.findAllLike("matricula", policial.getMatricula());
        if (lista.size() == 1){
            policial = lista.get(0);
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

    public List<Local> getLocais() {
        LocalDAO ldao = new LocalDAO();
        return ldao.findAll();
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }

    
    
}
