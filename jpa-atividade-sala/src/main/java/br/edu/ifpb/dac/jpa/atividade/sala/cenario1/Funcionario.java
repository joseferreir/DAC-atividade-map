
package br.edu.ifpb.dac.jpa.atividade.sala.cenario1;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Edilva
 */
@Entity
public class Funcionario implements Serializable{
    
    @Id
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private List<Projeto> projetos;
}
