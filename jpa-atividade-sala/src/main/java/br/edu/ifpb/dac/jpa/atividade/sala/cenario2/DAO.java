package br.edu.ifpb.dac.jpa.atividade.sala.cenario2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class DAO {

    private EntityManagerFactory factory;
    private EntityManager manager;

    public DAO() {
        this.factory = Persistence.createEntityManagerFactory("atividade-sala-jpa");
    }

    public void salvar(Conserto conserto) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(conserto);
        manager.getTransaction().commit();
        manager.close();
    }

    public void remover(Conserto conserto) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.remove(conserto);
        manager.getTransaction().commit();
        manager.close();
    }

}
