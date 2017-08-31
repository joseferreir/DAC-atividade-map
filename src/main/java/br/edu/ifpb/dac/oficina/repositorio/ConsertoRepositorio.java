/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.repositorio;

import br.edu.ifpb.dac.oficina.entity.Conserto;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose2
 */
public class ConsertoRepositorio implements Repositorio<Conserto> {

    @Override
    public void save(Conserto conserto) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
//        em.persist(conserto.getFuncionario());
        em.persist(conserto); 
        em.getTransaction().commit();
        
    }

    @Override
    public void remove(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Conserto conserto = em.find(Conserto.class, id);
        em.remove(conserto);
        em.getTransaction().commit();
        
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("dac_oficina_PU");
        return emf.createEntityManager();
    }

    @Override
    public Conserto find(Class type,int id) {
       EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Conserto conserto = em.find(Conserto.class, id);
        em.remove(conserto);
        em.getTransaction().commit();
        return conserto;
    }
   

}
