/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Terrain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.SearchUtil;
import static util.SearchUtil.addConstraint;

/**
 *
 * @author simob
 */
public class TerrainService extends AbstractFacade<Terrain> {

    public TerrainService() {
        super(Terrain.class);
    }
    RedevableService redevableService = new RedevableService();
//    public int ajouter(String ville,String ZoneGeo,BigDecimal surface,CategorieTerrain categorieTerrain, Date dateAchat,String cneRedevable ){

    public int ajouter(Terrain terrain) {
       if(find(terrain.getNumeroLot())==null){
           return -1;
       }
        if (terrain == null||terrain.getRedevable()==null) {
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
            }else if (terrain.getVille() == null) {
                return -2;
            } else if (terrain.getZoneGeo() == null) {
                return -3;

            } else if (terrain.getSurface().compareTo(new BigDecimal(100)) < 0||terrain.getSurface()==null) {
                return -4;
            } else if (terrain.getCategorieTerrain() == null) {
                return -5;
            }else{
                edit(terrain);
                return 1;
            }
}
 
 
}
