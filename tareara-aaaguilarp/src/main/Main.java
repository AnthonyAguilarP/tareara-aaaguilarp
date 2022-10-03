/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import dal.Almacen;
import dol.Asignatura;
import ui.*;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Almacen.CrearAlmacen();
        RegistroAcademico a=new RegistroAcademico();
        a.Seleccionar();
    }
    
}
