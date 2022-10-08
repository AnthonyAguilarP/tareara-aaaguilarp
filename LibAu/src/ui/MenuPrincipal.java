/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author JADPA-02
 */
public class MenuPrincipal implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("1.Libros");
        System.out.println("2.Autores");
        System.out.println("3.Salir");
        System.out.print("Usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        int i=0;
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
                    MenuL a=new MenuL();
                    a.Seleccionar();
                }
                case 2 -> {
                    MenuA b=new MenuA();
                    b.Seleccionar();
                }
                case 3 -> System.out.println("Usted salio");
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
    }
    
}
