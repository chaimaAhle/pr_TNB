/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxRetard;
import bean.TaxeAnnuelle;
import bean.Terrain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public List<TaxeAnnuelle> findByTerrain(Terrain terrain) {
        List<TaxeAnnuelle> tas = new ArrayList();
        String req = "SELECT ta FROM TaxeAnnuelle ta WHERE ta.terrain='" + terrain + "'";
        tas = getEntityManager().createQuery(req).getResultList();
        return tas;
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

    public BigDecimal montantSansTR(Terrain terrain) {
        return terrain.getCategorieTerrain().getTauxTaxe().getTaux().multiply(terrain.getSurface());
    }

    public BigDecimal montantTotal(Terrain terrain, Date datePresentation, Date dateTaxe) {
        BigDecimal montant = montantSansTR(terrain);
        TauxRetard tauxRetard = tauxRetardService.findNewOne();
        int nbMois = calculMoisRetard(dateTaxe, datePresentation);
        if (nbMois < 0) {
            return new BigDecimal(-1);
        } else if (nbMois == 0) {
            return montant;
        } else if (nbMois == 1) {
            montant = montant.add(montant.multiply(tauxRetard.getPenalite().add(tauxRetard.getPremierMois())));
        } else if (nbMois > 1) {
            montant = montant.add(montant.multiply(tauxRetard.getPenalite().add(tauxRetard.getPremierMois()).add(tauxRetard.getAutreMois().multiply(new BigDecimal(nbMois)))));
        }
        return montant;
    }

    public int payerAnnee(TaxeAnnuelle taxeAnnuelle) {
        if (taxeAnnuelle == null) {
            return -1;
        } else if (taxeAnnuelle.getTauxTaxe() == null) {
            return -2;
        } else if (taxeAnnuelle.getMontant() == null) {
            return -3;
        } else if (taxeAnnuelle.getDateTaxe() == null) {
            return -4;
        } else if (taxeAnnuelle.getDatePresentaion() == null) {
            return -5;
        } else if (taxeAnnuelle.getTerrain() == null) {
            return -6;
        } else if (taxeAnnuelle.getTauxRetard() == null) {
            return -7;
        } else if (tauxRetardService.count() == 0) {
            return -8;
        } else {
            create(taxeAnnuelle);
            return 1;
        }

    }

//    private BigDecimal calculMontantTotal(){
//        
//    }
}
