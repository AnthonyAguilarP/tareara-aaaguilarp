package dol;

import misc.DNI;

public class Asignatura implements IShow{
    private String NombreAsignatura;

    public Asignatura(String NombreAsignatura){
        NombreAsignatura=NombreAsignatura.toLowerCase();
        this.NombreAsignatura=NombreAsignatura;
    }
    public String DNI(){
        StringBuilder a=new StringBuilder(NombreAsignatura);
        a.delete(1, NombreAsignatura.length()-1);
        return DNI.DNIasignatura(a.toString()+NombreAsignatura.charAt(1));
    }

    @Override
    public String Show() {
        return st+"Asignatura= "+NombreAsignatura+", DNI= "+DNI()+st;
    }
    
}
