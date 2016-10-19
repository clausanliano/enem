

package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Local implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cidade;
    private String area;
    private String bairro;
    private String endereco;
    private String comando;
    private String sabatista;
    @OneToMany (mappedBy = "local")
    private List<Vaga> vagas;

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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSabatista() {
        return sabatista;
    }

    public void setSabatista(String sabatista) {
        this.sabatista = sabatista;
    }

    @Override
    public String toString() {
        return "Local{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", area=" + area + ", bairro=" + bairro + ", endereco=" + endereco + ", comando=" + comando + ", sabatista=" + sabatista + ", vagas=" + vagas + '}';
    }


    
    
    
}
