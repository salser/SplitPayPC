/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palitos.negocio.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.rpc.encoding.Serializer;

/**
 *
 * @author sala_a
 */
@XmlRootElement(name="usuario") // Para saver que va a ser utilizado para un web service
public class UsuarioDTO implements Serializable{
    
    
    private Long userid;
     private String typeid;
     private Long id;
    private String password;
    private String email;
    private String displayname;
    private Short isoffline;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Short getIsoffline() {
        return isoffline;
    }

    public void setIsoffline(Short isoffline) {
        this.isoffline = isoffline;
    }

   
    
    
    
}

