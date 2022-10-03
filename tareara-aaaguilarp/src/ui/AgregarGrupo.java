package ui;

import dal.Almacen;
import dol.Grupo;
import java.util.ArrayList;
import java.util.Scanner;
import misc.Controles;

public class AgregarGrupo implements IMenu{
    private Scanner sc=new Scanner(System.in);
    private ArrayList<String> DNI=new ArrayList<String>();
    public void Agregar(){
        System.out.println("________________________________________________________________________________________");
        System.out.print("Nombre del grupo: ");
        Grupo a=new Grupo();
        String nombre=sc.next();
        a.setNombreGrupo(nombre);
        Seleccionar();
        a.setDNI();
        a.setEstudiantes(DNI);
        Almacen.Crear(a.getDNI(), a.Show(),"Grupos");
    }
    @Override
    public void Opciones() {
        System.out.println("________________________________________________________________________________________");
        System.out.println("Estudiante");
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
                    if(!"Error".equals(Controles.Existe("Estudiantes", dni)))DNI.add(dni);
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
                case 4 -> Controles.VerTodo("Estudiantes");
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("Escoja una opción válida");
            }
        }
    }
}
