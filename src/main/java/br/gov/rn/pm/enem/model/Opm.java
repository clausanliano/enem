
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "opm")
public class Opm  implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String sigla;
    private String endereco;
    private String telefone;
    private String email;

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Opm{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
    
}
