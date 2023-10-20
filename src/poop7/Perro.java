/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un perro con atributo de color del collar
 * Se extinete a la clase Animal Terrestre
 */
public class Perro extends AnimalTerrestre {
    /**
     * colorCollar: es el color del collar del perro
     */
    private String colorCollar;
    /**
     * Construstor vacio
     */
    public Perro() {
    }
    /**
     * Constructor lleno
     * @param colorCollar: es el color del collar del perro
     * @param numeroPatas: numero de patas del perro
     * @param nombre: nombre del perro
     * @param lugarOrigen: lugar de origen del perro
     * @param color: color del perro 
     */
    public Perro(String colorCollar, int numeroPatas, 
            String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * metodo get
     * @return consigue el color del collar del perro
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * metodo set: modificar
     * @param colorCollar: el color del collar del perro 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Realizar la accion "hacer Trucos"
     */
     public void hacerTrucos(){
        /**
         * Imprime que el perro esta haciendo trucos
         */
        System.out.println("Estoy hacinedo trucos");
    }
     /**
      * Se sobre escribe la referencia
      * @return los valores de las variables de la clase:
      * color del collar del perro + los atributos de las 
      * clases superiores 
      */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar 
                + super.toString()+ '}';
    }
    
}
