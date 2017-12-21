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
public class RedevableService extends AbstractFacade<Redevable>{
    SearchUtil serchUtil=new SearchUtil();
    public RedevableService() {
        super(Redevable.class);
     
    }
    public int ajouter(Redevable redevable){
        if(redevable.getCin()==null){
            return -1;
        }else if(redevable.getAdresse()==null){
            return -2;
        }else if(redevable.getNumTel()==null){
            return -3;
        }else if (redevable.getNom()==null){
            return -4;
        }else if (redevable.getCodePost()==null){
            return -4;
        }else{
            create(redevable);
            return 1;
        }
    }
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
//}
