
package br.gov.rn.pm.enem.converter;

import br.gov.rn.pm.enem.dao.OpmDAO;
import br.gov.rn.pm.enem.model.Opm;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value="opmConv")
public class OpmConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {                
        if(value == null || value.isEmpty()){
            return null;
        }else{
            int id = Integer.parseInt(value);
            OpmDAO dao = new OpmDAO();
            Opm opm = dao.findByPrimaryKey(id);
            System.out.println(opm.getNome());
            return opm;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        Opm opm = (Opm)value;
        if(opm != null){
            return String.valueOf(opm.getId());
        }else{
            return null;
        }
    }
}
