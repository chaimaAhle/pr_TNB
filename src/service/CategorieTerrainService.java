/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CategorieTerrain;
import bean.Utilisateur;
import util.Session;

/**
 *
 * @author simob
 */
class CategorieTerrainService extends AbstractFacade<CategorieTerrain>{
    
    public CategorieTerrainService() {
        super(CategorieTerrain.class);
    }
    
    public int ajouter(String nom){
        if (nom==null) {
            return -1;
        }else{
            CategorieTerrain categorieTerrain=new CategorieTerrain(nom);
            categorieTerrain.setUtilisateur((Utilisateur)Session.getAttribut("connectedUser"));
            create(categorieTerrain);
            return 1;
        }
    }
}
