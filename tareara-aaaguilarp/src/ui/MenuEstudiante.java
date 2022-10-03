package ui;

import java.util.Scanner;

class MenuEstudiante implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Matricula");
        System.out.println("4.Salir");
        System.out.print("Usted seleccionó la opción: ");
    }
    @Override
    public void Seleccionar() {
        int i=0;
        Scanner sc=new Scanner(System.in);
        OUTER:
        while (9!=0) {
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            switch (i) {
                case 1 -> {
                    Abrir a=new Abrir();
                    a.Ruta("Estudiantes");
                    a.Seleccionar();
                }
                case 2 -> {
                    AgregarEstudiante b=new AgregarEstudiante();
                    b.Agregar();
                }
                case 3 -> {
                    Asignar c=new Asignar();
                    c.Matricula();
                }
                case 4 -> {
                    break OUTER;
                }
                default -> System.out.println("Escoja una opción válida");
            }
        }
    }
}
