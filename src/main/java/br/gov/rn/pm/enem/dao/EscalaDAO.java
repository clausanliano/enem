
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Escala;
import br.gov.rn.pm.util.GenericDAO;

public class EscalaDAO extends GenericDAO<Escala> {

    @Override
    public Class<Escala> getClassType() {
        return Escala.class;
    }
}