/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import java.util.ArrayList;
import java.util.List;
import util.SearchUtil;
import static util.SearchUtil.addConstraint;

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
        } else {
            edit(redevable);
            return 1;
        }
    }
    
 public List<Redevable> findByCritirea(Redevable redevable) {
        List<Redevable> redevables= new ArrayList();
        String query ="SELECT r from Redevable r where 1=1";
        query+=addConstraint("r", "cin", "=", redevable.getCin());
        query+=addConstraint("r", "nom", "=", redevable.getNom());
        query+=addConstraint("r", "prenom", "=", redevable.getPrenom());
        query+=addConstraint("r", "adresse", "=", redevable.getAdresse());
        query+=addConstraint("r", "codePost", "=", redevable.getCodePost());
        
        redevables=getEntityManager().createQuery(query).getResultList();
        System.out.println(">"+redevables.size());
        return redevables;
    }
}
