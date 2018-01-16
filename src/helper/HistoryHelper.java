/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.History;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Aniela
 */
public class HistoryHelper extends AbstractHelper<History> {
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Date de l'action ", "date"),
            new AbstractHelperItem("Utilisateur", "utilisateur.cin"),
            new AbstractHelperItem("Action", "action"),
         };
       
    }

    public HistoryHelper(JTable jTable, List<History> list) {
        super(titres, jTable, list);
    }

    public HistoryHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public HistoryHelper(JTable jTable) {
        super(titres, jTable);
    }
  
  
}
