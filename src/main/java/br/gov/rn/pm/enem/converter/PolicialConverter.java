
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.PolicialDAO;
import br.gov.rn.pm.enem.model.Policial;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="policialConv")
public class PolicialConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     PolicialDAO policialDAO = new PolicialDAO();
//     Policial jogador = policialDAO.buscaPorNome(string);
    Policial jogador = policialDAO.findByPrimaryKey(Integer.parseInt(string));
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Policial policial = new Policial();
 policial = (Policial) o;
 return String.valueOf(policial.getId());
// return policial.getNome();
 }

}

