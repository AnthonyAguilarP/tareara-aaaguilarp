package dol;
import misc.DNI;
import misc.Fecha;
public class Persona {
    private String pNombre;
    private String sNombre;
    private String pApellido;
    private String sApellido;
    private String genero;
    private String dia;
    private String mes;
    private String año;
    private String dni;

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public void setAño(String año) {
        this.año = año;
    }
    public String Edad(){
        return Fecha.getEdad(dia,mes,año);
    }
    public void genero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        genero=genero.toLowerCase();
        if("masculino".equals(genero))return "Masculino";
        if("femenino".equals(genero))return "Femenino";
        else return "Ingrese un genero valido\nMaculino\nFemenino";
    }
    public String getDNI(){
        this.dni=DNI.DNIpersonal();
        return dni;
    }
    @Override
    public String toString() {
        return "Nombre="+pNombre+" "+sNombre+" "+pApellido+" "+sApellido+"\ngenero="+genero+"\n"+Edad()+"\nFecha de nacimiento= "+Fecha.Fecha(dia, mes, año)+"\nDNI= "+dni;
    }
}
