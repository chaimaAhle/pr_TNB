/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import controller.util.SearchUtil;

/**
 *
 * @author Aniela
 */
public class RedevableService extends AbstractFacade<Redevable> {

    SearchUtil serchUtil = new SearchUtil();

    public RedevableService() {
        super(Redevable.class);

    }

    public int ajouter(String cin, String nom, String prenom, char sexe, String adresse, Long numTel, Long codePost) {
        if (cin == null) {
            return -1;
        } else if (adresse == null) {
            return -2;
        } else if (numTel == null) {
            return -3;
        } else if (prenom == null) {
            return -4;
        } else if (codePost == null) {
            return -4;
        } else {
            Redevable redevable = new Redevable(cin, nom, prenom, sexe, adresse, numTel, codePost);
            create(redevable);
            return 1;
        }
    }

    public int modifier(Redevable redevable) {
        if (redevable == null) {
            return -1;
        } else if (redevable.getCin() == null) {
            return -2;
        } else if (redevable.getNom() == null) {
            return -3;
        } else if (redevable.getPrenom() == null) {
            return -4;
        } else if (redevable.getNumTel() == null) {
            return -5;
        } else if (redevable.getAdresse() == null) {
            return -6;
        }else{
            edit(redevable);
            return -1;
        }
    }
    public int supprimer(Redevable redevable){
            
        }
    
//     public Redevable findByCriteria(String cin, String nom,String prenom, String sexe, String adresse, Long numTel, Long codePost) {
//        String query ="SELECT r from Redevable where 1=1";
//        query+="SearchUtil.addConstraint('a', 'nbrPoint',nom)";
//        query+="And s.addConstraint("a", "nbrPoint",sexe);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",adresse);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",numTel);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",codePost);
//      return reloaded(query);
//    }
}
