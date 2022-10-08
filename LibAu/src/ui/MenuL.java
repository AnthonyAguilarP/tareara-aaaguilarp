/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Almacen;
import dol.Libro;
import java.util.ArrayList;
import java.util.Scanner;
import misc.Abrir;

/**
 *
 * @author JADPA-02
 */
class MenuL implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("1.Agregar");
        System.out.println("2.Ver");
        System.out.print("3.Salir\n usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        int i=0;
        ArrayList<Libro>a=new ArrayList<Libro>();
        Libro b=new Libro();
        Scanner sc=new Scanner(System.in);
        while(i!=3){
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            switch (i) {
                case 1 -> {
                    System.out.println("Titulo");
                    b.setTitulo(sc.next());
                    System.out.println("Editorial");
                    b.setEditorial(sc.next());
                    System.out.println("Edicion");
                    b.setEdicion(sc.next());
                    System.out.println("Año de publicacion");
                    b.setAño(sc.next());
                    a.add(b);
                    Almacen.addLibros(a);
                }
                case 2 -> {
                    Abrir.VerTodo("Libro");
                }
                case 3 -> System.out.println("Usted salio");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
    }
    
}
