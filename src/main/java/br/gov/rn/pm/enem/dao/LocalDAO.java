
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Local;
import br.gov.rn.pm.util.GenericDAO;
import java.util.List;

public class LocalDAO extends GenericDAO<Local> {

    @Override
    public Class<Local> getClassType() {
        return Local.class;
    }
    public Local buscaPorNome(String string){
        List<Local> lista = this.findAllLike("nome", string);
        if (lista.size() == 1){
            return lista.get(0);
        }else{
            return null;
        }
    }
}