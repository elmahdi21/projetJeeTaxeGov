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

/**
 *
 * @author User
 */
@Entity
public class intervaleIs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double mini;
    private Double maxi;

    public intervaleIs() {
    }

    public intervaleIs(Long id) {
        this.id = id;
    }

    public intervaleIs(Long id, Double mini, Double maxi) {
        this.id = id;
        this.mini = mini;
        this.maxi = maxi;
    }

    public Double getMini() {
        return mini;
    }

    public void setMini(Double mini) {
        this.mini = mini;
    }

    public Double getMaxi() {
        return maxi;
    }

    public void setMaxi(Double maxi) {
        this.maxi = maxi;
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
        if (!(object instanceof intervaleIs)) {
            return false;
        }
        intervaleIs other = (intervaleIs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "intervaleIs{" + "id=" + id + ", mini=" + mini + ", maxi=" + maxi + '}';
    }

  

}
