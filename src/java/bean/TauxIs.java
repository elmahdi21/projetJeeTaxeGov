/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class TauxIs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private intervaleIs categorie;
    private Float taux;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApp;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TauxIs() {
    }

    public TauxIs(Long id) {
        this.id = id;
    }

    public TauxIs(Long id, intervaleIs categorie, Float taux, Date dateApp) {
        this.id = id;
        this.categorie = categorie;
        this.taux = taux;
        this.dateApp = dateApp;
    }

    public intervaleIs getCategorie() {
        return categorie;
    }

    public void setCategorie(intervaleIs categorie) {
        this.categorie = categorie;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public Date getDateApp() {
        return dateApp;
    }

    public void setDateApp(Date dateApp) {
        this.dateApp = dateApp;
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
        if (!(object instanceof TauxIs)) {
            return false;
        }
        TauxIs other = (TauxIs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TauxIs{" + "id=" + id + ", taux=" + taux + ", dateApp=" + dateApp + '}';
    }

   
}
