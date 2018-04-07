/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author KATHERINE
 */
public class usuario_administrador extends Usuario{
    private ArrayList<publicaciones> publicaciones_bloquedas =new ArrayList();
    private ArrayList<usuario_normal> usuario_normal_bloqueado=new ArrayList();
    private String nombre2;

    public usuario_administrador(String nombre2, String nombre, String correo, Date fecha, String usuario, String contraseña, Icon imagen) {
        super(nombre, correo, fecha, usuario, contraseña, imagen);
        this.nombre2 = nombre2;
    }

    public ArrayList<publicaciones> getPublicaciones() {
        return publicaciones_bloquedas;
    }

    public void setPublicaciones(publicaciones publicaciones) {
        this.publicaciones_bloquedas.add(publicaciones);
    }

    public ArrayList<usuario_normal> getUsuario_normal_bloqueado() {
        return usuario_normal_bloqueado;
    }

    public void setUsuario_normal_bloqueado(usuario_normal usuario_normal_bloqueado) {
        this.usuario_normal_bloqueado.add(usuario_normal_bloqueado);
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    @Override
    public String toString() {
        return nombre2;
    }
    
}
