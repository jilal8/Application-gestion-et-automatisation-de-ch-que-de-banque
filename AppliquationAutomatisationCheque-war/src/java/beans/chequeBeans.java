/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import cbb.ConnectionBD;
import com.ibm.icu.text.RuleBasedNumberFormat;
import dao.BanqueFacade;
import dao.BarreeFacade;
import dao.ChequeFacade;
import dao.CompteFacade;
import dao.FactureFacade;
import dao.FournisseurFacade;
import entities.Banque;
import entities.Barree;
import entities.Cheque;
import entities.Compte;
import entities.Facture;
import entities.Fournisseur;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author ismas
 */
public class chequeBeans implements Serializable {

    @EJB
    private BarreeFacade barreeFacade;

    @EJB
    private FactureFacade factureFacade;

    @EJB
    private BanqueFacade banqueFacade;

    @EJB
    private CompteFacade compteFacade;

    @EJB
    private FournisseurFacade fournisseurFacade;

    @EJB
    private ChequeFacade chequeFacade;

    List<Cheque> listCheque = null;
    List<Fournisseur> lisrFournisseur = null;
    List<Compte> listCompte = null;
    List<Banque> listBanque = null;
    List<Facture> DropFacture = null;
    List<Facture> listeFacture = null;
    List<Cheque> filterCheque = null;
    List<Barree> listBaree = null;
    private Cheque cheque = null;

    static Facture selectedFACTURE;
    private Facture facture;
    private int id_compte = 0;
    private int id_banque = 0;
    private int id_fournisseur = 0;
    private static int idcheque = 0;
    private int id_barree = 0;
    int idselectedfacture = 0;
    private int montntcheque;
    JasperPrint jasperPrint;

    public chequeBeans() {
        cheque = new Cheque();
        DropFacture = new ArrayList<Facture>();
        facture = new Facture();
        selectedFACTURE = new Facture();
        // getListeFacture();
    }

    public List<Cheque> getListCheque() {
        if (this.listCheque == null) {
            this.listCheque = new ArrayList<Cheque>();
            this.listCheque = chequeFacade.findAll();
        }
        return listCheque;
    }

    public void setListCheque(List<Cheque> listCheque) {
        this.listCheque = listCheque;
    }

    public List<Fournisseur> getLisrFournisseur() {
        if (this.lisrFournisseur == null) {
            this.lisrFournisseur = new ArrayList<>();
            this.lisrFournisseur = fournisseurFacade.findAll();
        }
        return lisrFournisseur;
    }

    public void setLisrFournisseur(List<Fournisseur> lisrFournisseur) {
        this.lisrFournisseur = lisrFournisseur;
    }

    public List<Compte> getListCompte() {
        if (this.listCompte == null) {
            this.listCompte = new ArrayList<>();
            this.listCompte = compteFacade.findAll();
        }
        return listCompte;
    }

    public void setListCompte(List<Compte> listCompte) {
        this.listCompte = listCompte;
    }

    public List<Banque> getListBanque() {
        if (this.listBanque == null) {
            this.listBanque = new ArrayList<>();
            this.listBanque = this.banqueFacade.findAll();

        }
        return listBanque;
    }

