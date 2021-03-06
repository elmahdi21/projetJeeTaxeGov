/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TaxeIrEmploye;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ushiho
 */
@Stateless
public class TaxeIrEmployeFacade extends AbstractFacade<TaxeIrEmploye> {

    @PersistenceContext(unitName = "Projet_JEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaxeIrEmployeFacade() {
        super(TaxeIrEmploye.class);
    }
    
}
