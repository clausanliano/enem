
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Opm;
import br.gov.rn.pm.util.GenericDAO;

public class OpmDAO extends GenericDAO<Opm> {

    @Override
    public Class<Opm> getClassType() {
        return Opm.class;
    }
}