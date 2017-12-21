/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import bean.TaxeAnnuelle;
import bean.Terrain;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author simob
 */
public class TaxeAnnuelleService extends AbstractFacade<TaxeAnnuelle> {
    RedevableService redevableService=new RedevableService();
    TerrainService terrainService= new TerrainService();
    public TaxeAnnuelleService() {
        super(TaxeAnnuelle.class);
    }
    
    public int payerAnnee(int indice, String cne, int annee, BigDecimal montant){
        if (cne==null ||cne.equals("")){
            return -1;
        }else{
            Redevable redevable=redevableService.find(cne);
            if(redevable==null){
                return -2;
            }else{
                Terrain terrain=redevable.getTerrains().get(indice);
                TaxeAnnuelle taxeAnnuelle=new TaxeAnnuelle(annee);
              //  taxeAnnuelle.setDateTaxe(new Date());
                //taxeAnnuelle.setDatePresentaion(new Date());
                taxeAnnuelle.setMontant(montant);
               // taxeAnnuelle.set
            }
            
        }
    }
    
}
