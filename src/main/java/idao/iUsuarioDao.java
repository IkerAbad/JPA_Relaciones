package idao;

import models.Cliente;

public interface iUsuarioDao {

    public Cliente addCliente(Cliente c);
    public boolean deleteCliente(Cliente cliente);

}
