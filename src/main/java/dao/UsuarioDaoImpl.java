package dao;

import idao.iUsuarioDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Usuario;

public class UsuarioDaoImpl extends Dao<Usuario, Integer> implements iUsuarioDao {

    @Override
    public Usuario find(Integer id) {
        return getEntityManager().find(Usuario.class, id);
    }




}
