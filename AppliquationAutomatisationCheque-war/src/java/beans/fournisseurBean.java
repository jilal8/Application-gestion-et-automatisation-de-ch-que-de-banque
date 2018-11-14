/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.FournisseurFacade;
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
public class fournisseurBean {

    @EJB
    private FournisseurFacade fournisseurFacade;

    List<Fournisseur> listeDeFournisseur = null;
    List<Fournisseur> filteredFournisseur = null;
    int idfournisseur = 0;
    Fournisseur fournisseur = null;

    public fournisseurBean() {
        fournisseur = new Fournisseur();
    }

    public List<Fournisseur> getListeDeFournisseur() {
        if (this.listeDeFournisseur == null) {
            this.listeDeFournisseur = new ArrayList<>();
            this.listeDeFournisseur = this.fournisseurFacade.findAll();
        }
        return listeDeFournisseur;
    }

    public void setListeDeFournisseur(List<Fournisseur> listeDeFournisseur) {
        this.listeDeFournisseur = listeDeFournisseur;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String createFournisseur() {
        this.fournisseurFacade.create(fournisseur);
        this.fournisseur = new Fournisseur();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Enrégistrement succès"));
        return null;
    }

    public void cancel() {
        this.fournisseur = new Fournisseur();
    }

    public List<Fournisseur> getFilteredFournisseur() {
        return filteredFournisseur;
    }

    public String redirection() {
        return "ListeDeFournisseur.xhtml";
    }

    public String ajoutPage() {
        return "NouveauFournisseur.xhtml";
    }

    public void setFilteredFournisseur(List<Fournisseur> filteredFournisseur) {
        this.filteredFournisseur = filteredFournisseur;
    }

    public String SupprimerFournisseur(int id) {
        try {
            Fournisseur four = fournisseurFacade.find(id);
            this.fournisseurFacade.remove(four);
            addMessage("Succes", "succes suppression");
        } catch (Exception exception) {
            Logger.getLogger(fournisseurBean.class.getName()).log(Level.SEVERE, null, exception);
        }
        return "listeCheques.xhtml";
    }
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    public void loadFournisseur() {
        System.out.println(" ************************* LOAD fournisseur ");
        System.out.println(" ************************* ID " + this.idfournisseur);

        fournisseur = fournisseurFacade.find(this.idfournisseur);
    }

    public int getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public String edit() {

        this.fournisseurFacade.edit(fournisseur);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modification effectué avec succès."));
        return null;
    }
}
