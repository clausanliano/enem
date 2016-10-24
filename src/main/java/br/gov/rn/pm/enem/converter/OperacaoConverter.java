
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.OperacaoDAO;
import br.gov.rn.pm.enem.model.Operacao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="operacaoConv")
public class OperacaoConverter implements Converter {

 
    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {                
        if(value == null || value.isEmpty()){
            return null;
        }else{
            int id = Integer.parseInt(value);
            OperacaoDAO operacaoDAO = new OperacaoDAO();
            Operacao operacao = operacaoDAO.findByPrimaryKey(id);
            return operacao;
        }
    }


     @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        Operacao operacao = (Operacao)value;
        if(operacao != null){
            return String.valueOf(operacao.getId());
        }else{
            return null;
        }
    }
 
}

