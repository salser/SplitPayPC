/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import org.apache.commons.beanutils.BeanUtils;
import org.jboss.logging.Logger;
import org.palitos.negocio.dto.UsuarioDTO;
import org.palitos.negocio.entidades.Usuario;

/**
 *
 * @author sala_a
 */
@Stateless
@LocalBean
public class UsuarioService {

    @EJB
    private UsuarioFacade usuarioFacade;

    private static Logger logger = Logger.getLogger(UsuarioDTO.class);

    public UsuarioDTO findUsuarioID(String id) {

        UsuarioDTO salida = new UsuarioDTO();

        try {

            Usuario usuario = usuarioFacade.find(id);

            if (usuario != null) {

                salida = fromEntity2DTO(usuario);

            }

        } catch (Exception e) {
            logger.error("Error al ejecutar el metodo findUsuarioID",e);
        }

        return salida;
    }

    private UsuarioDTO fromEntity2DTO(Usuario ent) {

        UsuarioDTO dto = new UsuarioDTO();
        try {
            BeanUtils.copyProperties(dto, ent);
        } catch (Exception e) {
        }
        return dto;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List<UsuarioDTO> findUsuarios() {

        List<UsuarioDTO> dtos = new ArrayList<UsuarioDTO>();

        try {
            List<Usuario> usuarios = usuarioFacade.findAll();
            if (!usuarios.isEmpty()) {
                for (Usuario u : usuarios) {

                    dtos.add(fromEntity2DTO(u));
                }
            }
        } catch (Exception e) {
            logger.error("Error al ejecutar el metodo findUsuarios",e);
        }

        return null;
    }
}
