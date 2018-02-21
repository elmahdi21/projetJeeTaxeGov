/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author User
 */
@Entity
public class Societe implements Serializable {

    @OneToMany(mappedBy = "societe")
    private List<DeclarationIs> declarationIss;

    @OneToMany(mappedBy = "societe")
    private List<DeclarationTva> declarationTvas;

    @OneToMany(mappedBy = "societe")
    private List<DeclarationIr> declarationIrs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String raisonSociale;
    private String siegeSociale;
    private String numTele;
    private String numFax;
    private String email;
    @ManyToOne
    private intervaleIs categorie;
    @ManyToOne
    private List<Employe> employes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Societe(long id) {
        this.id = id;
    }

    public Societe() {
    }

    public Societe(List<DeclarationIs> declarationIss, List<DeclarationTva> declarationTvas, List<DeclarationIr> declarationIrs, long id, String raisonSociale, String siegeSociale, String numTele, String numFax, String email, intervaleIs categorie, List<Employe> employes) {
        this.declarationIss = declarationIss;
        this.declarationTvas = declarationTvas;
        this.declarationIrs = declarationIrs;
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.siegeSociale = siegeSociale;
        this.numTele = numTele;
        this.numFax = numFax;
        this.email = email;
        this.categorie = categorie;
        this.employes = employes;
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
