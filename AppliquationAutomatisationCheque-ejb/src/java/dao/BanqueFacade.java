/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Banque;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ismas
 */
@Stateless
public class BanqueFacade extends AbstractFacade<Banque> {

    @PersistenceContext(unitName = "AppliquationAutomatisationCheque-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BanqueFacade() {
        super(Banque.class);
    }
    
}
