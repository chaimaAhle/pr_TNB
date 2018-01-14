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
 * @author Aniela
 */
public class RedevableHelper extends AbstractHelper<Redevable> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "cin"),
            new AbstractHelperItem("NOM ", "nom"),
            new AbstractHelperItem("PRENOM ", "prenom"),
            new AbstractHelperItem("SEXE ", "sexe"),
            new AbstractHelperItem("ADRESSE ", "adresse"),
            new AbstractHelperItem("TELEPHONE ", "numTel"),
            new AbstractHelperItem("CODEPOSTAL ", "codePost"),
        new AbstractHelperItem("TELEPHONE ", "numTel")};
            


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
}
