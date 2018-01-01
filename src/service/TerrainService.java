/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import static bean.TaxeAnnuelle_.terrain;
import bean.Terrain;
import controller.util.SearchUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author simob
 */
public class TerrainService extends AbstractFacade<Terrain> {

    public TerrainService() {
        super(Terrain.class);
    }
    RedevableService redevableService = new RedevableService();
    
    public int ajouter(Terrain terrain) {
       if(find(terrain.getNumeroLot())!=null){
           return -1;
       }
        if (terrain.getRedevable()==null) {
            return -2;
        } else {
            if (terrain.getVille() == null) {
                return -3;
            } else if (terrain.getZoneGeo() == null) {
                return -4;

            } else if (terrain.getSurface().compareTo(new BigDecimal(100)) < 0) {
                return -5;
            } else if (terrain.getCategorieTerrain() == null) {
                return -6;
            } else {
                create(terrain);
                return 1;
            }
        }
    }
    
 public int modify(Terrain terrain){
   if(terrain.getNumeroLot()==null){
           return -1;
            }else if (terrain.getRedevable().getCin() == null) {
                return -2;
            } else if (terrain.getVille() == null) {
                return -3;

            }else if (terrain.getSurface()==null){
                
                
 }else if (terrain.getSurface().compareTo(new BigDecimal(100)) < 0||terrain.getSurface()==null) {
                return -4;
            } else if (terrain.getCategorieTerrain() == null) {
                return -5;
            }else if (terrain.getDateAchat()==null ||terrain.getDateAchat().after( new Date()) ) {
                return -6;
            } else
                edit(terrain);
                return 1;
     
 }
 public List<Terrain> findByCriteria(Terrain terrain) {
        String requette = "SELECT t FROM Terrain t WHERE 1=1";
         if (terrain.getNumeroLot()!=null) {
            requette += SearchUtil.addConstraint("r", "numeroLot", "=", terrain.getNumeroLot());
        }if (terrain.getDateAchat()!=null) {
            requette += SearchUtil.addConstraint("r", "dateAchat", "=", terrain.getDateAchat());
        }if (!terrain.getVille().equals("")) {
            requette += SearchUtil.addConstraint("r", "ville", "=", terrain.getVille());
        }if (!terrain.getZoneGeo().equals("")) {
            requette += SearchUtil.addConstraint("r", "zoneGeo", "=", terrain.getZoneGeo());
        }
        System.out.println(requette);
        return getEntityManager().createQuery(requette).getResultList();
    }
  
public List<Terrain> findByRedevable(Redevable redevable) {
      String requette = "SELECT t FROM Terrain t WHERE t.redevable.cin="+redevable.getCin();
    return getEntityManager().createQuery(requette).getResultList();
}
}
