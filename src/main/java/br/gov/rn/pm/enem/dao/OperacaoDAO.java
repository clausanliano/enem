
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Operacao;
import br.gov.rn.pm.util.GenericDAO;

public class OperacaoDAO extends GenericDAO<Operacao> {

    @Override
    public Class<Operacao> getClassType() {
        return Operacao.class;
    }
}