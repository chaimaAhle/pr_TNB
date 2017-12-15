/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import static bean.Terrain_.utilisateur;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Aniela
 */
@Entity
public class Redevable implements Serializable {

   
    private static final long serialVersionUID = 1L;
    @Id
    private String cin;
    
    private String nom;
    
    private String prenom;

    private char sexe;

    private String adresse;
    
    private Long numTel;
    
    private Long   codePost;
    
    @OneToOne
    private Utilisateur Utilisateur;
    
    @OneToMany(mappedBy = "redevable")
    private List<Terrain> terrains;
    
    
    
    public Redevable() {
    }

    public Redevable(String cin) {
        this.cin = cin;
    }
 public Redevable(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
 
    public Redevable(String cin, String nom, String prenom, char sexe, String adresse, Long numTel, Long codePost) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.numTel = numTel;
        this.codePost = codePost;
    }

    public String getCin() {
        return cin;
    }


    public void setCin(String cin) {
        this.cin = cin;
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
       
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getNumTel() {
        return numTel;
    }

    public void setNumTel(Long numTel) {
        
        this.numTel = numTel;
    }

    public Long getCodePost() {
        return codePost;
    }

    public void setCodePost(Long codePost) {
       
        this.codePost = codePost;
    }

    public List<Terrain> getTerrains() {
          if(terrains==null){
            List<Terrain> terrains=new ArrayList<>();
        }
        return terrains;
    }

    public Utilisateur getUtilisateur() { 
        if(utilisateur==null){
            Utilisateur utilisateur=new Utilisateur();
        }
        return Utilisateur;
    }

    public void setUtilisateur(Utilisateur Utilisateur) {
        this.Utilisateur = Utilisateur;
    }

    
    

    public void setTerrains(List<Terrain> terrains) {
        this.terrains = terrains;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.cin);
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
        final Redevable other = (Redevable) obj;
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Redevable{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", adresse=" + adresse + ", numTel=" + numTel + ", codePost=" + codePost + '}';
    }
    
    
    
}

   
