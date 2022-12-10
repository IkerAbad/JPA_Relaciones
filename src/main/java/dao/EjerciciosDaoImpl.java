package dao;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class EmbarqueDaoImpl extends Dao<Embarque, Integer> implements iEmbarqueDao {

    @Override
    public Embarque find(Integer id) {
        return getEntityManager().find(Embarque.class,id);
    }


    @Override
    public Embarque addEmbarque(Embarque embarque) {
        return this.create(embarque);
    }

    @Override
    public List<Embarque> listadoEmbarquesPorVuelo(Integer vuelo_id) {
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        String query= "select t from Embarque t where t.vuelo.id=:vuelo_id order by t.asiento desc ";
        Query query1=em.createQuery(query);
        query1.setParameter("vuelo_id",vuelo_id);
        List <Embarque> embarques= query1.getResultList();
        return embarques;
    }
}
