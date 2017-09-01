/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.principal;

import br.edu.ifpb.dac.oficina.entity.Conserto;
import br.edu.ifpb.dac.oficina.entity.Endereco;
import br.edu.ifpb.dac.oficina.entity.Funcionario;
import br.edu.ifpb.dac.oficina.entity.FuncionarioType;
import br.edu.ifpb.dac.oficina.entity.Oficina;
import br.edu.ifpb.dac.oficina.repositorio.ConsertoRepositorio;
import br.edu.ifpb.dac.oficina.repositorio.FuncionarioRepositorio;
import br.edu.ifpb.dac.oficina.repositorio.OficinaRepositorio;
import br.edu.ifpb.dac.oficina.repositorio.Repositorio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose2
 */
public class Main {

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        Funcionario gerente = new Funcionario("Chaves", "123.124.145-21", "4000", 2500, FuncionarioType.GERENTE);
        Funcionario empegado = new Funcionario("Quico", "253.164.175-71", "2600", 2500, FuncionarioType.EMPREGADO);
       
        Endereco endereco = new Endereco("otavio Mariz", "Marizopolis", "cento");
       
        List<Funcionario> funcionarios = new ArrayList<>();
       
        Oficina oficina = new Oficina("Oficina de carros de luxo", endereco, 0, funcionarios);
       
        Conserto conserto = new Conserto(LocalDate.now(), 1200, empegado);
        Conserto conserto2 = new Conserto(LocalDate.of(2017, 04, 03), 1200, gerente);
      
        Repositorio<Conserto> dao = new ConsertoRepositorio();
        Repositorio<Funcionario> daoF = new FuncionarioRepositorio();
        Repositorio<Oficina> daoOf = new OficinaRepositorio();
      
        daoF.save(gerente);
        daoF.save(empegado);
        
        funcionarios.add(gerente);
        funcionarios.add(empegado);
        
        dao.save(conserto);
        dao.save(conserto2);
        daoOf.save(oficina);
        dao.remove(3);

    }

}
