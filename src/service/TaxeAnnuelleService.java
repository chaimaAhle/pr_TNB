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

/**
 *
 * @author simob
 */
public class TaxeAnnuelleService extends AbstractFacade<TaxeAnnuelle> {

    RedevableService redevableService = new RedevableService();
    TerrainService terrainService = new TerrainService();
    TauxTaxeService tauxTaxeService= new TauxTaxeService();
    public TaxeAnnuelleService() {
        super(TaxeAnnuelle.class);
    }

    public int payerAnnee(Redevable r, Terrain t) {
        Redevable redevable = redevableService.findByCriteria();
        if (redevable == null) {
            return -1;
        }else if(redevable.getTerrains().isEmpty()||redevable.getTerrains()==null ||!redevable.getTerrains().contains(t)){
            return -2;
        }else{
            Terrain terrain=terrainService.find(t.getNumeroLot());
            if(terrain==null){
                return -3;
            }else{
                BigDecimal tauxTaxe=terrain.getCategorieTerrain().getTauxTaxe().getTaux();
                BigDecimal penalité=
            }
            
            
            
        }

        return 1;

    }
}
