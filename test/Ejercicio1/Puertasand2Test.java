/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class Puertasand2Test {
    
    public Puertasand2Test() {
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
     * Test of getA method, of class PuertaAnd2.
     */
       @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        PuertaAnd2 otro = new PuertaAnd2(true);
        PuertaAnd2 instance = new PuertaAnd2(true);
        boolean expResult = true;
        boolean result = instance.equals(otro);
        assertEquals(expResult, result);

    }
    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        PuertaAnd2 otro = new PuertaAnd2(false);
        PuertaAnd2 instance = new PuertaAnd2(true);
        boolean expResult = false;
        boolean result = instance.equals(otro);
        assertEquals(expResult, result);

    }

    /**
     * Test of getSalida method, of class PuertaAnd2.
     */
    @Test
    public void testGetSalida00() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(false,false);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
        
    }
        @Test
    public void testGetSalida01() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(false,true);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetSalida10() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(true,false);
        boolean expResult = false;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
        
    }
        @Test
    public void testGetSalida11() {
        System.out.println("getSalida");
        PuertaAnd2 instance = new PuertaAnd2(true,true);
        boolean expResult = true;
        boolean result = instance.getSalida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class PuertaAnd2.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PuertaAnd2 instance = new PuertaAnd2();
        String expResult = "A: false B: false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
