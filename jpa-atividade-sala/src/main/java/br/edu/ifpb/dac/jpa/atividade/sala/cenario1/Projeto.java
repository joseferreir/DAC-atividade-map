
package br.edu.ifpb.dac.jpa.atividade.sala.cenario1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Projeto implements Serializable{
    
    @Id
    private int id;
    private String desccricao;
    private String area;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private List<Funcionario> funcionarios;
}
