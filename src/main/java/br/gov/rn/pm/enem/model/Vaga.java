
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vaga implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    @Temporal (TemporalType.TIMESTAMP)
    private Date inicio;
    @Temporal (TemporalType.TIMESTAMP)
    private Date termino;
    private Boolean confirmado;
    private String observacao;
    @ManyToOne
    private Local local;
    @ManyToOne
    private Policial policial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
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
