/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class comentarios extends publicaciones{
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public comentarios(String contenido, String ID, String mensajes, usuario_normal usuario_autor, String privacidad, Date fecha) {
        super(ID, mensajes, usuario_autor, privacidad, fecha);
        this.contenido = contenido;
    }

    

    @Override
    public String toString() {
        return "comentarios{"  +contenido +"}";
    }
    
}
