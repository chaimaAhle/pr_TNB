/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import bean.Redevable_;
import java.util.List;
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
//    @Test
//    public void testAjouter() {
//        System.out.println("ajouter");
//        Redevable redevable = null;
//        RedevableService instance = new RedevableService();
//        int expResult = 0;
//        int result = instance.ajouter(redevable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findByCriteria method, of class RedevableService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        Redevable redevable = new Redevable("EE1997", null, null,null);
        RedevableService instance = new RedevableService();
        List<Redevable> expResult =null ;
        List<Redevable> result = instance.findByCriteria(redevable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of ajouter method, of class RedevableService.
     */
//    @Test
//    public void testAjouter() {
//        System.out.println("ajouter");
//        Redevable redevable = new Redevable("EE1991","Noukhal", "Hafida","F","17,Derb Sidi makhlouf Aswel Marrakech","06322344","43232");
//        RedevableService instance = new RedevableService();
//        int expResult = 1;
//        int result = instance.ajouter(redevable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//     
//    }

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
    
}
