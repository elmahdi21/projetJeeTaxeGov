/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class DeclarationIs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    @OneToOne
    private CategorieIS categorieIS;
    @OneToMany
    private List<Exercice> exercices;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeclaration;
    private int type;
    private Float gains;
    private Float charges;
    private Float montantIs; // = gains - charges

    public DeclarationIs() {
    }

    public DeclarationIs(Long id) {
        this.id = id;
    }

    public DeclarationIs(Date dateDeclaration, int type, Float gains, Float charges, Float montantIs) {
        this.dateDeclaration = dateDeclaration;
        this.type = type;
        this.gains = gains;
        this.charges = charges;
        this.montantIs = montantIs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Societe getSociete() {
        if (societe == null) {
            societe = new Societe();
        }
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public List<Exercice> getExercices() {
        if (exercices == null) {
            exercices = new ArrayList();
        }
        return exercices;
    }

    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Float getGains() {
        return gains;
    }

    public void setGains(Float gains) {
        this.gains = gains;
    }

    public Float getCharges() {
        return charges;
    }

    public void setCharges(Float charges) {
        this.charges = charges;
    }

    public Float getMontantIs() {
        return montantIs;
    }

    public void setMontantIs(Float montantIs) {
        this.montantIs = montantIs;
    }

    public CategorieIS getCategorieIS() {
        if (categorieIS == null) {
            categorieIS = new CategorieIS();
        }
        return categorieIS;
    }

    public void setCategorieIS(CategorieIS categorieIS) {
        this.categorieIS = categorieIS;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        if (!(object instanceof DeclarationIs)) {
            return false;
        }
        DeclarationIs other = (DeclarationIs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeclarationIs{" + "id=" + id + ", dateDeclaration=" + dateDeclaration + ", type=" + type + ", gains=" + gains + ", charges=" + charges + ", montantIs=" + montantIs + '}';
    }

}
