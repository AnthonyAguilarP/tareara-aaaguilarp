/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dol.Autor;
import dol.Libro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author JADPA-02
 */
public class Almacen {
    public static String Direccion(){
        File Archivo=new File("Almacen");
        return Archivo.getAbsolutePath();
    }
    public static void al(){
        File Archivo=new File("Almacen");
        Archivo.mkdir();
        File Archivo1=new File(Direccion(),"Libro");
        Archivo1.mkdir();
        File Archivo2=new File(Direccion(),"Autor");
        Archivo2.mkdir();
    }
    public static void addLibros(ArrayList<Libro>l){
        String txt="";
        int i=0;
        if(!l.isEmpty()){
            for(Libro book:l){
                txt=l.get(i).toString()+"\n................................\n";
                i++;
            }
        }
        File a=new File(Direccion()+"\\Libro",UUID.randomUUID().toString());
        try{
        a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(txt);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                }
    public static void addAutores(ArrayList<Autor>l){
        String txt="";
        int i=0;
        if(!l.isEmpty()){
            for(Autor au:l){
                txt=l.get(i).toString()+"\n........................\n";
                i++;
            }
        }
        File a=new File(Direccion()+"\\Autor",UUID.randomUUID().toString());
        try{
        a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(txt);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                }
}
