/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Aniela
 */
@Entity
public class TaxeAnnuelle implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int annee;
   private BigDecimal montant; 

     @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateTaxe;
     
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentaion;
    
    @ManyToOne
    private Terrain terrain;
    
    @ManyToOne
    private TauxTaxe tauxTaxe;
      
    @OneToOne
    private  TauxRetard tauxRetard;
    
    @OneToOne
   private Utilisateur utilisateur;

    
    
    
    
    public TaxeAnnuelle() {
    }

    public TaxeAnnuelle(Long id) {
        this.id = id;
    }

    public TaxeAnnuelle(int annee) {
        this.annee = annee;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Date getDatePresentaion() {
        return datePresentaion;
    }

    public void setDatePresentaion(Date datePresentaion) {
        this.datePresentaion = datePresentaion;
    }

    
    public Terrain getTerrain() {
        if(terrain==null){
            Terrain terrain=new Terrain();
        }
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Date getDateTaxe() {
        if(dateTaxe==null){
            Date date= new Date();
        }
        return dateTaxe;
    }

    public void setDateTaxe(Date dateTaxe) {
        this.dateTaxe = dateTaxe;
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

    public TauxRetard getTauxRetard() {
        if(tauxRetard==null){
            TauxRetard tauxRetard=new TauxRetard();
        }
        return tauxRetard;
    }

    public void setTauxRetard(TauxRetard tauxRetard) {
        this.tauxRetard = tauxRetard;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
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
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final TaxeAnnuelle other = (TaxeAnnuelle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxeAnnuelle{" + "id=" + id + ", annee=" + annee + '}';
    }

 
   

}
