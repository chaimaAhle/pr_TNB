/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author simob
 */
@Entity
public class TauxRetard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private double penalite;
    private double pourcentagePremierMois;
    private double pourcentageAutreMois;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApplication;
    
    @OneToOne(mappedBy = "tauxRetard")
    private TaxeAnnuelle taxeAnnuelle;
    public TauxRetard() {
    }

    public TauxRetard(Long id) {
        this.id = id;
    }

    public TauxRetard(double penalite, double pourcentagePremierMois, double pourcentageAutreMois) {
        this.penalite = penalite;
        this.pourcentagePremierMois = pourcentagePremierMois;
        this.pourcentageAutreMois = pourcentageAutreMois;
    }

   

    public TaxeAnnuelle getTaxeAnnuelle() {
       if(taxeAnnuelle==null)
           taxeAnnuelle=new TaxeAnnuelle();
        return taxeAnnuelle;
    }

    public void setTaxeAnnuelle(TaxeAnnuelle taxeAnnuelle) {
        this.taxeAnnuelle = taxeAnnuelle;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPenalite() {
        return penalite;
    }

    public void setPenalite(double penalite) {
        this.penalite = penalite;
    }

    public double getPourcentagePremierMois() {
        return pourcentagePremierMois;
    }

    public void setPourcentagePremierMois(double pourcentagePremierMois) {
        this.pourcentagePremierMois = pourcentagePremierMois;
    }

    public double getPourcentageAutreMois() {
        return pourcentageAutreMois;
    }

    public void setPourcentageAutreMois(double pourcentageAutreMois) {
        this.pourcentageAutreMois = pourcentageAutreMois;
    }

    

    public Date getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(Date dateApplication) {
        this.dateApplication = dateApplication;
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
        return "TauxRetard{" + "id=" + id + ", penalite=" + penalite + ", pourcentagePremierMois=" + pourcentagePremierMois + ", pourcentageAutreMois=" + pourcentageAutreMois + '}';
    }

    

    
}
 