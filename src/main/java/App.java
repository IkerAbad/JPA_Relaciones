import dao.ClienteDaoImpl;
import dao.EmbarqueDaoImpl;
import dao.VueloDaoImpl;
import models.Cliente;
import models.Embarque;
import models.Vuelo;

import java.sql.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        VueloDaoImpl vueloDao = new VueloDaoImpl();
        EmbarqueDaoImpl embarqueDao = new EmbarqueDaoImpl();
        List<Embarque> embarque1 = null;
        Cliente cliente = new Cliente(1,"Iker","Fernandez","312312312231","dawdia@gmail.com","124121321",embarque1);
        Vuelo vuelo = new Vuelo();
        Embarque embarque = new Embarque();

        clienteDao.addCliente(cliente);

        clienteDao.deleteCliente(cliente);

        vueloDao.addVuelo(vuelo);

        vueloDao.listadoVuelosPorDestino(1);

        vueloDao.listadoVuelosPorFecha(Date.valueOf("1-11-3000"),1);

        embarqueDao.addEmbarque(embarque);

        embarqueDao.listadoEmbarquesPorVuelo(1);

    }
}
