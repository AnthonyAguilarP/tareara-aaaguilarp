package ui;

import java.util.Scanner;
import misc.Controles;

public class Abrir implements IMenu{
    private String ruta;
    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.println("1.Ver en especifico ");
        System.out.println("2.Ver todos");
        System.out.println("3.Volver");
        System.out.print("Usted selecciono: ");
    }

    @Override
    public void Seleccionar() {
        Scanner sc=new Scanner(System.in);
        int i=0;
        OUTER:
        while (i!=3) {
            Opciones();
            i=sc.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.print("Ingrese el ID: ");
                    System.out.println(Controles.AbrirTxt(ruta,sc.next()));
                }
                case 2 -> Controles.VerTodo(ruta);
                case 3 -> {
                    break OUTER;
                }
                default -> System.out.println("Seleccione una opción válida");
            }
        }
    }
    public void Ruta(String ruta){
        this.ruta=ruta;
    }
}
