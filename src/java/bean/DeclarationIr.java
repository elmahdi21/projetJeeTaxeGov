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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class DeclarationIr implements Serializable {

    @OneToMany(mappedBy = "declarationIr")
    private List<TaxeIrEmploye> taxeIrEmployes;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    @OneToMany
    private List<Employe> employes;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeclaration;
    private Float montantIr;

    public DeclarationIr() {
    }

    public DeclarationIr(Long id) {
        this.id = id;
    }

    public DeclarationIr( Long id, Societe societe, Date dateDeclaration, Float montantIr) {
        this.id = id;
        this.societe = societe;
        this.dateDeclaration = dateDeclaration;
        this.montantIr = montantIr;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TaxeIrEmploye> getTaxeIrEmployes() {
        return taxeIrEmployes;
    }

    public void setTaxeIrEmployes(List<TaxeIrEmploye> taxeIrEmployes) {
        this.taxeIrEmployes = taxeIrEmployes;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Float getMontantIr() {
        return montantIr;
    }

    public void setMontantIr(Float montantIr) {
        this.montantIr = montantIr;
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
        if (!(object instanceof DeclarationIr)) {
            return false;
        }
        DeclarationIr other = (DeclarationIr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeclarationIr{" + "id=" + id + ", dateDeclaration=" + dateDeclaration + ", montantIr=" + montantIr + '}';
    }

    


}
