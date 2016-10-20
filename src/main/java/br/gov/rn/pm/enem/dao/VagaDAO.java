
package br.gov.rn.pm.enem.dao;

import br.gov.rn.pm.enem.model.Vaga;
import br.gov.rn.pm.util.GenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
public class VagaDAO extends GenericDAO<Vaga> {

    @Override
    public Class<Vaga> getClassType() {
        return Vaga.class;
    }
    
    
    public List<Vaga> listarVagasSemPolicial() {
        String tabela = getClassType().getSimpleName();
        String jpql = "from "+tabela+ " where policial_id IS NULL";
        EntityManager em = getEm();
        Query q = em.createQuery(jpql);
        List<Vaga> retorno = q.getResultList();
        return retorno;
    }

    public List<Vaga> listarVagasPorPolicialId(int id) {
        String tabela = getClassType().getSimpleName();
        String jpql = "from "+tabela+ " where policial_id = " + String.valueOf(id);
        EntityManager em = getEm();
        Query q = em.createQuery(jpql);
        List<Vaga> retorno = q.getResultList();
        return retorno;
    }
}