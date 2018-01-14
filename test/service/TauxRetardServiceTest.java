/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TauxRetard;
import java.math.BigDecimal;
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
public class TauxRetardServiceTest {
    
    public TauxRetardServiceTest() {
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
     * Test of creer method, of class TauxRetardService.
     */
    @Test
    public void testCreer() {
        System.out.println("creer");
        TauxRetard tauxRetard = new TauxRetard(new BigDecimal(0.10),new BigDecimal(0.05),new BigDecimal(0.005));
        tauxRetard.setDateApplication(new Date());
        TauxRetardService instance = new TauxRetardService();
        int expResult = 1;
        int result = instance.creer(tauxRetard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 
}
