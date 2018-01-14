/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.TauxRetard;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class TauxRetardHelper extends AbstractHelper<TauxRetard> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("PENALITE ", "penalite"),
            new AbstractHelperItem("MAJORATION 1er Mois ", "premierMois"),
            new AbstractHelperItem("MAJORATION 2eme Mois ", "autreMois"),
            new AbstractHelperItem("DATE APPLICATION ", "dateApplication"),};
    }

    public TauxRetardHelper(JTable jTable, List<TauxRetard> list) {
        super(titres, jTable, list);
    }

    public TauxRetardHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public TauxRetardHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
//add by benmansour
            if (columnIndex == 0) {
                return list.get(rowIndex).getPenalite().toString();
            } 
            if (columnIndex == 1) {
                return list.get(rowIndex).getPremierMois().toString();
            } 
            if (columnIndex == 2) {
                return list.get(rowIndex).getAutreMois().toString();
            } 
//end of adding            
            if (columnIndex == 3) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                return simpleDateFormat.format(list.get(rowIndex).getDateApplication());
            } 
            
            
            else {
                return super.getValueAt(rowIndex, columnIndex).toString();
            }
        }
        return "";
    }
}
