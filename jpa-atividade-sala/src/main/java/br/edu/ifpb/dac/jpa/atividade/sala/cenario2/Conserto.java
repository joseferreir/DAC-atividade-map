
package br.edu.ifpb.dac.jpa.atividade.sala.cenario2;

import br.edu.ifpb.dac.jpa.atividade.sala.util.ConvertLocalDate;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Conserto implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private double valor;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate dataConserto;
    @OneToOne
    private FuncionarioOficina funcionario;

    public Conserto(int id, double valor, LocalDate dataConserto, FuncionarioOficina funcionario) {
        this.id = id;
        this.valor = valor;
        this.dataConserto = dataConserto;
        this.funcionario = funcionario;
    }

    public Conserto(double valor, LocalDate dataConserto, FuncionarioOficina funcionario) {
        this.valor = valor;
        this.dataConserto = dataConserto;
        this.funcionario = funcionario;
    }

    public Conserto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(LocalDate dataConserto) {
        this.dataConserto = dataConserto;
    }

    public FuncionarioOficina getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioOficina funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.dataConserto);
        hash = 97 * hash + Objects.hashCode(this.funcionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conserto other = (Conserto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.dataConserto, other.dataConserto)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conserto{" + "id=" + id + ", valor=" + valor + ", dataConserto=" + dataConserto + ", funcionario=" + funcionario + '}';
    }
    
}
