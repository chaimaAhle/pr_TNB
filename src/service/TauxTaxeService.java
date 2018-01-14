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

    public int ajouter(TauxTaxe tauxTaxe) {
        if (tauxTaxe == null) {
            return -1;
        } else if (tauxTaxe.getTaux() == null) {
            return -2;
        } else if (tauxTaxe.getDateApplication() == null) {
            return -3;
        } else {
            create(tauxTaxe);
            return 1;
        }
    }

    public int modifier(TauxTaxe tauxTaxe) {

        if (tauxTaxe == null) {
            return -1;
        } else if (tauxTaxe.getId() == null || !tauxTaxe.getId().equals(find(tauxTaxe.getId()).getId())) {
            return -2;
        } else if (tauxTaxe.getTaux() == null) {
            return -3;
        } else if (tauxTaxe.getDateApplication() == null) {
            return -4;
        } else {
            edit(tauxTaxe);
            return 1;
        }
    }

    public TauxTaxe findByCategorie(String nomCategorie) {
        TauxTaxe tauxTaxe = new TauxTaxe();
        String req = "SELECT tt from TauxTaxe tt where tt.categorieTerrain.nom='" + nomCategorie + "'";
        tauxTaxe = (TauxTaxe) getEntityManager().createQuery(req).getSingleResult();
        return tauxTaxe;
    }

}
