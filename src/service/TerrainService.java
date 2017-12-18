/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CategorieTerrain;
import bean.Redevable;
import bean.Terrain;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author simob
 */
public class TerrainService extends AbstractFacade<Terrain>{
    
    public TerrainService() {
        super(Terrain.class);
    }
    RedevableService redevableService= new RedevableService();
    public int ajouter(String ville,String ZoneGeo,BigDecimal surface,CategorieTerrain categorieTerrain, Date dateAchat,String cneRedevable ){
       if(ville==null){
            return -1;
        }else if(ZoneGeo==null){
            return -2;
        }else if (surface<100.0){
            return -3;
        }else if(categorieTerrain==null){
            return -2;
        }else{
            Terrain terrain= new Terrain(ville, ZoneGeo, surface);
            terrain.setCategorieTerrain(categorieTerrain);
            terrain.setDateAchat(dateAchat);
            terrain.setRedevable(redevableService.find(cneRedevable));
            create(terrain);
            return 1;
        }
    }
    
}
