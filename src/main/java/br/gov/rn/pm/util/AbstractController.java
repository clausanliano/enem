package br.gov.rn.pm.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import br.gov.rn.pm.util.PersistDB;

public class AbstractController<T extends PersistDB> {

    public void addInfo(String msg) {
        FacesMessage fm = new FacesMessage(msg);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
	
    
}