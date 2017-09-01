/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.jpa.atividade.sala.cenario1;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jose2
 */
@Embeddable
public class TrabalhaProjetoPK implements Serializable {

    @Column(name = "funn_ID")
    private String fun_ID;
    @Column(name = " jroj_ID")
    private String jroj_ID;

    public TrabalhaProjetoPK() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.fun_ID);
        hash = 29 * hash + Objects.hashCode(this.jroj_ID);
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
        final TrabalhaProjetoPK other = (TrabalhaProjetoPK) obj;
        if (!Objects.equals(this.fun_ID, other.fun_ID)) {
            return false;
        }
        if (!Objects.equals(this.jroj_ID, other.jroj_ID)) {
            return false;
        }
        return true;
    }
    
    
}
