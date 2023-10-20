/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Suburbano con atributo de costo
 * Se extiende a la clase de subterraneo
 */
public class Suburbano extends Subterraneo {
    /**
     * costo: es el costo del suburbano
     */
    private int costo;
    /**
     * costructor vacio
     */
    public Suburbano() {
    }
    /**
     * Constructor Lleno
     * @param costo: el costo del suburbano
     * @param numeroBagones: el numero del suburbano
     * @param energia: la energia que utiliza 
     * del suburbano
     * @param color: el colo del suburbano
     * @param modelo: el modelo del suburbano
     * @param marca: la marca del suburbano 
     */
    public Suburbano(int costo, int numeroBagones, String 
            energia, String color, String modelo, String marca) {
        super(numeroBagones, energia, color, modelo, marca);
        this.costo = costo;
    }
    /**
     * metodo get
     * @return consigue el costo del suburbano
     */
    public int getCosto() {
        return costo;
    }
    /**
     * metodo set: Modificar
     * @param costo: el costo del suburbano 
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    /**
     * Realizar la accion "precionarPuerta"
     */
    public void precionarPuerta(){
        /**
         * imprime que el suburbano abre la puerta
         */
        System.out.println("Abrinedo..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase:
     * costo del suburbano + los atributos de las clases }
     * superiores
     */
    @Override
    public String toString() {
        return "Suburbano{" + "costo=" + costo +
                super.toString()+'}';
    }
    
}
