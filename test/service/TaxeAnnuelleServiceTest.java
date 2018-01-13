/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TaxeAnnuelle;
import java.util.Date;
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
public class TaxeAnnuelleServiceTest {
    
    public TaxeAnnuelleServiceTest() {
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
     * Test of findLastDateTauxRetard method, of class TaxeAnnuelleService.
     */
    @Test
    public void testFindLastDateTauxRetard() {
        System.out.println("findLastDateTauxRetard");
        TaxeAnnuelleService instance = new TaxeAnnuelleService();
        Date expResult = null;
        Date result = instance.findLastDateTauxRetard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbMoisRetard method, of class TaxeAnnuelleService.
     */
    @Test
    public void testNbMoisRetard() {
        System.out.println("nbMoisRetard");
        TaxeAnnuelle taxeAnnuelle = null;
        TaxeAnnuelleService instance = new TaxeAnnuelleService();
        int expResult = 0;
        int result = instance.nbMoisRetard(taxeAnnuelle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payerAnnee method, of class TaxeAnnuelleService.
     */
    @Test
    public void testPayerAnnee() {
        System.out.println("payerAnnee");
        TaxeAnnuelle taxeAnnuelle = null;
        TaxeAnnuelleService instance = new TaxeAnnuelleService();
        int expResult = 0;
        int result = instance.payerAnnee(taxeAnnuelle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
