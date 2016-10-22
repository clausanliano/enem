
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Hierarquia;
import br.gov.rn.pm.util.GenericDAO;

public class HierarquiaDAO extends GenericDAO<Hierarquia> {

    @Override
    public Class<Hierarquia> getClassType() {
        return Hierarquia.class;
    }
}