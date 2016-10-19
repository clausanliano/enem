
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Local;
import br.gov.rn.pm.util.GenericDAO;

public class LocalDAO extends GenericDAO<Local> {

    @Override
    public Class<Local> getClassType() {
        return Local.class;
    }
}