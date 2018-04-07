/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.io.Serializable;

/**
 *
 * @author KATHERINE
 */
class solicitudes implements Serializable{
    private usuario_normal emisor;
    
    private usuario_normal receptor;
private static final long SerialVersionUID=777L;//version
    public solicitudes(usuario_normal emisor, usuario_normal receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public usuario_normal getEmisor() {
        return emisor;
    }

    public void setEmisor(usuario_normal emisor) {
        this.emisor = emisor;
    }

    public usuario_normal getReceptor() {
        return receptor;
    }

    public void setReceptor(usuario_normal receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return  emisor.toString() ;
    }

    
    
    
    
    
}
