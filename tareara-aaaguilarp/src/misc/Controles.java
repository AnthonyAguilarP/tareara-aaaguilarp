package misc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class Controles {
    private static boolean existe=true;
    public static String Direccion(){
        File Archivo=new File("Almacen");
        return Archivo.getAbsolutePath();
    }
    public static int ContieneCantidad(String string){
        File Archivo=new File(Direccion()+"\\"+string);
        String[] contiene=Archivo.list();
        return contiene.length;
    }
    public static boolean ComprobanteAsignatura(String string){
        StringBuilder f=new StringBuilder(string);
        f.deleteCharAt(0);
        int i=0;
        File Archivo=new File(Direccion()+"\\Asignaturas");
        String[] contiene=Archivo.list();
        for(String s: contiene){
            StringBuilder DNI=new StringBuilder(contiene[i]);
            DNI.delete(contiene[i].length()-4, contiene[i].length());
            DNI.deleteCharAt(0);
            if(f.toString().equals(DNI.toString()))return true;
            i++;
        }
        return false;
    }
    public static String AbrirTxt(String b,String string){
        String a,almacen="";
        try{
         File archivo=new File(Direccion()+"\\"+b,string+".txt");
         BufferedReader bw = new BufferedReader(new FileReader(archivo));
         while((a=bw.readLine())!=null){
             almacen=almacen+a+"\n";
         }
            return almacen;
        }catch(Exception e){
            return "Error";
        }
    }
    public static String Existe(String ruta, String string){
        if(!"Error".equals(AbrirTxt(ruta,string)))return "";
        return "Error";
    }
    public static void VerTodo(String string){
        int i=0;
        File a=new File(Direccion()+"\\"+string);
        String[] b=a.list();
        
        for(String s:b){
            System.out.println("------------------------------------------------------------------");
            StringBuilder k=new StringBuilder(b[i]);
            k.delete(b[i].length()-4, b[i].length());
            System.out.println(AbrirTxt(string,k.toString()));
            i++;
        }
    }
    public static String Imprimir(ArrayList<String> b){
        if(b.isEmpty())return "No se encontraron estudiantes en este grupo";
        String a="------------------------------------------------------------------\n",c="";
        int i=0;
        for(String s:b){
            c=c+b.get(i)+"\n";
        }
        return a+c+a;
    }
}
