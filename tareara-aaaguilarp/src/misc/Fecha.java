package misc;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
public class Fecha {
    public static LocalDate FechaActual(){
        Calendar calendar = Calendar.getInstance();
        String dia,mes,año;
        dia=Integer.toString(calendar.get(Calendar.DATE));
        if(dia.length()<2)dia="0"+dia;
        mes = Integer.toString(calendar.get(Calendar.MONTH));
        if(mes.length()<2)mes="0"+mes;
        año = Integer.toString(calendar.get(Calendar.YEAR));
        return LocalDate.parse(año+"-"+mes+"-"+dia);
    }
    public static LocalDate Fecha(String dia, String mes, String año){
        if(dia.length()<2)dia="0"+dia;
        if(mes.length()<2)mes="0"+mes;
        try{
        return LocalDate.parse(año+"-"+mes+"-"+dia);
        }catch(Exception e){
            return null;
        }
    }
    public static int Edad(String dia, String mes, String año){
        try{
            Period Edad = Period.between(Fecha(dia,mes,año),FechaActual());
            return Edad.getYears();
        }
        catch(Exception e){
            return -1;
        }
    }
    public static String getEdad(String dia, String mes, String año){
        if(Edad(dia,mes,año)<=0)return "La fecha que ingreso es invalida";
        else return "Edad= "+Edad(dia,mes,año);
    }
}
