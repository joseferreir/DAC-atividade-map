/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.repositorio;

import br.edu.ifpb.dac.oficina.entity.Funcionario;
import br.edu.ifpb.dac.oficina.entity.Oficina;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose2
 */
public class OficinaRepositorio implements Repositorio<Oficina>{

    @Override
    public void remove(int id) {
         EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Oficina oficina = em.find(Oficina.class, id);
        em.remove(oficina);
        em.getTransaction().commit();
    }

    @Override
    public void save(Oficina entity) {
         EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }
  
    private EntityManager getEntityManager() {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("dac_oficina_PU");
        return emf.createEntityManager();
    }
    
    @Override
    public Oficina find(Class type, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Oficina oficina = em.find(Oficina.class, id);
        em.getTransaction().commit();
        return oficina;
    }
}