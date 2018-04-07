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
public class admin_solicitudes {
    private ArrayList<solicitudes> listas_solicitudes=new ArrayList();
    private File archivo=null;
     public admin_solicitudes(String path) {
        archivo=new File(path);
    }

    public ArrayList<solicitudes> getListas_solicitudes() {
        return listas_solicitudes;
    }

    public void setListas_solicitudes(ArrayList<solicitudes> listas_solicitudes) {
        this.listas_solicitudes = listas_solicitudes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
      public void set_solicitud(solicitudes a){
        listas_solicitudes.add(a);
    }
    
    public void cargarArchivo(){
        try {
         listas_solicitudes=new ArrayList();
         solicitudes temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(solicitudes)objeto.readObject())!=null){
                     listas_solicitudes.add(temp);
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
         for (solicitudes t : listas_solicitudes) {
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
