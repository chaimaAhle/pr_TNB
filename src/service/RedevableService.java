/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simob
 */
public class RedevableService extends AbstractFacade<Redevable>{
    
    public RedevableService() {
        super(Redevable.class);
        
    }
    public int ajouter(String cin,String nom,String prenom,char sexe,String adresse,Long numTel,Long codePost){
        if(cin==null){
            return -1;
        }else if(adresse==null){
            return -2;
        }else if(numTel==null){
            return -3;
        }else if (prenom==null){
            return -4;
        }else if (codePost==null){
            return -4;
        }else{
             Redevable redevable=new Redevable(cin, nom, prenom, sexe, adresse, numTel, codePost);
            create(redevable);
            return 1;
        }
       
    }
    
    public List<Redevable> rechercher(String cin, String nom,String prenom, char sexe, String adresse, Long numTel, Long codePost){
      List<Redevable> resRechercher=new ArrayList();
      
      return resRechercher;        
    }
}
