/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbb;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ismas
 */
public class ConnectionBDTest {
    
    public ConnectionBDTest() {
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
     * Test of getconnection method, of class ConnectionBD.
     */
//    @Test
//    public void testGetconnection() throws Exception {
//        System.out.println("getconnection");
//        ConnectionBD instance = new ConnectionBD();
//        Connection expResult = instance.getconnection();
//        Connection result = instance.getconnection();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of add method, of class ConnectionBD.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int b = 0;
        int c = 0;
        ConnectionBD instance = new ConnectionBD();
        int expResult = 0;
        int result = instance.add(b, c);
        assertEquals(expResult, result);
        
    }
    
}
