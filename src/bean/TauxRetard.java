/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Aniela
 */
@Entity
public class TauxRetard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private BigDecimal penalite;
    private BigDecimal premierMois;
    private BigDecimal autreMois;
    @OneToOne
    private Utilisateur utilisateur;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApplication;
    


    public TauxRetard() {
    }

    public TauxRetard(Long id) {
        this.id = id;
    }

    public TauxRetard(BigDecimal penalite, BigDecimal pourcentagePremierMois, BigDecimal pourcentageAutreMois) {
        this.penalite = penalite;
        this.premierMois = pourcentagePremierMois;
        this.autreMois = pourcentageAutreMois;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPenalite() {
        return penalite;
    }

    public void setPenalite(BigDecimal penalite) {
        this.penalite = penalite;
    }

    public BigDecimal getPremierMois() {
        return premierMois;
    }

    public void setPremierMois(BigDecimal PremierMois) {
        this.premierMois = PremierMois;
    }

    public BigDecimal getAutreMois() {
        return autreMois;
    }

    public void setAutreMois(BigDecimal AutreMois) {
        this.autreMois = AutreMois;
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

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TauxRetard)) {
            return false;
        }
        TauxRetard other = (TauxRetard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TauxRetard{" + "penalite=" + penalite + ", premierMois=" + premierMois + ", autreMois=" + autreMois + ", dateApplication=" + dateApplication + '}';
    }

   
}
 