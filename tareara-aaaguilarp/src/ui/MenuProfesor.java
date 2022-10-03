package ui;

import java.util.Scanner;

public class MenuProfesor implements IMenu{
    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Asignar Grupo");
        System.out.println("4.Asignar Asignatura");
        System.out.println("5.Volver");
        System.out.print("Escoja la opción deseada: ");
    }
    @Override
    public void Seleccionar() {
        Scanner sc=new Scanner(System.in);
        int i=0;
        OUTER:
        while (i!=5) {
            Opciones();
            i=sc.nextInt();
            switch (i) {
                case 1 -> {
                    Abrir b=new Abrir();
                    b.Ruta("Profesores");
                    b.Seleccionar();
                }
                case 2 -> {
                    AgregarProfesor a=new AgregarProfesor();
                    a.agregar();
                }
                case 3 -> {
                    Asignar c=new Asignar();
                    c.AsignarGrupo();
                }
                case 4 -> {
                    Asignar b=new Asignar();
                    b.AsignarAsignatura();
                }
                case 5 -> {
                    break OUTER;
                }
                default -> {
                        break OUTER;
                }
            }
        }
    }
    
}
