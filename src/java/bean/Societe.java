/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */
@Entity
public class Societe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String raisonSociale;
    private String siegeSociale;
    private String numTele;
    private String numFax;
    private String email;
    @OneToOne
    private Contribuable contribuable;
    @OneToMany
    private List<CompteBanquaire> compteBanquaires;
    @ManyToMany
    private List<Employe> employes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Societe(String raisonSociale, String siegeSociale, String numTele, String numFax, String email) {
        this.raisonSociale = raisonSociale;
        this.siegeSociale = siegeSociale;
        this.numTele = numTele;
        this.numFax = numFax;
        this.email = email;
    }

    public Societe(long id) {
        this.id = id;
    }

    public Societe() {
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getSiegeSociale() {
        return siegeSociale;
    }

    public void setSiegeSociale(String siegeSociale) {
        this.siegeSociale = siegeSociale;
    }

    public String getNumTele() {
        return numTele;
    }

    public void setNumTele(String numTele) {
        this.numTele = numTele;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Employe> getEmployes() {
        if (employes == null) {
            employes = new ArrayList();
        }
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Contribuable getContribuable() {
        if (contribuable == null) {
            contribuable = new Contribuable();
        }
        return contribuable;
    }

    public void setContribuable(Contribuable contribuable) {
        this.contribuable = contribuable;
    }

    public List<CompteBanquaire> getCompteBanquaires() {
        if (compteBanquaires == null) {
            compteBanquaires = new ArrayList();
        }
        return compteBanquaires;
    }

    public void setCompteBanquaires(List<CompteBanquaire> compteBanquaires) {
        this.compteBanquaires = compteBanquaires;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + id + ", raisonSociale=" + raisonSociale + ", siegeSociale=" + siegeSociale + ", numTele=" + numTele + ", numFax=" + numFax + ", email=" + email + '}';
    }

}
