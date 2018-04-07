/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_programacion2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class admin_usuario_administrador {
    private ArrayList<usuario_administrador> listas_usuario_administrador=new ArrayList();
    private File archivo=null;
     public admin_usuario_administrador(String path) {
        archivo=new File(path);
    }

    public ArrayList<usuario_administrador> getListas_usuario_administrador() {
        return listas_usuario_administrador;
    }

    public void setListas_usuario_administrador(ArrayList<usuario_administrador> listas_usuario_administrador) {
        this.listas_usuario_administrador = listas_usuario_administrador;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     
      public void set_usuario_administrador(usuario_administrador a){
        listas_usuario_administrador.add(a);
    }
    
    public void cargarArchivo(){
        try {
         listas_usuario_administrador=new ArrayList();
         usuario_administrador temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(usuario_administrador)objeto.readObject())!=null){
                     listas_usuario_administrador.add(temp);
                 }
             } catch (EOFException e) {
                 //ENCONTRO EL FINAL DEL ARCHIVO
             }
             objeto.close();
             entrada.close();
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
    public void escribirArchivo(){
         FileOutputStream fw=null;
     ObjectOutputStream bw=null;
     
     try {
         
         fw=new FileOutputStream(archivo);
         bw=new ObjectOutputStream(fw);
         for (usuario_administrador t : listas_usuario_administrador) {
             bw.writeObject(t);
             
         }
         bw.flush();
         
         
     } catch (Exception ex) {
     }finally{
         try {
             bw.close();
             fw.close();
         } catch (Exception e) {
         }
     }
 }
}
