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
    private TauxIs tauxIs;
    @OneToMany
    private List<Exercice> exercices;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeclaration;
    @OneToOne
    private RegimeDeclaration regimeDeclaration;
    private Float gains;
    private Float charges;
    private Float montantIs; // = gains - charges

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeclarationIs() {
    }

    public DeclarationIs(Long id) {
        this.id = id;
    }

    public DeclarationIs(Long id, Societe societe, TauxIs tauxIs,  Date dateDeclaration, RegimeDeclaration regimeDeclaration, Float gains, Float charges, Float montantIs) {
        this.id = id;
        this.societe = societe;
        this.tauxIs = tauxIs;
        this.dateDeclaration = dateDeclaration;
        this.regimeDeclaration = regimeDeclaration;
        this.gains = gains;
        this.charges = charges;
        this.montantIs = montantIs;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public TauxIs getTauxIs() {
        return tauxIs;
    }

    public void setTauxIs(TauxIs tauxIs) {
        this.tauxIs = tauxIs;
    }

    public List<Exercice> getExercices() {
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

    public RegimeDeclaration getRegimeDeclaration() {
        return regimeDeclaration;
    }

    public void setRegimeDeclaration(RegimeDeclaration regimeDeclaration) {
        this.regimeDeclaration = regimeDeclaration;
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
        return "DeclarationIs{" + "id=" + id + ", dateDeclaration=" + dateDeclaration + ", gains=" + gains + ", charges=" + charges + ", montantIs=" + montantIs + '}';
    }

    

}
