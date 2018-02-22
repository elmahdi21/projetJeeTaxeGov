/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class CategorieIS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Double benificeMin;
    private Double benificeMax;
    private Float taux;

    public CategorieIS() {
    }

    public CategorieIS(Long id) {
        this.id = id;
    }

    public CategorieIS(Double benificeMin, Double benificeMax, Float taux) {
        this.benificeMin = benificeMin;
        this.benificeMax = benificeMax;
        this.taux = taux;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public Double getBenificeMin() {
        return benificeMin;
    }

    public void setBenificeMin(Double benificeMin) {
        this.benificeMin = benificeMin;
    }

    public Double getBenificeMax() {
        return benificeMax;
    }

    public void setBenificeMax(Double benificeMax) {
        this.benificeMax = benificeMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof CategorieIS)) {
            return false;
        }
        CategorieIS other = (CategorieIS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategorieIS{" + "id=" + id + ", benificeMin=" + benificeMin + ", benificeMax=" + benificeMax + ", taux=" + taux + '}';
    }

}
