
package Main;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.index;

/**
 * @author Cristian Romero
 * @version 1.0
 * Clase principal que inicia el programa
 */
public class main {
    /**
     * Metodo que inicia el programa
     * @param args 
     */
    public static void main(String[] args){
        Modelo mod = new Modelo();
        index view = new index();
        Controlador crtl = new Controlador(view,mod);
        crtl.iniciar();
        view.setVisible(true);
    }
}
