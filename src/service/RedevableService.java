/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import controller.util.SearchUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aniela
 */
public class RedevableService extends AbstractFacade<Redevable> {

    SearchUtil serchUtil = new SearchUtil();

    public RedevableService() {
        super(Redevable.class);

    }

    public int ajouter(Redevable redevable) {
        if (redevable.getCin() == null) {
            return -1;
        } else if (redevable.getAdresse() == null) {
            return -2;
        } else if (redevable.getNumTel() == null) {
            return -3;
        } else if (redevable.getNom() == null) {
            return -4;
        } else if (redevable.getPrenom() == null) {
            return -5;
        } else if (redevable.getCodePost() == null) {
            return -6;
        } else if (redevable.getSexe() == null) {
            return -7;
        } else {
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
        } else if (redevable.getSexe()== null) {
            return -7;
        } else {
            edit(redevable);
            return -1;
        }
    }

     public List<Redevable> findByCriteria(Redevable redevable) {
        List<Redevable> redevables=new ArrayList();
         String requette = "SELECT r FROM Redevable r WHERE 1=1";
        if (!redevable.getCin().equals("")) {
            requette += SearchUtil.addConstraint("r", "cin", "=", redevable.getCin());
        }
        if (!redevable.getNom().equals("")) {
            requette += SearchUtil.addConstraint("r", "nom", "=", redevable.getNom());
        }
     
        if (!redevable.getPrenom().equals("")) {
            requette += SearchUtil.addConstraint("r", "prenom", "=", redevable.getPrenom());
        }
     
        if (!redevable.getAdresse().equals("")) {
            requette += SearchUtil.addConstraint("r", "adresse", "=", redevable.getAdresse());
        }
      redevables=getEntityManager().createQuery(requette).getResultList();
      return redevables;
    }
  


      
    }

