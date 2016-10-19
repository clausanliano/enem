

package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
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
    @OneToOne(mappedBy = "policial")
    private Vaga vaga;

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

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return "Policial{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", senha=" + senha + ", matricula=" + matricula + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", celular=" + celular + ", vaga=" + vaga + '}';
    }

    

}
