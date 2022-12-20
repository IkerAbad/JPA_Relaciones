import dao.EjerciciosDaoImpl;
import dao.EquipoDaoImpl;
import dao.IdiomaDaoImpl;
import dao.UsuarioDaoImpl;
import models.Ejercicios;
import models.Equipo;
import models.Idioma;
import models.Usuario;


import java.sql.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        UsuarioDaoImpl usuarioDao = new UsuarioDaoImpl();
        EquipoDaoImpl equipoDao = new EquipoDaoImpl();
        IdiomaDaoImpl idiomaDao = new IdiomaDaoImpl();
        EjerciciosDaoImpl ejerciciosDao = new EjerciciosDaoImpl();

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Ejercicios ejercicios1 = new Ejercicios();
        Equipo equipo1 = new Equipo();
        Idioma idioma1 = new Idioma();

        usuario1.setNombre("Nombre1");
        usuarioDao.create(usuario2);
        usuario2.setNombre("Nombre2");
        System.out.println(usuarioDao.find(1));
        System.out.println(usuarioDao.find(2));
        System.out.println(usuarioDao.find(3));
        System.out.println(usuarioDao.find(4));
        System.out.println(usuarioDao.find(5));
        usuarioDao.find(1);
        equipoDao.find(1);
        idiomaDao.find(1);
        ejerciciosDao.find(1);

    }
}
