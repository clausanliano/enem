
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "escala")
public class Escala implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    @ManyToOne (fetch = FetchType.LAZY)
    private Opm opm;
    @ManyToOne (fetch = FetchType.LAZY)
    private Operacao operacao;
    @Temporal (TemporalType.DATE)
    private Date data;
    @OneToMany (fetch = FetchType.EAGER)
    private List<Vaga> vagas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
    
    

    @Override
    public String toString() {
        return "Escala{" + "id=" + id + ", titulo=" + titulo + ", data=" + data + '}';
    }
    
    
    
    
}
