/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Redevable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompteHelper extends AbstractHelper<Redevable> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "cin"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("PRENOM ", "prenom"),
            new AbstractHelperItem("SEXE ", "sexe"),
            new AbstractHelperItem("ADRESSE ", "adress"),
            new AbstractHelperItem("TELEPHONE ", "numTel"),
            new AbstractHelperItem("CODEPOSTAL ", "codePost")};
 






    }

    public CompteHelper(JTable jTable, List<Redevable> list) {
        super(titres, jTable, list);
    }

    public CompteHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompteHelper(JTable jTable) {
        super(titres, jTable);
    }
}
