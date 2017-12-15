/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String cin = "";
        String nom = "";
        String prenom = "";
        char sexe = ' ';
        String adresse = "";
        Long numTel = null;
        Long codePost = null;
        RedevableService instance = new RedevableService();
        int expResult = 0;
        int result = instance.ajouter(cin, nom, prenom, sexe, adresse, numTel, codePost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
