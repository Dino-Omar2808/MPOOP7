/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;
/**
 *
 * @author dinos
 * Es un pajaro con atrubuto de Tipo del pico
 * Se extinete a la clase Animal Aereo
 */
public class Pajaro extends AnimalAereo {
    /**
     *tipoPico: es el tipo de pico del pajaro 
     */
    private String tipoPico;
    /**
     * Construstor vacio
     */
    public Pajaro() {
    }
    /**
     * Constructor lleno
     * @param tipoPico: es el tipo de pico del pajaro 
     * @param numeroAlas: numero de alas del pajaro
     * @param nombre: nombre del pajaro
     * @param lugarOrigen: lugar de origen del pajaro
     * @param color: color del pajaro 
     */
    public Pajaro(String tipoPico, int numeroAlas, 
            String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * metodo get
     * @return cpnsigue el tipo de pico del pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * metodo set: modificar
     * @param tipoPico: el tipo de pico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Realizar la accion "recolectar ramas"
     */
    public void recolectarRamas(){
        /**
         * imprime que el pajaro esta recogiendo ramas
         */
        System.out.println("Estoy recoginedo ramitas");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase:
     * tipo de pico del pajaro + los atributos de las clases 
     * superiores 
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + 
                super.toString()+'}';
    }
    
}
