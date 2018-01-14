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
import javax.persistence.ManyToOne;

/**
 *
 * @author simob
 */
@Entity
public class LigneNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int annéeNonPayé;
    
    private int nombreMoisRetard;
    
    private  float montantRetard;
    
    @ManyToOne
    private Notification notification;

    
    
    public LigneNotification() {
    }

    public LigneNotification(Long id) {
        this.id = id;
    }

    public LigneNotification(Long id, int annéeNonPayé, int nombreMoisRetard, float montantRetard) {
        this.id = id;
        this.annéeNonPayé = annéeNonPayé;
        this.nombreMoisRetard = nombreMoisRetard;
        this.montantRetard = montantRetard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnéeNonPayé() {
        return annéeNonPayé;
    }

    public void setAnnéeNonPayé(int annéeNonPayé) {
        this.annéeNonPayé = annéeNonPayé;
    }

    public int getNombreMoisRetard() {
        return nombreMoisRetard;
    }

    public void setNombreMoisRetard(int nombreMoisRetard) {
        this.nombreMoisRetard = nombreMoisRetard;
    }

    public float getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(float montantRetard) {
        this.montantRetard = montantRetard;
    }

    public Notification getNotification() {
        if(notification==null){
            Notification notification= new Notification();
        }
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final LigneNotification other = (LigneNotification) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneNotification{" + "id=" + id + ", ann\u00e9eNonPay\u00e9=" + annéeNonPayé + ", nombreMoisRetard=" + nombreMoisRetard + ", montantRetard=" + montantRetard + '}';
    }

    
    
}
