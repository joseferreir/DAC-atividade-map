
package br.edu.ifpb.dac.jpa.atividade.sala.cenario2;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Oficina implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    @Embedded
    private Endereco endereco;
    private double saldo;
    @OneToMany
    private List<FuncionarioOficina> funcionarios;
    @OneToMany
    private List<Conserto> consertos;

    public Oficina(int id, Endereco endereco, double saldo, List<FuncionarioOficina> funcionarios, List<Conserto> consertos) {
        this.id = id;
        this.endereco = endereco;
        this.saldo = saldo;
        this.funcionarios = funcionarios;
        this.consertos = consertos;
    }

    public Oficina(Endereco endereco, double saldo, List<FuncionarioOficina> funcionarios, List<Conserto> consertos) {
        this.endereco = endereco;
        this.saldo = saldo;
        this.funcionarios = funcionarios;
        this.consertos = consertos;
    }

    public Oficina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<FuncionarioOficina> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioOficina> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Conserto> getConsertos() {
        return consertos;
    }

    public void setConsertos(List<Conserto> consertos) {
        this.consertos = consertos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.endereco);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.funcionarios);
        hash = 59 * hash + Objects.hashCode(this.consertos);
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
        final Oficina other = (Oficina) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.funcionarios, other.funcionarios)) {
            return false;
        }
        if (!Objects.equals(this.consertos, other.consertos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficina{" + "id=" + id + ", endereco=" + endereco + ", saldo=" + saldo + ", funcionarios=" + funcionarios + ", consertos=" + consertos + '}';
    }
    
}
