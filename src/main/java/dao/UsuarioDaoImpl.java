package dao;

import idao.iUsuarioDao;
import models.Usuario;

public class UsuarioDaoImpl extends Dao<Usuario, Integer> implements iUsuarioDao {

    @Override
    public Cliente find(Integer id) {
        return getEntityManager().find(Cliente.class, id);
    }




}
