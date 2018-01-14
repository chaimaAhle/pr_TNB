/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.TaxeAnnuelle;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class TaxeAnnuelleHelper extends AbstractHelper<TaxeAnnuelle> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ANNEE ", "annee"),
            new AbstractHelperItem("MONTANT PAYE ", "montant"),
            new AbstractHelperItem("Date DE Presentation ", "datePresentaion"),
            new AbstractHelperItem("TAUX ", "tauxTaxe.taux"),
            };
    }

    public TaxeAnnuelleHelper(JTable jTable, List<TaxeAnnuelle> list) {
        super(titres, jTable, list);
    }

    public TaxeAnnuelleHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public TaxeAnnuelleHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
//add by benmansour
            if (columnIndex == 0) {
                return list.get(rowIndex).getAnnee();
            }
            if (columnIndex == 1) {
                return list.get(rowIndex).getMontant().toString();
            }
            if (columnIndex == 2) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                return simpleDateFormat.format(list.get(rowIndex).getDatePresentaion());
            }
            if (columnIndex == 2) {
                return list.get(rowIndex).getTauxTaxe().getTaux().toString();
            }
//end of adding
        }
        return "";
    }
}
