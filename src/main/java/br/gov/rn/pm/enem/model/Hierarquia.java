
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "hierarquia")
public class Hierarquia implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String abreviatura;
    private int antiguidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    @Override
    public String toString() {
        return "Hierarquia{" + "id=" + id + ", nome=" + nome + ", abreviatura=" + abreviatura + ", antiguidade=" + antiguidade + '}';
    }
    
    
}
