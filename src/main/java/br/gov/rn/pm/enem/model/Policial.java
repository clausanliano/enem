

package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "policial")
public class Policial implements PersistDB {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private String matricula;
    private String banco;
    private String agencia;
    private String conta;
    private String celular;    
    @OneToMany(fetch = FetchType.LAZY)
    private List<Vaga> vagas;
    @ManyToOne (fetch = FetchType.LAZY)
    private Opm opm;
    @ManyToOne (fetch = FetchType.EAGER)
    private Hierarquia hierarquia;
    
    public Boolean verificarSenha(String senha){        
        return this.senha.equals(senha);        
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public Opm getOpm() {
        return opm;
    }

    public void setOpm(Opm opm) {
        this.opm = opm;
    }

    public Hierarquia getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(Hierarquia hierarquia) {
        this.hierarquia = hierarquia;
    }

    @Override
    public String toString() {
        return "Policial{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", senha=" + senha + ", matricula=" + matricula + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", celular=" + celular + '}';
    }

    

}
