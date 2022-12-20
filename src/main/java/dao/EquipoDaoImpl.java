package dao;

import idao.iEquipoDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Equipo;


public class EquipoDaoImpl extends Dao<Equipo, Integer> implements iEquipoDao {

    @Override
    public Equipo find(Integer id) {
        return getEntityManager().find(Equipo.class,id);
    }

}
