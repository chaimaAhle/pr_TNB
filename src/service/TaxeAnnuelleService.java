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
    
    public int calculMoisRetard(Date taxe, Date presentation) {
        if (presentation == null) {
            return -1;
        } else if (taxe == null) {
            return -2;
        } else {
            int nbMois = (int) ((presentation.getTime() - taxe.getTime()) / (1000 * 60 * 60 * 24 * 30));
            return nbMois;
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
            BigDecimal montant = taxeAnnuelle.getTerrain().getSurface().multiply(taux);
            int nbMois = calculMoisRetard(taxeAnnuelle.getDatePresentaion(), taxeAnnuelle.getDateTaxe());
            if (nbMois < 0) {
                return -4;
            } else if (nbMois==1) {
                montant=montant.add(montant.multiply(tauxRetard.getPenalite().add(tauxRetard.getPremierMois())));
            }else if(nbMois>1){
                montant=montant.add(montant.multiply(tauxRetard.getPenalite().add(tauxRetard.getPremierMois()).add(tauxRetard.getAutreMois().multiply(new BigDecimal(nbMois)))));
            }

        }
        return 1;
    }

//    private BigDecimal calculMontantTotal(){
//        
//    }
    
}
