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
 * @author User
 */
@Entity
public class Utilisateur extends Employe implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFiscale;
    private String droitFiscale;
    private String motDePasse;

    public Long getIdFiscale() {
        return idFiscale;
    }

    public void setIdFiscale(Long idFiscale) {
        this.idFiscale = idFiscale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiscale != null ? idFiscale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idFiscale == null && other.idFiscale != null) || (this.idFiscale != null && !this.idFiscale.equals(other.idFiscale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Utilisateur[ idFiscale=" + idFiscale + " ]";
    }

}
