/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.webservice;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.palitos.negocio.dto.UsuarioDTO;
import org.palitos.negocio.ejb.UsuarioService;

/**
 *
 * @author sala_a
 */
@WebService(serviceName = "UsuarioWS")
@Stateless()
public class UsuarioWS {

    @EJB
    private UsuarioService ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "findUsuarioID")
    public UsuarioDTO findUsuarioID(@WebParam(name = "id") String id) {
        return ejbRef.findUsuarioID(id);
    }

    @WebMethod(operationName = "findUsuarios")
    public List<UsuarioDTO> findUsuarios() {
        return ejbRef.findUsuarios();
    }
    
}
