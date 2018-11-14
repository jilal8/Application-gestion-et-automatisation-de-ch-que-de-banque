/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Fournisseur;
import java.util.List;
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
public class fournisseurBeanTest {
    
    public fournisseurBeanTest() {
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
     * Test of getListeDeFournisseur method, of class fournisseurBean.
     */
    @Test
    public void testGetListeDeFournisseur() {
        System.out.println("getListeDeFournisseur");
        fournisseurBean instance = new fournisseurBean();
        List<Fournisseur> expResult = null;
        List<Fournisseur> result = instance.getListeDeFournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeDeFournisseur method, of class fournisseurBean.
     */
    @Test
    public void testSetListeDeFournisseur() {
        System.out.println("setListeDeFournisseur");
        List<Fournisseur> listeDeFournisseur = null;
        fournisseurBean instance = new fournisseurBean();
        instance.setListeDeFournisseur(listeDeFournisseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFournisseur method, of class fournisseurBean.
     */
    @Test
    public void testGetFournisseur() {
        System.out.println("getFournisseur");
        fournisseurBean instance = new fournisseurBean();
        Fournisseur expResult = null;
        Fournisseur result = instance.getFournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFournisseur method, of class fournisseurBean.
     */
    @Test
    public void testSetFournisseur() {
        System.out.println("setFournisseur");
        Fournisseur fournisseur = null;
        fournisseurBean instance = new fournisseurBean();
        instance.setFournisseur(fournisseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFournisseur method, of class fournisseurBean.
     */
    @Test
    public void testCreateFournisseur() {
        System.out.println("createFournisseur");
        fournisseurBean instance = new fournisseurBean();
        String expResult = "";
        String result = instance.createFournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class fournisseurBean.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        fournisseurBean instance = new fournisseurBean();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
