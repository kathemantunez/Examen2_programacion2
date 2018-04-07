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
public class admin_respuestas {
     private ArrayList<Respuestas> listas_respuestas=new ArrayList();
    private File archivo=null;
     public admin_respuestas(String path) {
        archivo=new File(path);
    
     }

    public ArrayList<Respuestas> getListas_respuestas() {
        return listas_respuestas;
    }

    public void setListas_respuestas(ArrayList<Respuestas> listas_respuestas) {
        this.listas_respuestas = listas_respuestas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     
     public void set_respuestas(Respuestas a){
        listas_respuestas.add(a);
    }
    
    public void cargarArchivo(){
        try {
         listas_respuestas=new ArrayList();
         Respuestas temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(Respuestas)objeto.readObject())!=null){
                     listas_respuestas.add(temp);
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
         for (Respuestas t : listas_respuestas) {
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
