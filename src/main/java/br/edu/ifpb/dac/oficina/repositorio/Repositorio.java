/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.repositorio;

/**
 *
 * @author jose2
 */
public interface Repositorio<T> {

    T find(Class type, int id);

    void remove(int id);

    void save(T entity);
   

}
