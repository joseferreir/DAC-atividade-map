/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.oficina.entity;

/**
 *
 * @author jose2
 */
public enum FuncionarioType {
   EMPREGADO("EMPREGADO"), GERENTE("GERENTE");
    public String cargo;

    private FuncionarioType (String cargo) {
        this.cargo = cargo;
    }
    
}
