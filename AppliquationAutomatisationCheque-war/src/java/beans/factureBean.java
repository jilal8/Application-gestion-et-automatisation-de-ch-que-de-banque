/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.ChequeFacade;
import dao.FactureFacade;
import dao.FournisseurFacade;
import entities.Cheque;
import entities.Facture;
import entities.Fournisseur;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author ismas
 */
public class factureBean {

    @EJB
    private ChequeFacade chequeFacade;

    @EJB
    private FournisseurFacade fournisseurFacade;

    @EJB
    private FactureFacade factureFacade;
    
    List<Facture> listefacture = null;
    List<Facture> filteredFacture = null;
    List<Fournisseur> listefournisseur = null;
    List<Cheque> listcheque = null;
    int id_fournisseur = 0;
    int idfacture = 0;
    int idcheque = 0;
    Facture facture = null;

    public factureBean() {
        facture = new Facture();
    }

    public List<Facture> getListefacture() {
        if (this.listefacture == null) {
            this.listefacture = new ArrayList<>();
            this.listefacture = factureFacade.findAll();
        }
        return listefacture;
    }

    public void setListefacture(List<Facture> listefacture) {
        this.listefacture = listefacture;
    }

    public List<Fournisseur> getListefournisseur() {
        if (this.listefournisseur == null) {
            this.listefournisseur = new ArrayList<>();
            this.listefournisseur = fournisseurFacade.findAll();
        }
        return listefournisseur;
    }

    public void setListefournisseur(List<Fournisseur> listefournisseur) {
        this.listefournisseur = listefournisseur;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public String createFacture() {

        Fournisseur f = fournisseurFacade.find(id_fournisseur);
        this.facture.setFournisseur(f);
        this.facture.setCheque(null);
        this.facture.setDatereglement(null);
        //this.facture.setEtat("NON-REGLE");

        this.factureFacade.create(this.facture);

        this.facture = new Facture();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Enrégistrement succes"));

        return null;
    }

    public List<Facture> getFilteredFacture() {
        return filteredFacture;
    }

    public void setFilteredFacture(List<Facture> filteredFacture) {
        this.filteredFacture = filteredFacture;
    }

    public void cancel() {
        this.facture = new Facture();
    }

    public String SupprimerFacture(int i) {
        try {
            Facture f = factureFacade.find(i);
            this.factureFacade.remove(f);
        } catch (Exception exception) {
            Logger.getLogger(factureBean.class.getName()).log(Level.SEVERE, null, exception);
        }
        return "listFacture.xhtml";
    }

    public void loadFacture() {
        System.out.println(" ************************* LOAD cheque ");
        System.out.println(" ************************* ID " + this.idfacture);

        facture = factureFacade.find(this.idfacture);
    }

    public int getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(int idfacture) {
        this.idfacture = idfacture;
    }

    public String edit() {
        Fournisseur f = fournisseurFacade.find(id_fournisseur);
        Cheque c = chequeFacade.find(idcheque);
        this.facture.setCheque(c);
        this.facture.setFournisseur(f);
        this.factureFacade.edit(facture);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modification effectué avec succès."));
        return null;
    }
    
    public String redirection(){
        return "listFacture.xhtml";
    }
    
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
     public String ajoutPage() {
        return "NouvelleFacture.xhtml";
    }
    public int getIdcheque() {
        return idcheque;
    }

    public void setIdcheque(int idcheque) {
        this.idcheque = idcheque;
    }

    public List<Cheque> getListcheque() {
        if(this.listcheque == null){
            this.listcheque = new ArrayList<Cheque>();
            this.listcheque = chequeFacade.findAll();
        }
        return listcheque;
    }

    public void setListcheque(List<Cheque> listcheque) {
        this.listcheque = listcheque;
    }
    
    
}
