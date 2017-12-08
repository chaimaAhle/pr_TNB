/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;

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
    
    public Redevable rechercher(String cin, String nom,String prenom, char sexe, String adresse, Long numTel, Long codePost){
        
    }
}
