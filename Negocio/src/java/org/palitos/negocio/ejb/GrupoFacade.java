/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.ejb;

import org.palitos.negocio.ejb.impl.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.palitos.negocio.entidades.Grupo;

/**
 *
 * @author sala_a
 */
@Stateless
public class GrupoFacade extends AbstractFacade<Grupo> {

    @PersistenceContext(unitName = "NegocioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoFacade() {
        super(Grupo.class);
    }
    
}
