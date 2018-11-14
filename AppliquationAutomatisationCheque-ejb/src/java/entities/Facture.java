/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "facture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f"),
    @NamedQuery(name = "Facture.findById", query = "SELECT f FROM Facture f WHERE f.id = :id"),
    @NamedQuery(name = "Facture.findByNumero", query = "SELECT f FROM Facture f WHERE f.numero = :numero"),
    @NamedQuery(name = "Facture.findByDatereglement", query = "SELECT f FROM Facture f WHERE f.datereglement = :datereglement"),
    @NamedQuery(name = "Facture.findByMontant", query = "SELECT f FROM Facture f WHERE f.montant = :montant"),
    @NamedQuery(name = "Facture.findByEtat", query = "SELECT f FROM Facture f WHERE f.etat = :etat")})
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Numero")
    private String numero;
    @Basic(optional = false)
    
    @Column(name = "datereglement")
    @Temporal(TemporalType.DATE)
    private Date datereglement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montant")
    private int montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "etat")
    private String etat;
    
    @OneToOne()
    private Fournisseur fournisseur;
    @OneToOne()
    private Cheque cheque;

    public Facture() {
    }

    public Facture(Integer id) {
        this.id = id;
    }

    public Facture(Integer id, String numero, Date datereglement, int montant, String etat) {
        this.id = id;
        this.numero = numero;
        this.datereglement = datereglement;
        this.montant = montant;
        this.etat = etat;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDatereglement() {
        return datereglement;
    }

    public void setDatereglement(Date datereglement) {
        this.datereglement = datereglement;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
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
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Facture[ id=" + id + " ]";
    }
    
}
