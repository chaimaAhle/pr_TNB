/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aniela
 */
public class CategorieTerrainServiceTest {
    
    public CategorieTerrainServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouter method, of class CategorieTerrainService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        System.out.println(new Date());
        String nom = "Autre";
        CategorieTerrainService instance = new CategorieTerrainService();
        int expResult = 1;
        int result = instance.ajouter(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of modify method, of class CategorieTerrainService.
     */
//    @Test
//    public void testModify() {
//        System.out.println("modify");
//        CategorieTerrain categorieTerrain = null;
//        CategorieTerrainService instance = new CategorieTerrainService();
//        int expResult = 0;
//        int result = instance.modify(categorieTerrain);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
