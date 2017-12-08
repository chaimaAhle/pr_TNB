/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
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
     * Test of seConnecter method, of class UtilisateurService.
     */
   
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String matricule = "13089122";
        String motDepasse = "EE793372";
        String nom = "BENMANSOUR";
        String prenom = "MOHAMMED";
        UtilisateurService instance = new UtilisateurService();
        int expResult = 1;
        int result = instance.ajouter(matricule, motDepasse, nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
