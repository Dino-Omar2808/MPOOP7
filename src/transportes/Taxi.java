/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un taxi con atributo de numero del
 * taximetro
 * Se extiende a las clase Supraterraneo
 */
public class Taxi extends Supraterraneo {
    /**
     * numeroTaximetro: es el numero del 
     * taximetro del taxi
     */
    private int numeroTaximetro;
    /**
     * Construstor vacio
     */
    public Taxi() {
    }
    /**
     * Constructor Lleno
     * @param numeroTaximetro:es el numero 
     * del taximetro del taxi
     * @param numeroLlantas: es el numero 
     * de Llantas del taxi
     * @param energia: el tipo de energia del taxi
     * @param color: el color del taxi
     * @param modelo: el modelo del taxi
     * @param marca: la marca del taxi 
     */
    public Taxi(int numeroTaximetro, int numeroLlantas, 
            String energia, String color, String modelo,
            String marca) {
        super(numeroLlantas, energia, color, modelo, marca);
        this.numeroTaximetro = numeroTaximetro;
    }
    /**
     * metodo get
     * @return consigue el numero del taximetro del taxi
     */
    public int getNumeroTaximetro() {
        return numeroTaximetro;
    }
    /**
     * metodo set: Modificar
     * @param numeroTaximetro el numero del taximetro del taxi 
     */
    public void setNumeroTaximetro(int numeroTaximetro) {
        this.numeroTaximetro = numeroTaximetro;
    }
    /**
     * Realizar la accion "Llamar"
     */
    public void llamar(){
        /**
         * imprime que el Taxi esta Llamando
         */
        System.out.println("Llamando..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * numero de taximetro del taxi + los atributos de las 
     * clases superiores
     */
    @Override
    public String toString() {
        return "Taxi{" + "numeroTaximetro=" + numeroTaximetro
                + super.toString()+ '}';
    }
    
}
