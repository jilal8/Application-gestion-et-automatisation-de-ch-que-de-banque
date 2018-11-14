/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Banque;
import entities.Cheque;
import entities.Compte;
import entities.Facture;
import entities.Fournisseur;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author ismas
 */
public class chequeBeansTest {
    
    public chequeBeansTest() {
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
    
        /*** Test of getFilterCheque method, of class chequeBeans.
     */
    @Test
    public void testGetFilterCheque() {
        System.out.println("getFilterCheque");
        chequeBeans instance = new chequeBeans();
        List<Cheque> expResult = null;
        List<Cheque> result = instance.getFilterCheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
//
        @Test
    public void testGetId_compte() {
        System.out.println("getId_compte");
        chequeBeans instance = new chequeBeans();
        int expResult = 0;
        int result = instance.getId_compte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of getListCheque method, of class chequeBeans.
     */
    @Test
    public void testGetListCheque() {
        System.out.println("getListCheque");
        chequeBeans instance = new chequeBeans();
        List<Cheque> expResult = null;
        List<Cheque> result = instance.getListCheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListCheque method, of class chequeBeans.
     */
    @Test
    public void testSetListCheque() {
        System.out.println("setListCheque");
        List<Cheque> listCheque = null;
        chequeBeans instance = new chequeBeans();
        instance.setListCheque(listCheque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLisrFournisseur method, of class chequeBeans.
     */
    @Test
    public void testGetLisrFournisseur() {
        System.out.println("getLisrFournisseur");
        chequeBeans instance = new chequeBeans();
        List<Fournisseur> expResult = null;
        List<Fournisseur> result = instance.getLisrFournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLisrFournisseur method, of class chequeBeans.
     */
    @Test
    public void testSetLisrFournisseur() {
        System.out.println("setLisrFournisseur");
        List<Fournisseur> lisrFournisseur = null;
       
        chequeBeans instance = new chequeBeans();
        instance.setLisrFournisseur(lisrFournisseur);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
    /**
     * Test of getListCompte method, of class chequeBeans.
     */
    @Test
    public void testGetListCompte() {
        System.out.println("getListCompte");
        chequeBeans instance = new chequeBeans();
        List<Compte> expResult = null;
        List<Compte> result = instance.getListCompte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListCompte method, of class chequeBeans.
     */
    @Test
    public void testSetListCompte() {
        System.out.println("setListCompte");
        List<Compte> listCompte = null;
        chequeBeans instance = new chequeBeans();
        instance.setListCompte(listCompte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListBanque method, of class chequeBeans.
     */
    @Test
    public void testGetListBanque() {
        System.out.println("getListBanque");
        chequeBeans instance = new chequeBeans();
        List<Banque> expResult = null;
        List<Banque> result = instance.getListBanque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListBanque method, of class chequeBeans.
     */
    @Test
    public void testSetListBanque() {
        System.out.println("setListBanque");
        List<Banque> listBanque = null;
        chequeBeans instance = new chequeBeans();
        instance.setListBanque(listBanque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheque method, of class chequeBeans.
     */
    @Test
    public void testGetCheque() {
        System.out.println("getCheque");
        chequeBeans instance = new chequeBeans();
        Cheque expResult = null;
        Cheque result = instance.getCheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCheque method, of class chequeBeans.
     */
    @Test
    public void testSetCheque() {
        System.out.println("setCheque");
        Cheque cheque = null;
        chequeBeans instance = new chequeBeans();
        instance.setCheque(cheque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_compte method, of class chequeBeans.
     */


    /**
     * Test of setId_compte method, of class chequeBeans.
     */
    @Test
    public void testSetId_compte() {
        System.out.println("setId_compte");
        int id_compte = 0;
        chequeBeans instance = new chequeBeans();
        instance.setId_compte(id_compte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_banque method, of class chequeBeans.
     */
    @Test
    public void testGetId_banque() {
        System.out.println("getId_banque");
        chequeBeans instance = new chequeBeans();
        int expResult = 0;
        int result = instance.getId_banque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_banque method, of class chequeBeans.
     */
    @Test
    public void testSetId_banque() {
        System.out.println("setId_banque");
        int id_banque = 0;
        chequeBeans instance = new chequeBeans();
        instance.setId_banque(id_banque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_fournisseur method, of class chequeBeans.
     */
    @Test
    public void testGetId_fournisseur() {
        System.out.println("getId_fournisseur");
        chequeBeans instance = new chequeBeans();
        int expResult = 0;
        int result = instance.getId_fournisseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_fournisseur method, of class chequeBeans.
     */
    @Test
    public void testSetId_fournisseur() {
        System.out.println("setId_fournisseur");
        int id_fournisseur = 0;
        chequeBeans instance = new chequeBeans();
        instance.setId_fournisseur(id_fournisseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of setFilterCheque method, of class chequeBeans.
     */
    @Test
    public void testSetFilterCheque() {
        System.out.println("setFilterCheque");
        List<Cheque> filterCheque = null;
        chequeBeans instance = new chequeBeans();
        instance.setFilterCheque(filterCheque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdcheque method, of class chequeBeans.
     */
    @Test
    public void testGetIdcheque() {
        System.out.println("getIdcheque");
        chequeBeans instance = new chequeBeans();
        int expResult = 0;
        int result = instance.getIdcheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcheque method, of class chequeBeans.
     */
    @Test
    public void testSetIdcheque() {
        System.out.println("setIdcheque");
        int idcheque = 0;
        chequeBeans instance = new chequeBeans();
        instance.setIdcheque(idcheque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadReglement method, of class chequeBeans.
     */
    @Test
    public void testLoadReglement() {
        System.out.println("loadReglement");
        chequeBeans instance = new chequeBeans();
        instance.loadReglement();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
//
    /**
     * Test of imprimerEtat method, of class chequeBeans.
     */
    @Test
    public void testImprimerEtat() throws Exception {
        System.out.println("imprimerEtat");
        Cheque c = null;
        chequeBeans instance = new chequeBeans();
        String expResult = "";
        String result = instance.imprimerEtat(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeFacture method, of class chequeBeans.
     */
    @Test
    public void testGetListeFacture() {
        System.out.println("getListeFacture");
        chequeBeans instance = new chequeBeans();
        List<Facture> expResult = null;
        List<Facture> result = instance.getListeFacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeFacture method, of class chequeBeans.
     */
    @Test
    public void testSetListeFacture() {
        System.out.println("setListeFacture");
        List<Facture> listeFacture = null;
        chequeBeans instance = new chequeBeans();
        instance.setListeFacture(listeFacture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onFactureDrop method, of class chequeBeans.
     */
    @Test
    public void testOnFactureDrop() {
        System.out.println("onFactureDrop");
        DragDropEvent ddEvent = null;
        chequeBeans instance = new chequeBeans();
        instance.onFactureDrop(ddEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontntcheque method, of class chequeBeans.
     */
    @Test
    public void testGetMontntcheque() {
        System.out.println("getMontntcheque");
        chequeBeans instance = new chequeBeans();
        int expResult = 0;
        int result = instance.getMontntcheque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontntcheque method, of class chequeBeans.
     */
    @Test
    public void testSetMontntcheque() {
        System.out.println("setMontntcheque");
        int montntcheque = 0;
        chequeBeans instance = new chequeBeans();
        instance.setMontntcheque(montntcheque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropFacture method, of class chequeBeans.
     */
    @Test
    public void testGetDropFacture() {
        System.out.println("getDropFacture");
        chequeBeans instance = new chequeBeans();
        List<Facture> expResult = null;
        List<Facture> result = instance.getDropFacture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedFACTURE method, of class chequeBeans.
     */
    @Test
    public void testGetSelectedFACTURE() {
        System.out.println("getSelectedFACTURE");
        chequeBeans instance = new chequeBeans();
        Facture expResult = null;
        Facture result = instance.getSelectedFACTURE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedFACTURE method, of class chequeBeans.
     */
   
    
}
