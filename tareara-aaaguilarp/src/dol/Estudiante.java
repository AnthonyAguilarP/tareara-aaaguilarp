package dol;
import java.time.LocalDate;
import misc.Fecha;
public class Estudiante extends Persona implements IShow{
    private String Dia;
    private String Mes;
     private String Año;
    public void Dia(String Dia) {
        this.Dia = Dia;
    }
    public void Mes(String Mes) {
        this.Mes = Mes;
    }
    public void Año(String Año) {
        this.Año = Año;
    }
    public LocalDate Inscripcion(){
        return Fecha.Fecha(Dia, Mes, Año);
    }
    @Override
    public String Show() {
        return st+toString()+"\nFecha de inscripcion= "+Inscripcion()+st;
    }
    
}
