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
        String cin = "EE793372";
        String nom = "BENMANSOUR";
        String prenom = "MOHAMMED";
        char sexe = 'M';
        String adresse = "AZERTYUIOP";
        Long numTel = null;
        Long codePost = null;
        RedevableService instance = new RedevableService();
        int expResult = 1;
        int result = instance.ajouter(cin, nom, prenom, sexe, adresse, numTel, codePost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
