package ui;
import dal.Almacen;
import dol.Asignatura;
import java.util.Scanner;
public class AgregarAsignatura {
    public void Agregar(){
        while(9!=0){
        System.out.println("________________________________________________________________________________________");
        Scanner sc=new Scanner(System.in);
        Asignatura a;
        System.out.println("Ingrese el nombre de la asignatura: ");
        String s=sc.next();
        if(s.length()<5)System.out.println("La signatura debe tener un minimo de 5 caracteres");
        else{
        a=new Asignatura(s);
        Almacen.CrearAsignatura(a.DNI(),a.Show());
        break;
    }
        }
    }
}
