/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxRetard;

/**
 *
 * @author simob
 */
public class TauxRetardService extends AbstractFacade<TauxRetard>{
    
    public TauxRetardService() {
        super(TauxRetard.class);
    }
     public int ajouter(TauxRetard tauxRetard)
     {
        if ( tauxRetard== null) {
            return -1;
        } 
        else if (== null) {
            return -2;
        }else{
         
                return 1;
            }
        }
    
}
