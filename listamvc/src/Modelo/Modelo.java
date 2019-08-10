package Modelo;

import java.util.List;

/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Modelo {
    /**
     * Variable que almacena el texto escrito
     */
    private String texto;
    /**
     * Guarda el texto una vez guardado en la variable
     */
    private String personas;
    /**
     * Guarda las palabras escritas en la caja de texto
     */
    private static String lista = " ";
    /**
     * get del texto
     * @return String
     */
    public String getTexto() {
        return texto;
    }
    /**
     * Get de la persona 
     * @return String
     */
    public String getPersonas() {
        return personas;
    }
    /**
     * Get de la lista de personas
     * @return String
     */
    public String getLista() {
        return lista;
    }
    /**
     * set de la lista de personas
     * @param lista 
     */
    public void setLista(String lista) {
        this.lista = lista;
    }
    /**
     * Set de la persona
     * @param personas 
     */
    public void setPersonas(String personas) {
        this.personas = personas;
    }
    /**
     * Set del texto escrito
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * metodo que agrega una nueva palabra a la variable lista
     * @return String
     */
    public String agregar(){
        this.personas = texto;
        lista += personas + "\n";
        return lista;
    }
}
