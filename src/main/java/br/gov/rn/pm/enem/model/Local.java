
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "local")
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
    private String latitude;
    private String longitude;
    private String telefone;
    private String email;
    @OneToMany (mappedBy = "local", fetch = FetchType.LAZY)
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getSabatista() {
        return sabatista;
    }

    public void setSabatista(String sabatista) {
        this.sabatista = sabatista;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "Local{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", area=" + area + ", bairro=" + bairro + ", endereco=" + endereco + ", comando=" + comando + ", sabatista=" + sabatista + ", latitude=" + latitude + ", longitude=" + longitude + ", telefone=" + telefone + ", email=" + email + ", vagas=" + vagas + '}';
    }
    
    
    
}
