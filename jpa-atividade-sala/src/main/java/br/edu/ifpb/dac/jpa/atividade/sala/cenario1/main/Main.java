/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.jpa.atividade.sala.cenario1.main;

import br.edu.ifpb.dac.jpa.atividade.sala.cenario1.Funcionario;
import br.edu.ifpb.dac.jpa.atividade.sala.cenario1.Projeto;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose2
 */
public class Main {
    public static void main(String[] args) {
        List<Funcionario> fs = new ArrayList<>();
         List<Projeto> ps = new ArrayList<>();
        Funcionario f = new Funcionario("jose", "12345", "3245", 100, ps);
        
        Projeto p = new Projeto("pro", "a2", LocalDate.now(), LocalDate.of(2017, Month.DECEMBER, 12), fs);
        fs.add(f);
        ps.add(p);
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-atividade-sala");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(f);
        em.persist(p);
        em.getTransaction().commit();
        
       
    }
    
}
