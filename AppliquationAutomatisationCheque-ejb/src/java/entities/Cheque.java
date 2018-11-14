/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ismas
 */
@Entity
@Table(name = "cheque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheque.findAll", query = "SELECT c FROM Cheque c"),
    @NamedQuery(name = "Cheque.findById", query = "SELECT c FROM Cheque c WHERE c.id = :id"),
    @NamedQuery(name = "Cheque.findByDatecheque", query = "SELECT c FROM Cheque c WHERE c.datecheque = :datecheque"),
    @NamedQuery(name = "Cheque.findByMontant", query = "SELECT c FROM Cheque c WHERE c.montant = :montant"),
    @NamedQuery(name = "Cheque.findByNumeroCheque", query = "SELECT c FROM Cheque c WHERE c.numeroCheque = :numeroCheque")})
public class Cheque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Datecheque")
    @Temporal(TemporalType.DATE)
    private Date datecheque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montant")
    private int montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 65)
    @Column(name = "NumeroCheque")
    private String numeroCheque;
    private String montantLettre;
    
     @OneToOne()
    private Compte compt;
    
    @OneToOne()
    private Fournisseur fournisseur;
    
    @OneToOne()
    private Banque banque;
    
    @OneToOne()
    private Barree estBaree;
    @OneToMany()
    private List<Facture> facture;
    
    public Cheque() {
    }

    public Cheque(Integer id) {
        this.id = id;
    }

    public Cheque(Integer id, Date datecheque, int montant, String numeroCheque) {
        this.id = id;
        this.datecheque = datecheque;
        this.montant = montant;
        this.numeroCheque = numeroCheque;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatecheque() {
        return datecheque;
    }

    public void setDatecheque(Date datecheque) {
        this.datecheque = datecheque;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Compte getCompt() {
        return compt;
    }

    public void setCompt(Compte compt) {
        this.compt = compt;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Barree getEstBaree() {
        return estBaree;
    }

    public void setEstBaree(Barree estBaree) {
        this.estBaree = estBaree;
    }

    public List<Facture> getFacture() {
        return facture;
    }

    public void setFacture(List<Facture> facture) {
        this.facture = facture;
    }

    public String getMontantLettre() {
        return montantLettre;
    }

    public void setMontantLettre(String montantLettre) {
        this.montantLettre = montantLettre;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cheque[ id=" + id + " ]";
    }
    
}
