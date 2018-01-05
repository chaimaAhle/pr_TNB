/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
import util.HashageUtil;

/**
 *
 * @author Aniela
 */
public class UtilisateurService extends AbstractFacade<Utilisateur> {

    public int seConnecter(Utilisateur utilisateur) {
        Utilisateur loadedUtilisateur = find(utilisateur.getMatricule());
        if (loadedUtilisateur == null) {
            return -1;
        } else if (!loadedUtilisateur.getMotDepasse().equals(HashageUtil.sha256(utilisateur.getMotDepasse()))) {
            return -2;
        } else {
            return 1;
        }
    }

    @Override
    public void create(Utilisateur utilisateur) {
        utilisateur.setMotDepasse(HashageUtil.sha256(utilisateur.getMotDepasse()));
        super.create(utilisateur);
    }

    public UtilisateurService() {
        super(Utilisateur.class);
    }

    public int ajouter(Utilisateur utilisateur) {
        if (utilisateur.getMatricule() == null) {
            return -1;
        } else if (utilisateur.getMotDepasse() == null || utilisateur.getMotDepasse().length() < 6) {
            return -2;
        } else if (utilisateur.getNom() == null) {
            return -3;
        } else if (utilisateur.getPrenom() == null) {
            return -4;
        } else {
            create(utilisateur);
            return 1;
        }
    }

    public int modify(Utilisateur utilisateur) {
        if (utilisateur.isIsAdmin() != true) {
            return -1;
        } else if (utilisateur.getMatricule() == null) {
            return -1;
        } else if (utilisateur.getMotDepasse() == null || utilisateur.getMotDepasse().length() < 6) {
            return -2;
        } else if (utilisateur.getNom() == null) {
            return -3;
        } else if (utilisateur.getPrenom() == null) {
            return -4;
        } else {
            edit(utilisateur);
            return 1;
        }
    }
}
