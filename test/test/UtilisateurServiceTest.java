/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import service.UtilisateurService;
import static org.junit.Assert.*;

/**
 *
 * @author simob
 */
public class UtilisateurServiceTest {
    
    public UtilisateurServiceTest() {
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
     * Test of ajouter method, of class UtilisateurService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        int matricule = 131;
        String motDepasse = "13089122";
        UtilisateurService instance = new UtilisateurService();
        int expResult = 1;
        int result = instance.ajouter(matricule, motDepasse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
