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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sala_a
 */
@Entity
@Table(name = "MIEMBRO", catalog = "", schema = "IS184510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Miembro.findAll", query = "SELECT m FROM Miembro m")
    , @NamedQuery(name = "Miembro.findByIdmember", query = "SELECT m FROM Miembro m WHERE m.idmember = :idmember")
    , @NamedQuery(name = "Miembro.findByBalance", query = "SELECT m FROM Miembro m WHERE m.balance = :balance")})
public class Miembro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMEMBER", nullable = false)
    private Long idmember;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BALANCE", precision = 11, scale = 3)
    private BigDecimal balance;
    @JoinColumn(name = "GROUPID", referencedColumnName = "GROUPID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Grupo groupid;
    @JoinColumn(name = "USERID", referencedColumnName = "USERID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario userid;
    @OneToMany(mappedBy = "idmember", fetch = FetchType.LAZY)
    private List<Deuda> deudaList;

    public Miembro() {
    }

    public Miembro(Long idmember) {
        this.idmember = idmember;
    }

    public Long getIdmember() {
        return idmember;
    }

    public void setIdmember(Long idmember) {
        this.idmember = idmember;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Grupo getGroupid() {
        return groupid;
    }

    public void setGroupid(Grupo groupid) {
        this.groupid = groupid;
    }

    public Usuario getUserid() {
        return userid;
    }

    public void setUserid(Usuario userid) {
        this.userid = userid;
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
        hash += (idmember != null ? idmember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Miembro)) {
            return false;
        }
        Miembro other = (Miembro) object;
        if ((this.idmember == null && other.idmember != null) || (this.idmember != null && !this.idmember.equals(other.idmember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.palitos.negocio.entidades.Miembro[ idmember=" + idmember + " ]";
    }
    
}
