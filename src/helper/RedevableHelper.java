/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Redevable;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class RedevableHelper extends AbstractHelper<Redevable> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "cin"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("PRENOM ", "prenom"),
            new AbstractHelperItem("SEXE ", "sexe"),
            new AbstractHelperItem("ADRESSE ", "adress"),
            new AbstractHelperItem("TELEPHONE ", "numTel"),
            new AbstractHelperItem("CODEPOSTAL ", "codePost")
        };
    }

    public RedevableHelper(JTable jTable, List<Redevable> list) {
        super(titres, jTable, list);
    }

    public RedevableHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public RedevableHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
//add by benmansour
            if (columnIndex == 0) {
                return list.get(rowIndex).getCin().toString();
            }
            if (columnIndex == 1) {
                return list.get(rowIndex).getNom();
            }
            if (columnIndex == 2) {
                return list.get(rowIndex).getPrenom();
            }
            if (columnIndex == 3) {
                return list.get(rowIndex).getSexe();
            }
            if (columnIndex == 4) {
                return list.get(rowIndex).getAdresse();
            }
            if (columnIndex == 5) {
                return list.get(rowIndex).getNumTel();
            }
            if (columnIndex == 6) {
                return list.get(rowIndex).getCodePost();
            }
//end of adding            
             else {
                return super.getValueAt(rowIndex, columnIndex).toString();
            }
        }
        return "";
    }
}
