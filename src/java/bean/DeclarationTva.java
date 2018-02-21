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

    public DeclarationTva() {
    }

    public DeclarationTva(String id) {
        this.id = id;
    }

    public DeclarationTva(String id, boolean isValidated, Date dateCreation, Utilisateur utilisateur, String periode, String annee, Double taxeDue, Double taxeDeductible, Double taxeAverser, Double taxeAreporter, List<Exercice> exercices, RegimeDeclaration regimeDeclaration) {
        this.id = id;
        this.isValidated = isValidated;
        this.dateCreation = dateCreation;
        this.utilisateur = utilisateur;
        this.periode = periode;
        this.annee = annee;
        this.taxeDue = taxeDue;
        this.taxeDeductible = taxeDeductible;
        this.taxeAverser = taxeAverser;
        this.taxeAreporter = taxeAreporter;
        this.exercices = exercices;
        this.regimeDeclaration = regimeDeclaration;
    }

    public boolean isIsValidated() {
        return isValidated;
    }

    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Double getTaxeDue() {
        return taxeDue;
    }

    public void setTaxeDue(Double taxeDue) {
        this.taxeDue = taxeDue;
    }

    public Double getTaxeDeductible() {
        return taxeDeductible;
    }

    public void setTaxeDeductible(Double taxeDeductible) {
        this.taxeDeductible = taxeDeductible;
    }

    public Double getTaxeAverser() {
        return taxeAverser;
    }

    public void setTaxeAverser(Double taxeAverser) {
        this.taxeAverser = taxeAverser;
    }

    public Double getTaxeAreporter() {
        return taxeAreporter;
    }

    public void setTaxeAreporter(Double taxeAreporter) {
        this.taxeAreporter = taxeAreporter;
    }

    public List<Exercice> getExercices() {
        return exercices;
    }

    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    public RegimeDeclaration getRegimeDeclaration() {
        return regimeDeclaration;
    }

    public void setRegimeDeclaration(RegimeDeclaration regimeDeclaration) {
        this.regimeDeclaration = regimeDeclaration;
    }
    
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
        return "DeclarationTva{" + "id=" + id + ", isValidated=" + isValidated + ", dateCreation=" + dateCreation + ", periode=" + periode + ", annee=" + annee + ", taxeDue=" + taxeDue + ", taxeDeductible=" + taxeDeductible + ", taxeAverser=" + taxeAverser + ", taxeAreporter=" + taxeAreporter + '}';
    }


}
