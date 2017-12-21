/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Aniela
 */
@Entity
public class TauxTaxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApplication;
    
    private BigDecimal taux;
    
    @OneToOne
    private CategorieTerrain categorieTerrain;
    
    @OneToMany(mappedBy = "tauxTaxe")
    private List<TaxeAnnuelle> taxeAnnuelles;
    @OneToOne
    private Utilisateur utilisateur;

    public TauxTaxe() {
    }

    public TauxTaxe(BigDecimal tauxTaxe) {
        this.taux = tauxTaxe;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }


    

    public CategorieTerrain getCategorieTerrain() {
        if(categorieTerrain==null){
            CategorieTerrain categorieTerrain=new CategorieTerrain();
        }
        return categorieTerrain;
    }

    public void setCategorieTerrain(CategorieTerrain categorieTerrain) {
        this.categorieTerrain = categorieTerrain;
    }

    public Date getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(Date dateApplication) {
        this.dateApplication = dateApplication;
    }

    public Utilisateur getUtilisateur() {
        if(utilisateur==null){
            Utilisateur utilisateur=new Utilisateur();
        }
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<TaxeAnnuelle> getTaxeAnnuelles() {
        if(taxeAnnuelles==null){
            taxeAnnuelles=new ArrayList<>();
        }
        return taxeAnnuelles;
    }

    public void setTaxeAnnuelles(List<TaxeAnnuelle> taxeAnnuelles) {
        this.taxeAnnuelles = taxeAnnuelles;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final TauxTaxe other = (TauxTaxe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
 

    
   
    
    
   
    
   
    
}
