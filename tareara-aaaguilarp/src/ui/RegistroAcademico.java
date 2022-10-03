package ui;
import java.util.Scanner;
public class RegistroAcademico implements IMenu{
    @Override
    public void Opciones() {
        System.out.println("1.Asignaturas");
        System.out.println("2.Grupos");
        System.out.println("3.Profesores");
        System.out.println("4.Estudiantes");
        System.out.println("5.Salir");
        System.out.print("Usted escogió: ");
    }
    @Override
    public void Seleccionar() {
        int i;
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
                    MenuAsignatura a=new MenuAsignatura();
                    a.Seleccionar();
                }
                case 2 -> {
                    MenuGrupo b=new MenuGrupo();
                    b.Seleccionar();
                }
                case 3 -> {
                    MenuProfesor c=new MenuProfesor();
                    c.Seleccionar();
                }
                case 4 -> {
                    MenuEstudiante d=new MenuEstudiante();
                    d.Seleccionar();
                }
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("Escoja una opción válida");
            }
        }
    }
}