    public void setListBanque(List<Banque> listBanque) {
        this.listBanque = listBanque;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public int getId_banque() {
        return id_banque;
    }

    public void setId_banque(int id_banque) {
        this.id_banque = id_banque;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public List<Cheque> getFilterCheque() {
        return filterCheque;
    }

    public void setFilterCheque(List<Cheque> filterCheque) {
        this.filterCheque = filterCheque;
    }

    public int getIdcheque() {
        return idcheque;
    }

    public void setIdcheque(int idcheque) {
        chequeBeans.idcheque = idcheque;
    }

    public void loadReglement() {
        System.out.println(" ************************* LOAD cheque ");
        System.out.println(" ************************* ID " + this.idcheque);

        cheque = chequeFacade.find(this.idcheque);
    }

    public void loadfacture() {
        System.out.println(" ************************* LOAD cheque ");
        System.out.println(" ************************* ID " + this.idselectedfacture);

        facture = factureFacade.find(this.idselectedfacture);
    }

    public void loadcheque() {
        System.out.println(" ************************* LOAD cheque ");
        System.out.println(" ************************* ID " + this.idcheque);

        cheque = chequeFacade.find(this.idcheque);
    }
    
    public String redirection(){
        return "listeCheques.xhtml";
    }
    

    public String edit() {
        System.out.println("la teaille de la liste selection est :" + DropFacture.size());
        Fournisseur f = fournisseurFacade.find(this.id_fournisseur);
        cheque.setFournisseur(f);
        Compte c = compteFacade.find(this.id_compte);
        cheque.setCompt(c);
        Banque b = banqueFacade.find(this.id_banque);
        cheque.setBanque(b);
        Barree br = barreeFacade.find(this.id_barree);
        cheque.setEstBaree(br);
        
        if (this.cheque.getFacture()!= null) {
            System.out.println("les deux ne sont pas vides "+" la liste de fature regleé "+cheque.getFacture().size()
            +" la liste de facture non regé "+DropFacture.size());
          /*  for (int i = 0; i < this.DropFacture.size(); i++) {
                cheque.getFacture().add(DropFacture.get(i));
                DropFacture.get(i).setEtat("REGLE");
                
            }
            int mnt = 0;
            for (Facture f1 : cheque.getFacture()) {
                mnt += f1.getMontant();
            }
            cheque.setMontant(mnt);
            chequeFacade.edit(cheque);*/
        } else{
            System.out.println("la liste de facture non reglé est vide ou null");
        }
           /* this.cheque.setFacture(DropFacture);
        

        chequeFacade.edit(cheque);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modification effectué avec succès."));*/
        return null;
    }

    public int getIdSelectedFacture() {
        return this.idselectedfacture;
    }

    public void setIdSelectedFacture(int id) {
        this.idselectedfacture = id;
    }

    public Facture getFacture() {
        return this.facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public String imprimerEtat(Cheque c) throws Exception {

        c = chequeFacade.find(idcheque);
//        System.out.println("le nom de banque du cheque est :" + c.getBanque().getNom());
//        Connection connexion = null;
//        ConnectionBD myConnection = new ConnectionBD();
//        connexion = myConnection.getconnection();
        initialiserImpression(c.getId());
        impression();

        return null;
    }

    public void initialiserImpression(int id) throws JRException, SQLException {

        Connection connection;
        ConnectionBD maconnection = new ConnectionBD();
        connection = maconnection.getconnection();

        Map parameters = new HashMap();
        parameters.put("idcheque", id);
        String reportsDirPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/rapport/salaam.jasper");

        parameters.put("repertoire", reportsDirPath);
        String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("WEB-INF/classes/rapport/salaam.jasper");
        jasperPrint = JasperFillManager.fillReport(reportPath, parameters, connection);

//        System.out.println("verifier votre connection!!!");

    }

    public void impression() throws JRException, IOException, SQLException {

        HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        httpServletResponse.addHeader("Content-disposition", "attachment; filename=report.pdf");
        ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            FacesContext.getCurrentInstance().responseComplete();
//        if (this.jasperPrint == null) {
//            System.out.println("votre jasperprint est null");
//        } else {
//            
//        }

    }

    public List<Facture> getListeFacture() {
        if (this.listeFacture == null) {
            this.listeFacture = new ArrayList<Facture>();
            this.listeFacture = factureFacade.listeNonRegle();
            System.out.println("la taille de la liste de facture non reglé " + listeFacture.size());
        }
        return listeFacture;
    }

    public void setListeFacture(List<Facture> listeFacture) {
        this.listeFacture = listeFacture;
    }

    public String cancel() {
        cheque = new Cheque();
        return null;
    }

    public String cancel1() {

        return "ListeCheques.xhtml";
    }

    public void onFactureDrop(DragDropEvent ddEvent) {

        Facture fac = ((Facture) ddEvent.getData());

        DropFacture.add(fac);
        listeFacture.remove(fac);
        System.out.println("la taille de la liste selectionnée " + DropFacture.size());
        int montant = 0;
        for (Facture f : DropFacture) {
            montant = montant + f.getMontant();

        }
        setMontntcheque(montant);
        System.out.println("le montant du cheque " + this.getMontntcheque());
        cheque.setMontant(montant);

    }
    
      public String separateurpourcheque(String chaine)
    {
        String montant ="";
        DecimalFormat formatter = new DecimalFormat("##,###.##");
        montant = formatter.format(Integer.parseInt(chaine));

        return montant;
    }
      
       public String formatlettre(int montant)
    {
             double num = Double.parseDouble(""+montant);
             RuleBasedNumberFormat formatter = new RuleBasedNumberFormat(Locale.FRANCE, RuleBasedNumberFormat.SPELLOUT);
             String result = "# "+formatter.format(num)+" fdj #";

             return result;
    }

    public void setDropFacture(List<Facture> DropFacture) {
        this.DropFacture = DropFacture;
    }

    public int getMontntcheque() {
        return montntcheque;
    }

    public void setMontntcheque(int montntcheque) {
        this.montntcheque = montntcheque;
    }

    public List<Facture> getDropFacture() {
        return DropFacture;
    }

    public Facture getSelectedFACTURE() {
        return selectedFACTURE;
    }

    //pour renregistrer un nouveau cheqque
    public String createCheque() {
        System.out.println("je suis dans la methode si tu me croit pas...kkkkk" + this.DropFacture.size());
        int mon = calculeMontant(DropFacture);
        System.out.println("le montant du cheque est " + mon);
        if (id_fournisseur == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Vous devez choisir un fournisseur"));

        } else {
            Fournisseur fourisseur = fournisseurFacade.find(id_fournisseur);
            this.cheque.setFournisseur(fourisseur);
        }
        if (id_compte == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Vous devez choisir un Compte"));
        } else {
            Compte c = compteFacade.find(id_compte);
            this.cheque.setCompt(c);
        }
        System.out.println("la taille de la liste selectionnée " + DropFacture.size());
        if (DropFacture.size() > 0) {
            this.cheque.setFacture(DropFacture);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Un chèque doit obligatoirement reglé au moin une facture."));
        }
        if (id_banque != 0) {
            Banque b = banqueFacade.find(id_banque);
            this.cheque.setBanque(b);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("vous devez choisir un banque pour cet cheque."));
        }
        if (id_barree == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("vous devez choisir un banque pour cet cheque."));
        } else {
            Barree bb = barreeFacade.find(id_barree);
            this.cheque.setEstBaree(bb);
        }
        
        this.cheque.setMontant(mon);
        
       String mn = this.formatlettre(mon);
       this.cheque.setMontantLettre(mn);
        this.cheque.setDatecheque(new Date());
        this.chequeFacade.create(cheque);
        reglementFacture(this.cheque.getFacture(), this.cheque);
        cancel();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Chèque enrégistrer avec succès"));
        return null;
    }
//pour metre a jour le date de reglement et cheque qui nous a permit de regler la facture

    public void reglementFacture(List<Facture> facture, Cheque chequ) {
        for (Facture f : facture) {
            f.setDatereglement(new Date());
            f.setEtat("REGLE");
            f.setCheque(chequ);
            this.factureFacade.edit(f);
        }

        this.chequeFacade.edit(chequ);
    }

    public String ajoutPage() {
        return "../Enregistrement/NouveauCheque.xhtml";
    }

    //pour calculer le montant du cheque
    public int calculeMontant(List<Facture> fac) {
        int sommeMontant = 0;
        for (Facture f : fac) {
            sommeMontant = sommeMontant + f.getMontant();
        }
        return sommeMontant;
    }

    public int getId_barree() {
        return id_barree;
    }

    public void setId_barree(int id_barree) {
        this.id_barree = id_barree;
    }

    public List<Barree> getListBaree() {
        if (this.listBaree == null) {
            this.listBaree = new ArrayList<Barree>();
            this.listBaree = barreeFacade.findAll();
        }
        return listBaree;
    }

    public void setListBaree(List<Barree> listBaree) {
        this.listBaree = listBaree;
    }

    //pour supprimer un cheque
    public String SupprimerCheque(int id) {
        try {
            System.out.println("je suis dans la methode");
            Cheque c = chequeFacade.find(id);
            this.chequeFacade.remove(c);
            addMessage("Succes suppression", "suppression faite avec succes.");
        } catch (Exception exception) {
            Logger.getLogger(chequeBeans.class.getName()).log(Level.SEVERE, null, exception);
        }
        return null;
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
