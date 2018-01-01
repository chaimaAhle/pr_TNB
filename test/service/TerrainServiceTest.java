/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import bean.Terrain;
import java.math.BigDecimal;
import java.util.Date;
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
public class TerrainServiceTest {
    
    public TerrainServiceTest() {
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
     * Test of ajouter method, of class TerrainService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Terrain terrain = new Terrain(new Long("123423"),"Marrakech","Medina", new BigDecimal(123),new Date("12/01/1997"));
        TerrainService instance = new TerrainService();
        int expResult = 0;
        int result = instance.ajouter(terrain);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of modify method, of class TerrainService.
     */
//    @Test
//    public void testModify() {
//        System.out.println("modify");
//        Terrain terrain = null;
//        TerrainService instance = new TerrainService();
//        int expResult = 0;
//        int result = instance.modify(terrain);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findByCriteria method, of class TerrainService.
     */
//    @Test
//    public void testFindByCriteria() {
//        System.out.println("findByCriteria");
//        Terrain terrain = null;
//        TerrainService instance = new TerrainService();
//        List<Terrain> expResult = null;
//        List<Terrain> result = instance.findByCriteria(terrain);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findByRedevable method, of class TerrainService.
     */
//    @Test
//    public void testFindByRedevable() {
//        System.out.println("findByRedevable");
//        Redevable redevable = null;
//        TerrainService instance = new TerrainService();
//        List<Terrain> expResult = null;
//        List<Terrain> result = instance.findByRedevable(redevable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
