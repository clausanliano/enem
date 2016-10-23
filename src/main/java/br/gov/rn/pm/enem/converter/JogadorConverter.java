/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.JogadorDAO;
import br.gov.rn.pm.enem.model.Jogador;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="jogadorConverter")
public class JogadorConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     JogadorDAO jogadorDAO = new JogadorDAO();
     Jogador jogador = jogadorDAO.buscaPorNome(string);
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Jogador jogador = new Jogador();
 jogador = (Jogador) o;
 return jogador.getNome();
 }

}

