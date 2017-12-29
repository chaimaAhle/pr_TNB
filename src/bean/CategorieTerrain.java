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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Aniela
 */
@Entity
public class CategorieTerrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @OneToOne
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "categorieTerrain")
    private List<Terrain> terrains;
    
    @OneToOne
    private TauxTaxe tauxTaxe;
    

    public CategorieTerrain() {
    }

    public CategorieTerrain(Long id) {
        this.id = id;
    }

    public CategorieTerrain(String nom) {
        this.nom = nom;
    }


    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TauxTaxe getTauxTaxe() {
       if(tauxTaxe==null){
          TauxTaxe tauxTaxe=new TauxTaxe();
       }
        return tauxTaxe;
    }

    public void setTauxTaxe(TauxTaxe tauxTaxe) {
        this.tauxTaxe = tauxTaxe;
    }

    
    public List<Terrain> getTerrains() {
        if(terrains==null)
           terrains= new ArrayList(); 
        return terrains;
    }

    public void setTerrains(List<Terrain> terrains) {
        this.terrains = terrains;
    }
    
    public Utilisateur getUtilisateur() { 
        if(utilisateur==null){
            utilisateur=new Utilisateur();
        }
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
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
        if (!(object instanceof CategorieTerrain)) {
            return false;
        }
        CategorieTerrain other = (CategorieTerrain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategorieTerrain{" + "id=" + id + ", nom=" + nom + '}';
    }

  
}
