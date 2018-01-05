/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxRetard;
import bean.TaxeAnnuelle;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author simob
 */
public class TaxeAnnuelleService extends AbstractFacade<TaxeAnnuelle> {

    RedevableService redevableService = new RedevableService();
    TerrainService terrainService = new TerrainService();
    TauxTaxeService tauxTaxeService = new TauxTaxeService();
    TauxRetardService tauxRetardService = new TauxRetardService();

    public TaxeAnnuelleService() {
        super(TaxeAnnuelle.class);
    }

    public Date findLastDateTauxRetard() {
        String req = "Select max(dateApplication) from TauxRetard";
        Date dateTauxRetard = (Date) getEntityManager().createNativeQuery(req).getSingleResult();
        return dateTauxRetard;
    }
    
    public int nbMoisRetard(TaxeAnnuelle taxeAnnuelle){
        if (taxeAnnuelle==null){
            return -1;
        }else if(taxeAnnuelle.getDatePresentaion()==null){
            return -2;
        }else if(taxeAnnuelle.getDateTaxe()==null){
            return -3;
        }else{
           Date presentation=taxeAnnuelle.getDatePresentaion();
           Date taxe=taxeAnnuelle.getDateTaxe();
           
        }
    }
    
    public int payerAnnee(TaxeAnnuelle taxeAnnuelle) {
        if (taxeAnnuelle == null) {
            return -1;
        } else if (taxeAnnuelle.getTerrain().getCategorieTerrain().getTauxTaxe().getTaux() == null) {
            return -2;
        } else if (tauxRetardService.count() == 0) {
            return -3;
        } else {
            BigDecimal taux = taxeAnnuelle.getTerrain().getCategorieTerrain().getTauxTaxe().getTaux();
            Date dateApplication = findLastDateTauxRetard();
            TauxRetard tauxRetard = tauxRetardService.findByDateApplication(dateApplication);
            BigDecimal montantSansRetard = taxeAnnuelle.getTerrain().getSurface().multiply(taux);
            
            
            
        }
        return 1;
    }

}
