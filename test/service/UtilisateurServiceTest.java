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
//    @Test
//    public void testSeConnecter() {
//        System.out.println("seConnecter");
//        Utilisateur utilisateur = null;
//        UtilisateurService instance = new UtilisateurService();
//        int expResult = 0;
//        int result = instance.seConnecter(utilisateur);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of create method, of class UtilisateurService.
     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Utilisateur utilisateur = null;
//        UtilisateurService instance = new UtilisateurService();
//        instance.create(utilisateur);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }

    /**
     * Test of ajouter method, of class UtilisateurService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Utilisateur utilisateur = new Utilisateur("chaima", "aniela", "Ahle Touate","Chaima", true);
        UtilisateurService instance = new UtilisateurService();
        int expResult = 1;
        int result = instance.ajouter(utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of modify method, of class UtilisateurService.
     */
//    @Test
//    public void testModify() {
//        System.out.println("modify");
//        Utilisateur utilisateur = null;
//        UtilisateurService instance = new UtilisateurService();
//        int expResult = 0;
//        int result = instance.modify(utilisateur);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class UtilisateurService.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//        Utilisateur uilisateur = null;
//        UtilisateurService instance = new UtilisateurService();
//        instance.remove(uilisateur);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
