
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vaga implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private Calendar inicio;
    private Calendar termino;
    private Boolean confirmado;
    private String observacao;
    @ManyToOne
    private Local local;
    @OneToOne
    private Policial policial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getTermino() {
        return termino;
    }

    public void setTermino(Calendar termino) {
        this.termino = termino;
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Policial getPolicial() {
        return policial;
    }

    public void setPolicial(Policial policial) {
        this.policial = policial;
    }

    @Override
    public String toString() {
        return "Vaga{" + "id=" + id + ", inicio=" + inicio + ", termino=" + termino + ", confirmado=" + confirmado + ", observacao=" + observacao + ", local=" + local + '}';
    }
    
    

    
    
}
