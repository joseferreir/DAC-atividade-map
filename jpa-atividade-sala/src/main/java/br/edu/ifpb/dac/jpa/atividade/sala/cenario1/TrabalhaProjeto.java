package br.edu.ifpb.dac.jpa.atividade.sala.cenario1;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author Edilva
 */
@Entity
@IdClass(TrabalhaProjetoPK.class)
public class TrabalhaProjeto implements Serializable {

    @Column(name = "funn_ID")
    private String fun_ID;
    @Column(name = " jroj_ID")
    private String jroj_ID;

    private int horasTrabalhadas;
    @Convert
    private LocalDate dataIngresso;

    public TrabalhaProjeto() {
    }

    @Id
    public String getFun_ID() {
        return fun_ID;
    }

    public void setFun_ID(String fun_ID) {
        this.fun_ID = fun_ID;
    }

    @Id
    public String getJroj_ID() {
        return jroj_ID;
    }

    public void setJroj_ID(String jroj_ID) {
        this.jroj_ID = jroj_ID;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

}
