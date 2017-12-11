/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

/**
 *
 * @author Aniela
 */
public class RedevableService extends AbstractFacade<Redevable>{
    
    public RedevableService() {
        super(Redevable.class);
        
    }
    public int ajouter(String cin,String nom,String prenom,char sexe,String adresse,Long numTel,Long codePost){
        Redevable redevable=new Redevable(cin, nom, prenom, sexe, adresse, numTel, codePost);
        create(redevable);
        return 1;
        }

//     public Redevable findByCriteria(String cin, String nom,String prenom, String sexe, String adresse, Long numTel, Long codePost) {
        String query ="SELECT r from Redevable where 1=1";
//        query +=SearchUtil.addConstraint("a", "nbrPoint", "=", cin);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",nom);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",sexe);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",adresse);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",numTel);
//        query+=SearchUtil.addConstraint("a", "nbrPoint",codePost);
//      return reloaded(query);
//    }
    }
