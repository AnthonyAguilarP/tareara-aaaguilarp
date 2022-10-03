package dol;
public class Profesor extends Persona implements IShow{

    private String profesion;
    private String Año;
    
    public void profesion(String profesion){
        this.profesion=profesion;
    }
    public void Año(String Año){
        this.Año=Año;
    }
    public String getAño(){
        try{
        int año=Integer.parseInt(Año);
        }catch(Exception e){
            return "El año que ingreso es inválido";
        }
        return "Años de experiencia= "+Año;
    }
    @Override
    public String Show() {
        return st+toString()+"\n"+getAño()+st;
    }
    
}
