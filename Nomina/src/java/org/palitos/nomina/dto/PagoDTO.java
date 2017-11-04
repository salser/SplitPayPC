/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.nomina.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sala_a
 */
@XmlRootElement(name="pago") // Para saver que va a ser utilizado para un web service
public class PagoDTO implements Serializable{
    
    private Long pagoid;
    private String typeid;
    private Long id;
    private BigInteger pago;

    public PagoDTO(Long pagoid, String typeid, Long id, BigInteger pago) {
        this.pagoid = pagoid;
        this.typeid = typeid;
        this.id = id;
        this.pago = pago;
    }
    
    

    public Long getPagoid() {
        return pagoid;
    }

    public void setPagoid(Long pagoid) {
        this.pagoid = pagoid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getPago() {
        return pago;
    }

    public void setPago(BigInteger pago) {
        this.pago = pago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.pagoid);
        hash = 71 * hash + Objects.hashCode(this.typeid);
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.pago);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PagoDTO other = (PagoDTO) obj;
        return true;
    }
    private static final Logger LOG = Logger.getLogger(PagoDTO.class.getName());

    @Override
    public String toString() {
        return "Pago{" + "pagoid=" + pagoid + ", typeid=" + typeid + ", id=" + id + ", pago=" + pago + '}';
    }
    
    
    
}
