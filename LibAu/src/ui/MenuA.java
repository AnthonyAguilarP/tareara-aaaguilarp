/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Almacen;
import dol.Autor;
import dol.Libro;
import java.util.ArrayList;
import java.util.Scanner;
import misc.Abrir;

/**
 *
 * @author JADPA-02
 */
class MenuA implements IMenu{
      @Override
    public void Opciones() {
        System.out.println("1.Agregar");
        System.out.println("2.Ver");
        System.out.print("3.Salir\n usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        int i=0;
        ArrayList<Autor>a=new ArrayList<Autor>();
        Autor b=new Autor();
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
                    System.out.println("Nombre");
                    b.setNombre(sc.next());
                    System.out.println("Pseudonimo");
                    b.setPseudonimo(sc.next());
                    System.out.println("Nacionalidad");
                    b.setNacionalidad(sc.next());
                    a.add(b);
                    Almacen.addAutores(a);
                }
                case 2 -> {
                    Abrir.VerTodo("Autor");
                }
                case 3 -> System.out.println("Usted salio");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
