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
public class usuario_normal extends Usuario{
    private ArrayList<publicaciones> publicaciones=new ArrayList();
    private ArrayList<amigos> amigos=new ArrayList();
    private  ArrayList<solicitudes> solicitudes=new ArrayList();
    private String nombre2;

    public usuario_normal(String nombre2, String nombre, String correo, Date fecha, String usuario, String contraseña, Icon imagen) {
        super(nombre, correo, fecha, usuario, contraseña, imagen);
        this.nombre2 = nombre2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    

    public ArrayList<publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(publicaciones publicaciones) {
        this.publicaciones.add(publicaciones);
    }

    public ArrayList<amigos> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<amigos> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<solicitudes> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(solicitudes solicitudes) {
        this.solicitudes.add(solicitudes);
    }

    @Override
    public String toString() {
        return nombre2;
    }

    
    
    
}
