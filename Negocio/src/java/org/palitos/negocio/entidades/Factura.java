/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sala_a
 */
@Entity
@Table(name = "FACTURA", catalog = "", schema = "IS184510", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"EXPENSETITLE"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByBillid", query = "SELECT f FROM Factura f WHERE f.billid = :billid")
    , @NamedQuery(name = "Factura.findByAmount", query = "SELECT f FROM Factura f WHERE f.amount = :amount")
    , @NamedQuery(name = "Factura.findByExpensetitle", query = "SELECT f FROM Factura f WHERE f.expensetitle = :expensetitle")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BILLID", nullable = false)
    private Long billid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT", precision = 11, scale = 2)
    private BigDecimal amount;
    @Size(max = 50)
    @Column(name = "EXPENSETITLE", length = 50)
    private String expensetitle;
    @JoinColumn(name = "GROUPID", referencedColumnName = "GROUPID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grupo groupid;
    @OneToMany(mappedBy = "idbill", fetch = FetchType.LAZY)
    private List<Deuda> deudaList;

    public Factura() {
    }

    public Factura(Long billid) {
        this.billid = billid;
    }

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getExpensetitle() {
        return expensetitle;
    }

    public void setExpensetitle(String expensetitle) {
        this.expensetitle = expensetitle;
    }

    public Grupo getGroupid() {
        return groupid;
    }

    public void setGroupid(Grupo groupid) {
        this.groupid = groupid;
    }

    @XmlTransient
    public List<Deuda> getDeudaList() {
        return deudaList;
    }

    public void setDeudaList(List<Deuda> deudaList) {
        this.deudaList = deudaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billid != null ? billid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.billid == null && other.billid != null) || (this.billid != null && !this.billid.equals(other.billid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.palitos.negocio.entidades.Factura[ billid=" + billid + " ]";
    }
    
}
