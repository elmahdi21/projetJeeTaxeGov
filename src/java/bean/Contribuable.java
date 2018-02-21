
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author medab
 */
@Entity
public class Contribuable extends Employe implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long idFiscal;
    private String motDePasse;

    public Long getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(Long idFiscal) {
        this.idFiscal = idFiscal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiscal != null ? idFiscal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribuable)) {
            return false;
        }
        Contribuable other = (Contribuable) object;
        if ((this.idFiscal == null && other.idFiscal != null) || (this.idFiscal != null && !this.idFiscal.equals(other.idFiscal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Contribuable[ idFiscal=" + idFiscal + " ]";
    }
    
}
