/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un ballena con atributo de largo
 * Se extinete a la clase Animal Acuatico
 */
public class Ballena extends AnimalAcuatico {
    /**
     * largo: es el largo de la ballena
     */
    private int largo;
    /**
     * Construstor vacio
     */
    public Ballena() {
    }
    /**
     * Constructor lleno
     * @param largo: es el largo de la ballena
     * @param numeroAletas: numero de aletas de la ballena
     * @param nombre: nombre de la ballena
     * @param lugarOrigen: lugar de origen de la ballena
     * @param color: color de la ballena 
     */
    public Ballena(int largo, int numeroAletas, String nombre, 
            String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * metodo get
     * @return consigue el largo de la ballena
     */
    public int getLargo() {
        return largo;
    }
    /**
     * metodo set: modificar
     * @param largo: largo de la ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Realizar la accion " pelear con pinocho"
     */
    public void pelarConPinoccho (){
        /**
         * Imprime que la ballena esta peleando
         */
        System.out.println("estoy pelenado.");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: largo
     * de la ballena + los atributos de las clases superiores
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + super.toString()+'}';
    }   
}
