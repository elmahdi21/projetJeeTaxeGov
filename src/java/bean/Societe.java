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

    public List<DeclarationIs> getDeclarationIss() {
        return declarationIss;
    }

    public void setDeclarationIss(List<DeclarationIs> declarationIss) {
        this.declarationIss = declarationIss;
    }

    public List<DeclarationTva> getDeclarationTvas() {
        return declarationTvas;
    }

    public void setDeclarationTvas(List<DeclarationTva> declarationTvas) {
        this.declarationTvas = declarationTvas;
    }

    public List<DeclarationIr> getDeclarationIrs() {
        return declarationIrs;
    }

    public void setDeclarationIrs(List<DeclarationIr> declarationIrs) {
        this.declarationIrs = declarationIrs;
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

    public intervaleIs getCategorie() {
        return categorie;
    }

    public void setCategorie(intervaleIs categorie) {
        this.categorie = categorie;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
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
