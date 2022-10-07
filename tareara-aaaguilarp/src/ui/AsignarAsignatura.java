/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Almacen;
import java.util.ArrayList;
import java.util.Scanner;
import misc.Controles;

/**
 *
 * @author HP
 */
class AsignarAsignatura implements IMenu{
    Scanner sc=new Scanner(System.in);
    private ArrayList<String> DNI=new ArrayList<String>();
    public void agregar(String dni){
        Seleccionar();
        if(DNI.isEmpty())System.out.println("No se almaceno nada");
        else Almacen.Agregar("Profesores", dni, "Asignaturas asignadas\n"+Controles.Imprimir(DNI));
    }
    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.println("Grupos");
        System.out.println("1.Agregar DNI ");
        System.out.println("2.Eliminar DNI");
        System.out.println("3.Ver DNIs almacenados");
        System.out.println("4.Ver DNI generales");
        System.out.println("5.Salir");
        System.out.print("Usted seleccionó la opción: ");
    }
    @Override
    public void Seleccionar() {
        int i=0;
        String dni;
        OUTER:
        while (9!=8) {
            Opciones();
            try{
                i=sc.nextInt();
            }catch(Exception e){
                i=0;
            }
            switch (i) {
                case 1 -> {
                    System.out.print("Ingrese el DNI: ");
                    dni=sc.next();
                    if(!"Error".equals(Controles.Existe("Asignaturas", dni)))DNI.add(dni);
                    else System.out.println("El DNI no existe");
                }
                case 2 -> {
                    System.out.print("Ingrese la posicón del elemento: ");
                    try{
                        DNI.remove(sc.nextInt()-1);
                    }catch(Exception e){
                        System.out.println("Ingrese un numero entero");
                    }
                }
                case 3 -> {
                    int j=0;
                    for(String s: DNI){
                        System.out.println((j+1)+DNI.get(j));
                        j++;
                    }
                }
                case 4 -> Controles.VerTodo("Asignaturas");
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("Escoja una opción válida");
            }
}
    }
}
