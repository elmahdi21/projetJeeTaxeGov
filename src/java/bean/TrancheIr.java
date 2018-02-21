
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
public class TrancheIr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long mini;
    private Long maxi;
    private Float taux;

    public TrancheIr() {
    }

    public TrancheIr(Long id) {
        this.id = id;
    }

    public TrancheIr(Long id, Long mini, Long maxi, Float taux) {
        this.id = id;
        this.mini = mini;
        this.maxi = maxi;
        this.taux = taux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMini() {
        return mini;
    }

    public void setMini(Long mini) {
        this.mini = mini;
    }

    public Long getMaxi() {
        return maxi;
    }

    public void setMaxi(Long maxi) {
        this.maxi = maxi;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
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
        if (!(object instanceof TrancheIr)) {
            return false;
        }
        TrancheIr other = (TrancheIr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheIr{" + "id=" + id + ", mini=" + mini + ", maxi=" + maxi + ", taux=" + taux + '}';
    }

}
