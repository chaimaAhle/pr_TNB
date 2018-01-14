/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author simob
 */
@Entity
public class TauxTaxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private float tauxTaxe;
    
    private int categorieHabitation; //1:zoneImmeuble 2:zoneVilla,zoneHabitatIndiv,et autres zone
    
    AVERIFIER
   
    
}
