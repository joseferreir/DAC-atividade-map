/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.repositorio;

import br.edu.ifpb.dac.oficina.entity.Conserto;
import br.edu.ifpb.dac.oficina.entity.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose2
 */
public class FuncionarioRepositorio implements Repositorio<Funcionario> {
    
    @Override
    public void remove(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Funcionario funcionario = em.find(Funcionario.class, id);
        em.remove(funcionario);
        em.getTransaction().commit();
    }
    
    @Override
    public void save(Funcionario funcionario) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("dac_oficina_PU");
        return emf.createEntityManager();
    }
    
    @Override
    public Funcionario find(Class type, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Funcionario funcionario = em.find(Funcionario.class, id);
        em.getTransaction().commit();
        return funcionario;
    }
    
}
