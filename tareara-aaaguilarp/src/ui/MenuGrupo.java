package ui;

import java.util.Scanner;

class MenuGrupo implements IMenu{

    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Salir");
        System.out.print("Usted seleccionó la opción: ");
    }
    @Override
    public void Seleccionar() {
        Scanner sc=new Scanner(System.in);
        int i;
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
                    a.Ruta("Grupos");
                    a.Seleccionar();
                }
                case 2 -> {
                    AgregarGrupo b=new AgregarGrupo();
                    b.Agregar();
                }
                case 3 -> {
                    break OUTER;
                }
                default -> System.out.println("Escoja una opción válida");
            }
        }
    }
    
}
