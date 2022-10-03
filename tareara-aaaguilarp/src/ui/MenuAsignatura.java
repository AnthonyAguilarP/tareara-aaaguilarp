/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MenuAsignatura implements IMenu{
    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.print("1.Abrir\n2.Agregar\n3.Asignar docente\n4.Salir\nEscoja la opción deseada: ");
    }
    @Override
    public void Seleccionar() {
        Scanner sc=new Scanner(System.in);
        int opc=0;
        OUTER:
        while (opc!=5) {
            Opciones();
            opc=sc.nextInt();
            switch (opc) {
                case 1 -> {
                    Abrir b=new Abrir();
                    b.Ruta("Asignaturas");
                    b.Seleccionar();
                }
                case 2 -> {
                    AgregarAsignatura a=new AgregarAsignatura();
                    a.Agregar();
                }
                case 3 -> {
                    Asignar c=new Asignar();
                    c.AsignarProfesor();
                }
                case 4 -> {
                    break OUTER;
                }
                default -> System.out.println("Ingrese una opción válida");
            }
        }
    }
}
