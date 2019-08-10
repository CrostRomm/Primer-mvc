package Controlador;

import Modelo.Modelo;
import Vista.index;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Controlador implements ActionListener{
    /**
     * Instancia de la vista
     */
    private index view;
    /**
     * Instancia del modelo
     */
    private Modelo model;
    /**
     * Constructor de la clase controlador
     * @param view
     * @param model 
     */
    public Controlador(index view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.Boton.addActionListener(this);
    }
    /**
     * Clase que inicia
     */
    public void iniciar(){
        view.setTitle("Iniciando presentacion");
        view.setLocationRelativeTo(null);
    }
    /**
     * sobreescritura de metodo
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Modelo model = new Modelo();
        model.setTexto(view.cajaTexto.getText());
        model.agregar();
        view.lista.setText(String.valueOf(model.getLista()));
        
    }
}
