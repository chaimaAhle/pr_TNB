/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
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
public class RedevableServiceTest {
    
    public RedevableServiceTest() {
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
     * Test of ajouter method, of class RedevableService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Redevable redevable = new Redevable("EE1997", "el fahimi", "souhail", 'M', "boulmharz", 1213234L, 1324421L);
        RedevableService instance = new RedevableService();
        int expResult = 1;
        int result = instance.ajouter(redevable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modifier method, of class RedevableService.
     */
//    @Test
//    public void testModifier() {
//        System.out.println("modifier");
//        Redevable redevable = null;
//        RedevableService instance = new RedevableService();
//        int expResult = 0;
//        int result = instance.modifier(redevable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByCriteria method, of class RedevableService.
//     */
//    @Test
//    public void testFindByCriteria() {
//        System.out.println("findByCriteria");
//        RedevableService instance = new RedevableService();
//        Redevable expResult = null;
//        Redevable result = instance.findByCriteria();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
