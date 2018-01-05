/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import bean.TauxTaxe;
import bean.TaxeAnnuelle;
import bean.Terrain;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author simob
 */
public class TaxeAnnuelleService extends AbstractFacade<TaxeAnnuelle> {

    RedevableService redevableService = new RedevableService();
    TerrainService terrainService = new TerrainService();
    TauxTaxeService tauxTaxeService = new TauxTaxeService();

    public TaxeAnnuelleService() {
        super(TaxeAnnuelle.class);
    }

    public int payerAnnee(Terrain terrain) {
        if (terrain == null) {
            return -1;
        } else {
            BigDecimal tauxTaxe = terrain.getCategorieTerrain().getTauxTaxe().getTaux();
          
        }
return 1;
    }


}
