/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author simob
 */
@Entity
public class Terrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroLot;
    private int categorieHabitation; //1:zoneImmeuble 2:zoneVilla,zoneHabitatIndiv,et autres zone
    private String ville;
    private String ZoneGeo;
    private double surface;
    private Date dateAchat;
    @ManyToOne
    private Redevable redevable;
    @OneToMany(mappedBy = "terrain")
    private List<TaxeAnnuelle> taxeAnnuelle;
    @OneToMany(mappedBy = "terrain")
    private List<Notification> notifications;

    public Terrain() {
    }

    public Terrain(Long nLot) {
        this.numeroLot = nLot;
    }

    public Terrain(Long numeroLot, int categorieHabitation, String ville, String ZoneGeo, double surface, Date dateAchat, Redevable redevable) {
        this.numeroLot = numeroLot;
        this.categorieHabitation = categorieHabitation;
        this.ville = ville;
        this.ZoneGeo = ZoneGeo;
        this.surface = surface;
        this.dateAchat = dateAchat;
        this.redevable = redevable;
    }

    public Terrain(int categorieHabitation) {
        this.categorieHabitation = categorieHabitation;
    }

    public Terrain(String ville, String ZoneGeo) {
        this.ville = ville;
        this.ZoneGeo = ZoneGeo;
    }

    public Long getnLot() {
        return numeroLot;
    }

    public void setnLot(Long numeroLot) {
        this.numeroLot = numeroLot;
    }

    public int getCategorieHabitation() {
        return categorieHabitation;
    }

    public void setCategorieHabitation(int categorieHabitation) {
       if(categorieHabitation==1 ||categorieHabitation==2)
        this.categorieHabitation = categorieHabitation;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getZoneGeo() {
        return ZoneGeo;
    }

    public void setZoneGeo(String ZoneGeo) {
        this.ZoneGeo = ZoneGeo;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
       if(surface>0)
        this.surface = surface;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Redevable getRedevable() {
        if(redevable==null){
            redevable= new Redevable();
        }
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public List<TaxeAnnuelle> getTaxeAnnuelle() {
       if(taxeAnnuelle==null){
           taxeAnnuelle= new ArrayList<>();
       }
        return taxeAnnuelle;
    }

    public void setTaxeAnnuelle(List<TaxeAnnuelle> taxeAnnuelle) {
        this.taxeAnnuelle = taxeAnnuelle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.numeroLot);
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
        final Terrain other = (Terrain) obj;
        if (!Objects.equals(this.numeroLot, other.numeroLot)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Terrain{" + "nLot=" + numeroLot + ", categorieHabitation=" + categorieHabitation + ", ville=" + ville + ", ZoneGeo=" + ZoneGeo + ", surface=" + surface + ", dateAchat=" + dateAchat + '}';
    }


    
    
    
   
    
}
