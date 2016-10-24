
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.VagaDAO;
import br.gov.rn.pm.enem.model.Vaga;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="vagaConv")
public class VagaConverter implements Converter {

 @Override
 public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
     VagaDAO vagaDAO = new VagaDAO();
//     Vaga jogador = vagaDAO.buscaPorNome(string);
    Vaga jogador = vagaDAO.findByPrimaryKey(Integer.parseInt(string));
    return jogador;
 }

 @Override
 public String getAsString(FacesContext fc, UIComponent uic, Object o) {
 Vaga vaga = new Vaga();
 vaga = (Vaga) o;
 return String.valueOf(vaga.getId());
// return vaga.getNome();
 }

}

