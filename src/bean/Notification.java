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
public class Notification implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int type;
    private float  montantEstime;
    
    private int annee;
    @OneToOne
    private Utilisateur utilisateur;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEnvoi;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateReception;
    
    @ManyToOne
    private Terrain terrain;
    
    @OneToMany(mappedBy = "notification")
    private List<LigneNotification> ligneNotifications;

    
    
    
    public Notification() {
    }

    public Notification(Long id) {
        this.id = id;
    }

    public Notification(Long id, float montantEstimé, int année) {
        this.id = id;
        this.montantEstime = montantEstimé;
        this.annee = année;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMontantEstime() {
        return montantEstime;
    }

    public void setMontantEstime(float montantEstime) {
       if(montantEstime>0)
        this.montantEstime = montantEstime;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
       if(annee>0)
        this.annee = annee;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
    public Date getDateEnvoi() {
        if(dateEnvoi==null){
            Date dateEnvoi= new Date();
        }
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateReception() {
        if(dateReception==null){
            Date dateRéception= new Date();
        }
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Terrain getTerrain() {
        if(terrain==null){
            Terrain terrain= new Terrain();
        }
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public List<LigneNotification> getLigneNotifications() {
        if(ligneNotifications==null){
            List<LigneNotification> ligneNotifications= new ArrayList<>();
        }
        return ligneNotifications;
    }

    public void setLigneNotifications(List<LigneNotification> ligneNotifications) {
        this.ligneNotifications = ligneNotifications;
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
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final Notification other = (Notification) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notification{" + "id=" + id + ", montantEstim\u00e9=" + montantEstime + ", ann\u00e9e=" + annee + '}';
    }
    
    
    
    
}
