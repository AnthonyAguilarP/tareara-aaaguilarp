/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import dal.Almacen;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author JADPA-02
 */
public class Abrir {
    public static void VerTodo(String string){
        int i=0;
        File a=new File(Almacen.Direccion()+"\\"+string);
        String[] b=a.list();
        
        for(String s:b){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(AbrirTxt(string,b[i]));
            i++;
        }
    }
    public static String AbrirTxt(String b,String string){
        String a,almacen="";
        try{
         File archivo=new File(Almacen.Direccion()+"\\"+b,string);
         BufferedReader bw = new BufferedReader(new FileReader(archivo));
         while((a=bw.readLine())!=null){
             almacen=almacen+a+"\n";
         }
            return almacen;
        }catch(Exception e){
            return "Error";
        }
    
}}
