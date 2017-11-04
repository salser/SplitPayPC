/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sala_a
 */
@Entity
@Table(name = "DEUDA", catalog = "", schema = "IS184510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deuda.findAll", query = "SELECT d FROM Deuda d")
    , @NamedQuery(name = "Deuda.findByIdebt", query = "SELECT d FROM Deuda d WHERE d.idebt = :idebt")
    , @NamedQuery(name = "Deuda.findByDebt", query = "SELECT d FROM Deuda d WHERE d.debt = :debt")})
public class Deuda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEBT", nullable = false)
    private Long idebt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBT", precision = 11, scale = 2)
    private BigDecimal debt;
    @JoinColumn(name = "IDBILL", referencedColumnName = "BILLID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Factura idbill;
    @JoinColumn(name = "IDMEMBER", referencedColumnName = "IDMEMBER")
    @ManyToOne(fetch = FetchType.LAZY)
    private Miembro idmember;

    public Deuda() {
    }

    public Deuda(Long idebt) {
        this.idebt = idebt;
    }

    public Long getIdebt() {
        return idebt;
    }

    public void setIdebt(Long idebt) {
        this.idebt = idebt;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public Factura getIdbill() {
        return idbill;
    }

    public void setIdbill(Factura idbill) {
        this.idbill = idbill;
    }

    public Miembro getIdmember() {
        return idmember;
    }

    public void setIdmember(Miembro idmember) {
        this.idmember = idmember;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idebt != null ? idebt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deuda)) {
            return false;
        }
        Deuda other = (Deuda) object;
        if ((this.idebt == null && other.idebt != null) || (this.idebt != null && !this.idebt.equals(other.idebt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.palitos.negocio.entidades.Deuda[ idebt=" + idebt + " ]";
    }
    
}
