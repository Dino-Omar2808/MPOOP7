/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un helicoptero con atributos de numero de 
 * Elices 
 * Se extiende a la clase Transporte Aereo
 */
public class Helicoptero extends TransporteAereo {
    /**
     * numeroElices: es el numero de elices del 
     * helicoptero
     */
    private int numeroElices;
    /**
     * Construstor vacio
     */
    public Helicoptero() {
    }
    /**
     * Constructor lleno
     * @param numeroElices:es el numero de elices 
     * del helicoptero
     * @param numeroAlerones: es el numero de alerones 
     * del helicoptero
     * @param color: el color del helicoptero
     * @param modelo: el modelo del helicoptero
     * @param marca: la marca del helicoptero 
     */
    public Helicoptero(int numeroElices, int numeroAlerones, 
            String color, String modelo, String marca) {
        super(numeroAlerones, color, modelo, marca);
        this.numeroElices = numeroElices;
    }
    /**
     * metodo get
     * @return conseguir el numero de elices del helicoptero
     */
    public int getNumeroElices() {
        return numeroElices;
    }
    /**
     * metodo set: Modificar
     * @param numeroElices: el numero de elices del helicoptero
     */
    public void setNumeroElices(int numeroElices) {
        this.numeroElices = numeroElices;
    }
    /**
     *  Realizar la accion "descender"
     */
    public void descender(){
        /**
         * se imprime que el helicoptero esta descendiendo
         */
        System.out.println("Estamos descendiendo..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase:
     * el numero de helices del helicoptero + los atributos 
     * de las clases superiores
     */
    @Override
    public String toString() {
        return "Helicoptero{" + "numeroElices=" + 
                numeroElices + '}';
    }    
}
