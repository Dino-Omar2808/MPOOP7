/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Transporte Aereo con atributos de
 * numero de alerones
 * Se extiende a las clase MediosDeTransporte
 */
public class TransporteAereo extends 
        MediosDeTransporte {
    /**
     * numeroAlerones: el numero de alerones 
     * del Transporte Aereo
     */
    private int numeroAlerones;
    /**
     * Construstor vacio
     */
    public TransporteAereo() {
    }
    /**
     * Constructor Lleno
     * @param numeroAlerones: el numero de alerones
     * del Transporte Aereo
     * @param color: color del Transporte Aereo
     * @param modelo: modelo del Transporte Aereo
     * @param marca: marca del Transporte Aereo 
     */
    public TransporteAereo(int numeroAlerones, 
            String color, String modelo, String marca) {
        super(color, modelo, marca);
        this.numeroAlerones = numeroAlerones;
    }
    /**
     * metodo get
     * @return cpnsigue el numero de alerones del 
     * Transporte Aereo
     */
    public int getNumeroAlerones() {
        return numeroAlerones;
    }
    /**
     * metodo set: Modificar
     * @param numeroAlerones: el numero de alerones 
     * del Transporte Aereo 
     */
    public void setNumeroAlerones(int numeroAlerones) {
        this.numeroAlerones = numeroAlerones;
    }
    /**
     * Realizar la accion "Volar"
     */
    public void volar(){
        /**
         * imprime que el Transporte Aereo esta volando
         */
        System.out.println("Volnading");
    }
    /**
     * metodo sobre escrito debido a que la clase mas
     * alta de rango ya tiene un metodo "avanzar"
     */
    @Override
    /**
     * Realizar la accion "Avanzar"
     */
    public void avanzar(){
        /**
         * imprime que el Transporte Terrestre esta 
         * avanzando
         */
        System.out.println("Avanzanding..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase:
     * numero de alerones del Transporte Aereo + los 
     * atributos de la clase superior
     */
    @Override
    public String toString() {
        return "TransporteAereo{" + "numeroAlerones="
                + numeroAlerones + super.toString()+'}';
    }
    
   
}
