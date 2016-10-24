
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.HierarquiaDAO;
import br.gov.rn.pm.enem.model.Hierarquia;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="hierarquiaConv")
public class HierarquiaConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     HierarquiaDAO hierarquiaDAO = new HierarquiaDAO();
//     Hierarquia jogador = hierarquiaDAO.buscaPorNome(string);
    Hierarquia jogador = hierarquiaDAO.findByPrimaryKey(Integer.parseInt(string));
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Hierarquia hierarquia = new Hierarquia();
 hierarquia = (Hierarquia) o;
 return String.valueOf(hierarquia.getId());
// return hierarquia.getNome();
 }

}

