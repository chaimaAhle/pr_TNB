/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.LigneNotification;

/**
 *
 * @author Aniela
 */
public class LigneNotificationService extends AbstractFacade<LigneNotification>{
    
    public LigneNotificationService() {
        super(LigneNotification.class);
    }
    public int add(Long id){
    LigneNotification ligneNotification=new LigneNotification(id);
        create(ligneNotification);
        return 1;
    }
}
