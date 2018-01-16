/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.History;
import bean.History_;
import bean.Utilisateur;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author Aniela
 */
public class HistoryService  extends AbstractFacade<History>{
      History history=new History();
    public HistoryService() {
        super(History.class);
    }
    
    public void saveHistory(Utilisateur utilisateur,String action){
        History h=new History();
        h.setDateAct(new Date());
        h.setUtilisateur(utilisateur);
        h.setAct(action);
      create(h);
    }
    public List<History> findByDate(Date date){
           List<History>res=new ArrayList<>();
        String requette = "SELECT h FROM History h";
            requette += SearchUtil.addConstraintDate("h", "date", "=", date);
           res= getEntityManager().createQuery(requette).getResultList();
           if(res.isEmpty()){
               return null;
           }else return res;
    }
    
    
    
    
}
