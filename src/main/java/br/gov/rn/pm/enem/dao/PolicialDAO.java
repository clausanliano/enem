package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Policial;
import br.gov.rn.pm.util.GenericDAO;

public class PolicialDAO extends GenericDAO<Policial> {

    @Override
    public Class<Policial> getClassType() {
        return Policial.class;
    }
}
