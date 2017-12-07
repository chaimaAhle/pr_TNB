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
    
    public UtilisateurService() {
        super(Utilisateur.class);
    }
    
    public int ajouter(int matricule,String motDepasse){
        Utilisateur utilisateur= new Utilisateur(matricule, motDepasse);
        create(utilisateur);
        return 1;
    }
}
