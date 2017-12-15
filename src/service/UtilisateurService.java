/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;

/**
 *
 * @author Aniela
 */
public class UtilisateurService extends AbstractFacade<Utilisateur>{
    
    public int seConnecter(Utilisateur utilisateur){
        Utilisateur loadedUtilisateur= find(utilisateur.getMatricule());
        if(loadedUtilisateur==null){
         return -1;   
        }
      /*  else if(!loadedUtilisateur.getMotDepasse().equals(HAshageUtil.sha256utilisateur.getMotDepasse())){
            return -2;
        }
        */else{
            return 1;
        }
    }
    
    public UtilisateurService() {
        super(Utilisateur.class);
    }
    
    public int ajouter(String matricule,String motDePasse,String nom, String prenom){
        if(matricule==null){
            return -1;
        }else if(motDePasse==null || motDePasse.length()<6){
            return -2;
        }else if(nom==null){
            return -3;
        }else if (prenom==null){
            return -4;
        }else{
            
            Utilisateur utilisateur= new Utilisateur(matricule, motDePasse, nom, prenom);
            create(utilisateur);
            return 1;
        }
        
    }
    
    
}
