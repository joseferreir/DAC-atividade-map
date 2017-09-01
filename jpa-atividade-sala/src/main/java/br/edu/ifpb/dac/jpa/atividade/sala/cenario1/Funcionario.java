
package br.edu.ifpb.dac.jpa.atividade.sala.cenario1;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Funcionario implements Serializable{
    @Id    
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    
    @ManyToMany()
            @JoinTable(
                    name = "TrabalhaProjeto",  
                    joinColumns
                    = @JoinColumn(name = "fun_ID"),
                    inverseJoinColumns
                    = @JoinColumn(name = "Proj_ID")
                      
                
            )
    private List<Projeto> projetos;


    public Funcionario( String nome, String cpf, String rg, double salario, List<Projeto> projetos) {
       
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.projetos = projetos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    
    
    
}
