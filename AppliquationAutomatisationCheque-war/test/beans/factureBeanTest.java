/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Facture;
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
public class factureBeanTest {
    
    public factureBeanTest() {
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
     * Test of getListefacture method, of class factureBean.
     */
    @Test
    public void testGetListefacture() {
        System.out.println("getListefacture");
        factureBean instance = new factureBean();
        List<Facture> expResult = null;
        List<Facture> result = instance.getListefacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListefacture method, of class factureBean.
     */
    @Test
    public void testSetListefacture() {
        System.out.println("setListefacture");
        List<Facture> listefacture = null;
        factureBean instance = new factureBean();
        instance.setListefacture(listefacture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListefournisseur method, of class factureBean.
     */
    @Test
    public void testGetListefournisseur() {
        System.out.println("getListefournisseur");
        factureBean instance = new factureBean();
        List<Fournisseur> expResult = null;
        List<Fournisseur> result = instance.getListefournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListefournisseur method, of class factureBean.
     */
    @Test
    public void testSetListefournisseur() {
        System.out.println("setListefournisseur");
        List<Fournisseur> listefournisseur = null;
        factureBean instance = new factureBean();
        instance.setListefournisseur(listefournisseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_fournisseur method, of class factureBean.
     */
    @Test
    public void testGetId_fournisseur() {
        System.out.println("getId_fournisseur");
        factureBean instance = new factureBean();
        int expResult = 0;
        int result = instance.getId_fournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_fournisseur method, of class factureBean.
     */
    @Test
    public void testSetId_fournisseur() {
        System.out.println("setId_fournisseur");
        int id_fournisseur = 0;
        factureBean instance = new factureBean();
        instance.setId_fournisseur(id_fournisseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFacture method, of class factureBean.
     */
    @Test
    public void testGetFacture() {
        System.out.println("getFacture");
        factureBean instance = new factureBean();
        Facture expResult = null;
        Facture result = instance.getFacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacture method, of class factureBean.
     */
    @Test
    public void testSetFacture() {
        System.out.println("setFacture");
        Facture facture = null;
        factureBean instance = new factureBean();
        instance.setFacture(facture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFacture method, of class factureBean.
     */
    @Test
    public void testCreateFacture() {
        System.out.println("createFacture");
        factureBean instance = new factureBean();
        String expResult = "";
        String result = instance.createFacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilteredFacture method, of class factureBean.
     */
    @Test
    public void testGetFilteredFacture() {
        System.out.println("getFilteredFacture");
        factureBean instance = new factureBean();
        List<Facture> expResult = null;
        List<Facture> result = instance.getFilteredFacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilteredFacture method, of class factureBean.
     */
    @Test
    public void testSetFilteredFacture() {
        System.out.println("setFilteredFacture");
        List<Facture> filteredFacture = null;
        factureBean instance = new factureBean();
        instance.setFilteredFacture(filteredFacture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class factureBean.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        factureBean instance = new factureBean();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SupprimerFacture method, of class factureBean.
     */
    @Test
    public void testSupprimerFacture() {
        System.out.println("SupprimerFacture");
        factureBean instance = new factureBean();
        String expResult = "";
        int i=0;
        String result = instance.SupprimerFacture(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
