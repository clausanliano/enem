
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.LocalDAO;
import br.gov.rn.pm.enem.model.Local;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="localConv")
public class LocalConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     LocalDAO localDAO = new LocalDAO();
//     Local jogador = localDAO.buscaPorNome(string);
    Local jogador = localDAO.findByPrimaryKey(Integer.parseInt(string));
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Local local = new Local();
 local = (Local) o;
 return String.valueOf(local.getId());
// return local.getNome();
 }

}

