/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.nomina.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sala_a
 */
@Entity
@Table(name = "PAGO", catalog = "", schema = "IS184508")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p")
    , @NamedQuery(name = "Pago.findByPagoid", query = "SELECT p FROM Pago p WHERE p.pagoid = :pagoid")
    , @NamedQuery(name = "Pago.findByTypeid", query = "SELECT p FROM Pago p WHERE p.typeid = :typeid")
    , @NamedQuery(name = "Pago.findById", query = "SELECT p FROM Pago p WHERE p.id = :id")
    , @NamedQuery(name = "Pago.findByPago", query = "SELECT p FROM Pago p WHERE p.pago = :pago")})
public class PagoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAGOID", nullable = false)
    private Long pagoid;
    @Size(max = 5)
    @Column(name = "TYPEID", length = 5)
    private String typeid;
    @Column(name = "ID")
    private Long id;
    @Column(name = "PAGO")
    private BigInteger pago;

    public PagoDTO() {
    }

    public PagoDTO(Long pagoid) {
        this.pagoid = pagoid;
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
        int hash = 0;
        hash += (pagoid != null ? pagoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoDTO)) {
            return false;
        }
        PagoDTO other = (PagoDTO) object;
        if ((this.pagoid == null && other.pagoid != null) || (this.pagoid != null && !this.pagoid.equals(other.pagoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.palitos.nomina.entidades.Pago[ pagoid=" + pagoid + " ]";
    }
    
}
