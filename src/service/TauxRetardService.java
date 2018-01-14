/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxRetard;
import java.math.BigDecimal;
import java.util.Date;
import util.SearchUtil;

/**
 *
 * @author simob
 */
public class TauxRetardService extends AbstractFacade<TauxRetard>{
    
    public TauxRetardService() {
        super(TauxRetard.class);
    }
    
    public int creer(TauxRetard tauxRetard){
        if (tauxRetard==null){
            return -1;
        }else
            if (tauxRetard.getPremierMois()==null){
            return -2;
        }else if(tauxRetard.getAutreMois()==null){
            return -3;
        }else if(tauxRetard.getDateApplication()==null){
            return -4;
        }//else if(tauxRetard.getUtilisateur()==null){
         //   return -4;
        //}
        else{
            create(tauxRetard);
            return 1;
        }
    }
   
    public int modifier(TauxRetard tauxRetard){
//         if (tauxRetard==null){
//            return -1;
//        }else
         if (tauxRetard.getPremierMois()==null){
            return -2;
        }else if(tauxRetard.getAutreMois()==null){
            return -3;
        }else if(tauxRetard.getDateApplication()==null){
            return -4;
        }//else if(tauxRetard.getUtilisateur()==null){
         //   return -4;
        //}
        else{
            edit(tauxRetard);
            return 1;
        }
    }     
     public TauxRetard findByDateApplication(Date dateApplication){
         return (TauxRetard)getEntityManager().createQuery("SELECT t FROM TauxTaxe t WHERE dateApplication ='"+dateApplication+"'").getSingleResult();
                 }
}
