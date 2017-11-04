/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sala_a
 */
@Entity
@Table(name = "GRUPO", catalog = "", schema = "IS184510")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g")
    , @NamedQuery(name = "Grupo.findByGroupid", query = "SELECT g FROM Grupo g WHERE g.groupid = :groupid")
    , @NamedQuery(name = "Grupo.findByDisplayname", query = "SELECT g FROM Grupo g WHERE g.displayname = :displayname")
    , @NamedQuery(name = "Grupo.findByIsactive", query = "SELECT g FROM Grupo g WHERE g.isactive = :isactive")})
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GROUPID", nullable = false)
    private Long groupid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DISPLAYNAME", nullable = false, length = 30)
    private String displayname;
    @Column(name = "ISACTIVE")
    private Short isactive;
    @JoinColumn(name = "LEADERID", referencedColumnName = "USERID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario leaderid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupid", fetch = FetchType.LAZY)
    private List<Miembro> miembroList;
    @OneToMany(mappedBy = "groupid", fetch = FetchType.LAZY)
    private List<Factura> facturaList;

    public Grupo() {
    }

    public Grupo(Long groupid) {
        this.groupid = groupid;
    }

    public Grupo(Long groupid, String displayname) {
        this.groupid = groupid;
        this.displayname = displayname;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Short getIsactive() {
        return isactive;
    }

    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }

    public Usuario getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Usuario leaderid) {
        this.leaderid = leaderid;
    }

    @XmlTransient
    public List<Miembro> getMiembroList() {
        return miembroList;
    }

    public void setMiembroList(List<Miembro> miembroList) {
        this.miembroList = miembroList;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupid != null ? groupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.groupid == null && other.groupid != null) || (this.groupid != null && !this.groupid.equals(other.groupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.palitos.negocio.entidades.Grupo[ groupid=" + groupid + " ]";
    }
    
}
