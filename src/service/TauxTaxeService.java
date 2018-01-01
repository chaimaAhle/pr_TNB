/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CategorieTerrain;
import bean.TauxTaxe;
import bean.Utilisateur;
import java.math.BigDecimal;
import java.util.Date;
import util.Session;

/**
 *
 * @author simob
 */
public class TauxTaxeService extends AbstractFacade<TauxTaxe> {

    CategorieTerrainService categorieTerrainService = new CategorieTerrainService();

    public TauxTaxeService() {
        super(TauxTaxe.class);
    }
    public int ajouter(TauxTaxe tauxTaxe)
     {
        if (tauxTaxe == null) {
            return -1;
        } 
        else if (tauxTaxe.getTaux()== null) {
            return -2;
        }else{
            tauxTaxe.setDateApplication(new Date());
            
            tauxTaxe.setUtilisateur((Utilisateur) Session.getAttribut("connectedUser"));
            create(tauxTaxe);
                return 1;
            }
        }
    

    public int modifier(BigDecimal nvTaux, Long id) {
        if (id == null) {
            return -1;
        } else if (nvTaux == null) {
            return -2;
        } else {
            TauxTaxe tauxTaxe = find(id);
            if (tauxTaxe == null) {
                return -3;
            } else {
                tauxTaxe.setDateApplication(new Date());
                tauxTaxe.setTaux(nvTaux);
                tauxTaxe.setUtilisateur((Utilisateur) Session.getAttribut("connectedUser"));

                edit(tauxTaxe);
                return 1;
            }
        }
    }
    
    public TauxTaxe findByCategorie(String nomCategorie){
        TauxTaxe tauxTaxe=new TauxTaxe();
        String req="SELECT tt from TauxTaxe tt where tt.categorieTerrain.nom='"+nomCategorie+"'";
        tauxTaxe=(TauxTaxe)getEntityManager().createQuery(req).getSingleResult();
        return tauxTaxe;
    }
    
}
