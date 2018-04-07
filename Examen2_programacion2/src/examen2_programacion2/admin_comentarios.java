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
public class admin_comentarios {
     private ArrayList<comentarios> listas_comentarios=new ArrayList();
    private File archivo=null;
     public admin_comentarios(String path) {
        archivo=new File(path);
    
     }

    public ArrayList<comentarios> getListas_comentarios() {
        return listas_comentarios;
    }

    public void setListas_comentarios(ArrayList<comentarios> listas_comentarios) {
        this.listas_comentarios = listas_comentarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
       public void set_comentarios(comentarios a){
        listas_comentarios.add(a);
    }
    
    public void cargarArchivo(){
        try {
         listas_comentarios=new ArrayList();
         comentarios temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(comentarios)objeto.readObject())!=null){
                     listas_comentarios.add(temp);
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
         for (comentarios t : listas_comentarios) {
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
