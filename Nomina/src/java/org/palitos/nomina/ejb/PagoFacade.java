/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.nomina.ejb;

import org.palitos.nomina.ejb.impl.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.palitos.nomina.entidades.PagoDTO;

/**
 *
 * @author sala_a
 */
@Stateless
public class PagoFacade extends AbstractFacade<PagoDTO> {

    @PersistenceContext(unitName = "NominaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PagoFacade() {
        super(PagoDTO.class);
    }
    
}
