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
public class admin_usuario_normal {
    private ArrayList<usuario_normal> listas_usuario_normal=new ArrayList();
    private File archivo=null;
     public admin_usuario_normal(String path) {
        archivo=new File(path);
    }

    public ArrayList<usuario_normal> getListas_usuario_normal() {
        return listas_usuario_normal;
    }

    public void setListas_usuario_normal(ArrayList<usuario_normal> listas_usuario_normal) {
        this.listas_usuario_normal = listas_usuario_normal;
    }

  

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     
     public void set_usuario_comun(usuario_normal a){
        listas_usuario_normal.add(a);
    }
    
    public void cargarArchivo(){
        try {
         listas_usuario_normal=new ArrayList();
         usuario_normal temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(usuario_normal)objeto.readObject())!=null){
                     listas_usuario_normal.add(temp);
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
         for (usuario_normal t : listas_usuario_normal) {
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


