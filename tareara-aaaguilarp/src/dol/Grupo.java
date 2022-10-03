package dol;

import java.util.ArrayList;
import misc.Controles;
import misc.DNI;

public class Grupo implements IShow{
    private String NombreGrupo;
    private String Imprimir;
    private String dni;
    public void setNombreGrupo(String NombreGrupo) {
        this.NombreGrupo=NombreGrupo;
    }
    public void setDNI(){
        this.dni=DNI.DNIgrupo();
    }
    public String getDNI(){
        return dni;
    }
    public void setEstudiantes(ArrayList<String>a){
        this.Imprimir=Controles.Imprimir(a);
    }

    @Override
    public String Show() {
        return st+"NombreGrupo= "+NombreGrupo+", DNI= "+dni+"\nEstudiantes\n"+Imprimir+st;
    }
}
