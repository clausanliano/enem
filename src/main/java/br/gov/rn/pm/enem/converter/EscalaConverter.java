
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.EscalaDAO;
import br.gov.rn.pm.enem.model.Escala;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="escalaConv")
public class EscalaConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     EscalaDAO escalaDAO = new EscalaDAO();
//     Escala jogador = escalaDAO.buscaPorNome(string);
    Escala jogador = escalaDAO.findByPrimaryKey(Integer.parseInt(string));
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Escala escala = new Escala();
 escala = (Escala) o;
 return String.valueOf(escala.getId());
// return escala.getNome();
 }

}

