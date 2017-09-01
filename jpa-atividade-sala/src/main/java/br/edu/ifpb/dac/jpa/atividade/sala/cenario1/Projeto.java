
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
    @ManyToMany
    private List<Funcionario> funcionarios;

    public Projeto( String desccricao, String area, LocalDate dataInicio, LocalDate dataConclusao, List<Funcionario> funcionarios) {
        this.id = id;
        this.desccricao = desccricao;
        this.area = area;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.funcionarios = funcionarios;
    }
    
}
