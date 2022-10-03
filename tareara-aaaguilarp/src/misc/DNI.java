package misc;
import java.util.Random;
public class DNI {
    public static String DNIpersonal(){
        int i=0;
        String DNI="";
        while(i!=15){
            if(i==3 || i==10)DNI=DNI+"-";
            else DNI=DNI+(int)Math.floor(Math.random()*9);
            i++;
        }
        Random a=new Random();
        return DNI+(char)(a.nextInt(26)+'A');
    }
    public static String DNIasignatura(String string){
        return Controles.ContieneCantidad("Asignaturas")+string.toUpperCase();
    }
    public static String DNIgrupo(){
        Random a=new Random();
        char v=(char)(a.nextInt(26)+'A');
        return Controles.ContieneCantidad("Grupos")+v+"U";
    }
}
