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
TerrainService terServ=new TerrainService();
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
        } else if (redevable.getSexe() == null) {
            return -7;
        }else {
            edit(redevable);
            return 1;
        }
    }
    
     public List<Redevable> findByCritirea(Redevable redevable) {
        List<Redevable> res=new ArrayList<>();
         String requette = "SELECT r FROM Redevable r WHERE 1=1";
        if (!redevable.getCin().equals("")) {
            requette += SearchUtil.addConstraint("r", "cin", "=", redevable.getCin());
        }
        if (!redevable.getPrenom().equals("")) {
            requette += SearchUtil.addConstraint("r", "prenom", "=", redevable.getPrenom());
        }
        if (!redevable.getNom().equals("")) {
            requette += SearchUtil.addConstraint("r", "nom", "=", redevable.getNom());
        }
        if (!redevable.getAdresse().equals("")) {
            requette += SearchUtil.addConstraint("r", "adresse", "=", redevable.getAdresse());
        }
        if (!redevable.getCodePost().equals("")) {
            requette += SearchUtil.addConstraint("r", "codePostal", "=", redevable.getCodePost());
        }
        System.out.println(requette);
        res=getEntityManager().createQuery(requette).getResultList();
        if(res.isEmpty()){
            return null;
        }else{
            return res;
        }
    }
public int deleteRedevable(Redevable redevable){

 if( terServ.findByRedevable(redevable)!=null){
        return -1;
        }
       else{
   remove(redevable);
     return 1;
       }
    }
    
}








