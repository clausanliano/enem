/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.pm.enem.controller;

import br.gov.rn.pm.enem.dao.JogadorDAO;
import br.gov.rn.pm.enem.model.Jogador;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author 1960903
 */
@ManagedBean
@RequestScoped
public class JogadorController {

 private Jogador jogadorSelecionado;
 private JogadorDAO jogadorDAO = new JogadorDAO();
 private List<Jogador> jogadores = new ArrayList<Jogador>();

 public Jogador getJogadorSelecionado() {
 return jogadorSelecionado;
 }

 public void setJogadorSelecionado(Jogador jogadorSelecionado) {
 this.jogadorSelecionado = jogadorSelecionado;
 }

 public List<Jogador> getJogadores() {
 return jogadores;
 }

 public void setJogadores(List<Jogador> jogadores) {
 this.jogadores = jogadores;
 }

    public List<Jogador> completaNome(String query) {
//       this.jogadores = jogadorDAO.listaTodos();
//       List<Jogador> sugestoes = new ArrayList<Jogador>();
//       for (Jogador j : this.jogadores) {
//           if (j.getNome().startsWith(query)) {
//               sugestoes.add(j);
//           }
//       }
       return jogadorDAO.consultaPorNome(query);
//       return sugestoes;
   }
}

