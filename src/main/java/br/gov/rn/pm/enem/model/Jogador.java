        
package br.gov.rn.pm.enem.model;

import br.gov.rn.pm.util.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jogador")
public class Jogador implements PersistDB {

    @Id
    @GeneratedValue
private int id;

private String nome;

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

}

