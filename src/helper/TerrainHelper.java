/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Redevable;
import bean.Terrain;
import java.text.SimpleDateFormat;
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
            new AbstractHelperItem("n° Lot ", "numeroLot"),
            new AbstractHelperItem("ville ", "ville"),
            new AbstractHelperItem("zone geographique ", "ZoneGeo"),
            new AbstractHelperItem("surface(m²)", "surface"),
            new AbstractHelperItem("date d'achat ", "dateAchat"),
           new AbstractHelperItem("Categorie ", "categorieTerrain.nom")};
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
//add by benmansour
            if (columnIndex == 0) {
                return list.get(rowIndex).getNumeroLot().toString();
            }
            if (columnIndex == 1) {
                return list.get(rowIndex).getVille().toString();
            }
            if (columnIndex == 2) {
                return list.get(rowIndex).getZoneGeo().toString();
            }
            if (columnIndex == 3) {
                return list.get(rowIndex).getSurface().toString();
            }
//end of adding            
            if (columnIndex == 4) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                return simpleDateFormat.format(list.get(rowIndex).getDateAchat());
            } if (columnIndex == 5) {
                return list.get(rowIndex).getCategorieTerrain().getNom().toString();
            } else {
                return super.getValueAt(rowIndex, columnIndex).toString();
            }
        }
        return "";
    }

}
