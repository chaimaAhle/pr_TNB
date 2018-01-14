/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
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
 * @author simob
 */
@Entity
public class TaxeAnnuelle implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Redevable redevable;
    
    @ManyToOne
    private Terrain terrain;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @OneToOne
    private TauxTaxe tauxTaxe;
    
    @OneToOne
    private  TauxRetard tauxRetard;

    
    
    
    public TaxeAnnuelle() {
    }

    public TaxeAnnuelle(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Redevable getRedevable() {
       if(redevable==null){
           Redevable redevable= new Redevable();
       }
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
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

    public Date getDate() {
        if(date==null){
            Date date= new Date();
        }
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return "TaxeAnnuelle{" + "id=" + id + '}';
    }
    
   

}
