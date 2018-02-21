/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class DeclarationTva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private boolean isValidated;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;
    @OneToOne
    private Utilisateur utilisateur;
    private String periode;
    private String annee;
    private Double taxeDue;
    private Double taxeDeductible;
    private Double taxeAverser;
    private Double taxeAreporter;
    @OneToMany
    private List<Exercice> exercices;
    @OneToOne
    private RegimeDeclaration regimeDeclaration;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeclarationTva)) {
            return false;
        }
        DeclarationTva other = (DeclarationTva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Declaration[ id=" + id + " ]";
    }

}
