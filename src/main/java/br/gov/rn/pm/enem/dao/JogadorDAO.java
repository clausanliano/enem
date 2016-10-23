/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Jogador;



import br.gov.rn.pm.enem.model.Jogador;
import br.gov.rn.pm.util.GenericDAO;
import java.util.ArrayList;
import java.util.List;

public class JogadorDAO extends GenericDAO<Jogador> {

    @Override
    public Class<Jogador> getClassType() {
        return Jogador.class;
    }
    
    public List<Jogador> listaTodos(){
        return this.findAll();
    }
    
    public Jogador buscaPorNome(String string){
        List<Jogador> lista = this.findAllLike("nome", string);
        if (lista.size() == 1){
            return lista.get(0);
        }else{
            return null;
        }            
    }
    
    public List<Jogador> consultaPorNome(String string){
        return this.findAllLike("nome", string);
    }
}
