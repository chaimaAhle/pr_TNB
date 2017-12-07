/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Aniela
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
     private int matricule;//login
    private String motDepasse;
    private String nom;
    private String prenom;
    
    public Utilisateur() {
    }

    public Utilisateur(int matricule) {
        this.matricule = matricule;
    }

    public Utilisateur(int matricule, String motDepasse, String nom, String prenom) {
        this.matricule = matricule;
        this.motDepasse = motDepasse;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur(int matricule, String motDepasse) {
        this.matricule = matricule;
        this.motDepasse = motDepasse;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.matricule);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (!Objects.equals(this.matricule, other.matricule)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utilisateur{" + "matricule=" + matricule + ", motDepasse=" + motDepasse + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
  
    
}
