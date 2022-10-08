/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libau;

import dal.Almacen;
import ui.MenuPrincipal;

/**
 *
 * @author JADPA-02
 */
public class LibAu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Almacen.al();
        MenuPrincipal a=new MenuPrincipal();
        a.Seleccionar();
    }
    
}
