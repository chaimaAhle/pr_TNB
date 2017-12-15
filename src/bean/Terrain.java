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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Aniela
 */
@Entity
public class Terrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   numeroLot;
    private String ville;
    private String ZoneGeo;
    private double surface;
    @OneToOne
    private Utilisateur utilisateur;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAchat;
    @ManyToOne
    private CategorieTerrain categorieTerrain;
    @ManyToOne
    private Redevable redevable;
    @OneToMany(mappedBy = "terrain")
    private List<TaxeAnnuelle> taxeAnnuelles;
    @OneToMany(mappedBy = "terrain")
    private List<Notification> notifications;

    public Terrain() {
    }

    public Terrain(Long numeroLot) {
        this.numeroLot = numeroLot;
    }

    public Terrain(String ville, String ZoneGeo, double surface) {
        this.ville = ville;
        this.ZoneGeo = ZoneGeo;
        this.surface = surface;
    }

    public Long getNumeroLot() {
        return numeroLot;
    }

    public void setNumeroLot(Long numeroLot) {
        this.numeroLot = numeroLot;
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
        this.surface = surface;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public CategorieTerrain getCategorieTerrain() {
        if(categorieTerrain==null)
            categorieTerrain=new CategorieTerrain();
        return categorieTerrain;
    }

    public void setCategorieTerrain(CategorieTerrain categorieTerrain) {
        this.categorieTerrain = categorieTerrain;
    }

    public Redevable getRedevable() {
       if(redevable==null)
           redevable= new Redevable();
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public List<TaxeAnnuelle> getTaxeAnnuelles() {
        if(taxeAnnuelles==null)
            taxeAnnuelles=new ArrayList<>();
        return taxeAnnuelles;
    }

    public void setTaxeAnnuelles(List<TaxeAnnuelle> taxeAnnuelles) {
        this.taxeAnnuelles = taxeAnnuelles;
    }

    public List<Notification> getNotifications() {
       if(notifications==null)
           notifications=new ArrayList<>();
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
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
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.numeroLot);
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
        return "Terrain{" + "numeroLot=" + numeroLot + ", ville=" + ville + ", ZoneGeo=" + ZoneGeo + ", surface=" + surface + '}';
    }

 
    
}
