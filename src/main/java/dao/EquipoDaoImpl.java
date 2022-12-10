package dao;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Vuelo;

import java.sql.Date;
import java.util.List;

public class VueloDaoImpl extends Dao<Vuelo, Integer> implements iVueloDao {

    @Override
    public Vuelo find(Integer id) {
        return getEntityManager().find(Vuelo.class,id);
    }

    @Override
    public Vuelo addVuelo(Vuelo vuelo){
        return this.create(vuelo);
    }

    @Override
    public List<Vuelo> listadoVuelosPorDestino(Integer aeropuerto_destino_id){
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        String query= "select t from Vuelo t where t.aeropuerto_destino.id=:aeropuerto_destino_id AND (t.fecha_salida>=CURRENT_DATE)";
        Query query1=em.createQuery(query);
        query1.setParameter("aeropuerto_destino_id",aeropuerto_destino_id);
        List <Vuelo> vuelos= query1.getResultList();
        return vuelos;
    }

    @Override
    public List<Vuelo> listadoVuelosPorFecha(Date fecha_salida, Integer aeropuerto_salida_id){
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        String query= "select t from Vuelo t where t.aeropuerto_origen.id=:aeropuerto_salida_id AND t.fecha_salida=:fecha_salida";
        Query query1=em.createQuery(query);
        Query query2=em.createQuery(query);
        query1.setParameter("aeropuerto_salida_id",aeropuerto_salida_id);
        query2.setParameter("fecha_salida",fecha_salida);
        List <Vuelo> vuelos= query1.getResultList();
        return vuelos;
    }

}
