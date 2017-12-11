/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Redevable;
import bean.Terrain;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class TerrainHelper extends AbstractHelper<Terrain> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("CIN ", "numeroLot"),
            new AbstractHelperItem("NOM ", "surface"),
            new AbstractHelperItem("PRENOM ", "ville"),
            new AbstractHelperItem("SEXE ", "ZoneGeo"),
            new AbstractHelperItem("ADRESSE ", "dateAchat"),
            new AbstractHelperItem("TELEPHONE ", "numTel"),
            new AbstractHelperItem("CODEPOSTAL ", "codePost"),
        new AbstractHelperItem("TELEPHONE ", "numTel")};

    }

    public TerrainHelper(JTable jTable, List<Terrain> list) {
        super(titres, jTable, list);
    }

    public TerrainHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public TerrainHelper(JTable jTable) {
        super(titres, jTable);
    }
}
