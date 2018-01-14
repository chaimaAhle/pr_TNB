/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxTaxe;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simob
 */
public class TauxTaxeServiceTest {
    
    public TauxTaxeServiceTest() {
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
     * Test of ajouter method, of class TauxTaxeService.
     */
    @Test
    public void testAjouter() {
        
        System.out.println("ajouter");
        TauxTaxe tauxTaxe = new  TauxTaxe(BigDecimal.valueOf(15));
        TauxTaxeService instance = new TauxTaxeService();
        int expResult = 1;
        int result = instance.ajouter(tauxTaxe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modifier method, of class TauxTaxeService.
     */
//    @Test
//    public void testModifier() {
//        System.out.println("modifier");
//        BigDecimal nvTaux = null;
//        Long id = null;
//        TauxTaxeService instance = new TauxTaxeService();
//        int expResult = 0;
//        int result = instance.modifier(nvTaux, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByCategorie method, of class TauxTaxeService.
//     */
//    @Test
//    public void testFindByCategorie() {
//        System.out.println("findByCategorie");
//        String nomCategorie = "";
//        TauxTaxeService instance = new TauxTaxeService();
//        TauxTaxe expResult = null;
//        TauxTaxe result = instance.findByCategorie(nomCategorie);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
