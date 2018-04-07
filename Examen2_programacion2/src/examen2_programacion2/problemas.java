/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class problemas extends publicaciones{
    private ArrayList lista_resp=new ArrayList();
    private String estado;
    private int categoria;

    public problemas(String estado, int categoria, String ID, String mensajes, usuario_normal usuario_autor, String privacidad, Date fecha) {
        super(ID, mensajes, usuario_autor, privacidad, fecha);
        this.estado = estado;
        this.categoria = categoria;
    }

    

    public ArrayList<Integer> getLista_resp() {
        return lista_resp;
    }

    public void setLista_resp(ArrayList<Integer> lista_resp) {
        this.lista_resp = lista_resp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "problemas{" + "lista_resp=" + lista_resp + ", estado=" + estado + ", categoria=" + categoria + '}';
    }
    
    
    
}
