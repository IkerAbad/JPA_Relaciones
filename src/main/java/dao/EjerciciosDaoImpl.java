package dao;

import idao.iEjerciciosDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Ejercicios;

import java.util.List;

public class EjerciciosDaoImpl extends Dao<Ejercicios, Integer> implements iEjerciciosDao {

    @Override
    public Ejercicios find(Integer id) {
        return getEntityManager().find(Ejercicios.class,id);
    }

}
