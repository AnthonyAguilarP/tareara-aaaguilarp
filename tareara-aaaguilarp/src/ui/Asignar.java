package ui;

import dal.Almacen;
import java.util.Scanner;
import misc.Controles;

class Asignar {
    private Scanner sc=new Scanner(System.in);
    private final String uu=".,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,..,.,.,.\n";
    public void AsignarAsignatura(){
        System.out.print("Ingrese el ID de la asignatura: ");
        String ID=sc.next();
        if(!"Error".equals(Controles.Existe("Asignaturas",ID))){
            System.out.print("Ingrese el DNI del profesor: ");
            String IDp=sc.next();
            if(!"Error".equals(Controles.Existe("Profesores",IDp))){
                Almacen.Agregar("Profesores",IDp,uu+"Se le asignó la asignatura\n"+ID);
            }else System.out.println("No se encontró");
        }else System.out.println("No se encontró");
    }
    public void AsignarProfesor(){
        System.out.print("Ingrese el DNI del profesor: ");
        String IDp=sc.next();
        if(!"Error".equals(Controles.Existe("Profesores",IDp))){
            System.out.print("Ingrese el ID de la asignatura: ");
            String ID=sc.next();
            if(!"Error".equals(Controles.Existe("Asignaturas",ID))){
                Almacen.Agregar("Asignaturas",ID,uu+"Se le asignó el profesor\n"+IDp);
            }else System.out.println("No se encontró");
        }else System.out.println("No se encontró");
    }
    public void AsignarGrupo(){
        System.out.print("Ingrese el ID del grupo: ");
        String IDg=sc.next();
        if(!"Error".equals(Controles.Existe("Grupos", IDg))){
            System.out.print("Ingrese el DNI del profesor: ");
            String IDp=sc.next();
            if(!"Error".equals(Controles.Existe("Profesores", IDp))){
                Almacen.Agregar("Profesores", IDp, uu+"Se le asigno el grupo\n"+IDg);
            }else System.out.println("No se encontró");
        }else System.out.println("No se encontró");
    }
    public void Matricula(){
        System.out.print("Ingrese el ID de la Asignatura: ");
        String ID=sc.next();
        if(!"Error".equals(Controles.Existe("Asignaturas", ID))){
            System.out.print("Ingrese el DNI del estudiante: ");
            String IDe=sc.next();
            if(!"Error".equals(Controles.Existe("Estudiantes", IDe))){
                System.out.print("Ingrese el ID del grupo: ");
                String IDg=sc.next();
                if(!"Error".equals(Controles.Existe("Grupos", IDg))){
                    Almacen.Agregar("Estudiantes", IDe, uu+"Se le asignó la asignatura\n"+ID);
                    Almacen.Agregar("Estudiantes", IDe, uu+"Se le asignó al grupo\n"+IDg);
                }else System.out.println("No se encontró");
            }else System.out.println("No se encontró");
        }else System.out.println("No se encontró");
    }
}
