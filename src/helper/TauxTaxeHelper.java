/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.TauxRetard;
import bean.TauxTaxe;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class TauxTaxeHelper extends AbstractHelper<TauxTaxe> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("date d'application ", "dateApplication"),
            new AbstractHelperItem("le Taux", "taux")
        };
    }

    public TauxTaxeHelper(JTable jTable, List<TauxTaxe> list) {
        super(titres, jTable, list);
    }

    public TauxTaxeHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public TauxTaxeHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
//add by benmansour
           
            
            if (columnIndex == 1) {
                return list.get(rowIndex).getTaux().toString();
            } 
//end of adding            
            if (columnIndex == 0) {
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
