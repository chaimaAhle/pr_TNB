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
public class CategorieTerrainService extends AbstractFacade<CategorieTerrain>{
    Utilisateur utilisateur=new Utilisateur();
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
    
    public int modify(CategorieTerrain categorieTerrain){
        if(utilisateur.isIsAdmin()==false){
            return -1;
        }else{
            edit(categorieTerrain);
            return 1;
        }    
    }  
    
//    public int remove(CategorieTerrain categorieTerrain){
//        if(!find(categorieTerrain.getId()).getTerrains().isEmpty()){
//            
//        }
//              
//        super.remove(categorieTerrain);
//    }
}
