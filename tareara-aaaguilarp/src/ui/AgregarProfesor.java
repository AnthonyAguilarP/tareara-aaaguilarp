package ui;

import dal.Almacen;
import dol.Profesor;
import java.util.Scanner;

public class AgregarProfesor {
    private Profesor a=new Profesor();
    private Scanner sc=new Scanner(System.in);
    public void genero(){
        while(9!=0){
            System.out.println("________________________________________________________________________________________");
            System.out.print("Genero(Masculino o Femenino): ");
            a.genero(sc.next());
            if(!"Ingrese un genero valido\nMaculino\nFemenino".equals(a.getGenero()))break;
            else System.out.println("Ingrese un género válido");
        }
    }
    public void edad(){
        while(9!=0){
            System.out.println("________________________________________________________________________________________");
            System.out.println("Ingrese su fecha de nacimiento");
            System.out.print("dia: ");
            a.setDia(sc.next());
            System.out.print("mes: ");
            a.setMes(sc.next());
            System.out.print("año(Se esperan 4 digitos): ");
            a.setAño(sc.next());
            if(!"La fecha que ingreso es invalida".equals(a.Edad()))break;
            else System.out.println("Ingrese una fecha válida");
        }
    }
    public void agregar(){
        System.out.println("________________________________________________________________________________________");
        System.out.print("primer nombre: ");
        a.setpNombre(sc.next());
        System.out.print("segundo nombre: ");
        a.setsNombre(sc.next());
        System.out.print("primer apellido: ");
        a.setpApellido(sc.next());
        System.out.print("segundo apellido: ");
        a.setsApellido(sc.next());
        edad();
        genero();
        System.out.print("Profesión: ");
        a.profesion(sc.next());
        System.out.print("Años de experiencia: ");
        a.Año(sc.next());
        Almacen.Crear(a.getDNI(), a.Show(), "Profesores");
    }
}
