/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class publicaciones implements Serializable{
    private String ID;
    private String mensajes;
    private usuario_normal usuario_autor;
    private String privacidad;
    private Date fecha;
    private static final long SerialVersionUID=777L;//ver
    
    
    public publicaciones(String ID, String mensajes, usuario_normal usuario_autor, String privacidad, Date fecha) {
        this.ID = ID;
        this.mensajes = mensajes;
        this.usuario_autor = usuario_autor;
        this.privacidad = privacidad;
        this.fecha = fecha;
    }

    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }

   

    public usuario_normal getUsuario_autor() {
        return usuario_autor;
    }

    public void setUsuario_autor(usuario_normal usuario_autor) {
        this.usuario_autor = usuario_autor;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "publicaciones{" + "ID=" + ID + ", mensajes=" + mensajes + ", usuario_autor=" + usuario_autor + ", privacidad=" + privacidad + ", fecha=" + fecha + '}';
    }
    
    
    
}
