package dao;

import idao.iIdiomaDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Idioma;

public class IdiomaDaoImpl extends Dao<Idioma, Integer> implements iIdiomaDao {

    @Override
    public Idioma find(Integer id) {
        return getEntityManager().find(Idioma.class, id);
    }

}

