/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */
@Entity
public class Exercice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long montant;
    @OneToOne
    private CategorieTVA categorieTVA;

    public Exercice() {
    }

    public Exercice(Long id, Long montant, CategorieTVA categorieTVA) {
        this.id = id;
        this.montant = montant;
        this.categorieTVA = categorieTVA;
    }

    public Exercice(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public CategorieTVA getCategorieTVA() {
        return categorieTVA;
    }

    public void setCategorieTVA(CategorieTVA categorieTVA) {
        this.categorieTVA = categorieTVA;
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
        if (!(object instanceof Exercice)) {
            return false;
        }
        Exercice other = (Exercice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exercice{" + "id=" + id + ", montant=" + montant + '}';
    }

    
    

   
}
