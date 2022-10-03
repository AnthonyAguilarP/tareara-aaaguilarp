package dal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import misc.Controles;
public class Almacen {
    public static void CrearAlmacen(){
        File a=new File("Almacen");
        a.mkdir();
        File b=new File(Controles.Direccion(),"Grupos");
        b.mkdir();
        File c=new File(Controles.Direccion(),"Profesores");
        c.mkdir();
        File d=new File(Controles.Direccion(),"Estudiantes");
        d.mkdir();
        File e=new File(Controles.Direccion(),"Asignaturas");
        e.mkdir();
    }
    public static void Crear(String string,String s,String direccion){
        File a=new File(Controles.Direccion()+"\\"+direccion,string+".txt");
        try{
            a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(s);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    public static void CrearAsignatura(String string, String s){
        if(Controles.ComprobanteAsignatura(string)==false){
        File a=new File(Controles.Direccion()+"\\Asignaturas",string+".txt");
        if(a.exists())System.out.println("Ya existe esta asignatura");
        try{
        a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(s);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void Agregar(String direccion,String nombre,String agregar){
        File a=new File(Controles.Direccion()+"\\"+direccion,nombre+".txt");
        String texto=Controles.AbrirTxt(direccion, nombre);
        try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(texto+"\n"+agregar);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
