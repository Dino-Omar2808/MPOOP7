/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Supraterraneo con atributo numero de llantas
 * Se extiende a las clase Transporte Terrestre
 */
public class Supraterraneo extends TransporteTerrestre {
    /**
     * numeroLlantas: es el numero de llantas del supraterraneo
     */
    private int numeroLlantas;
    /**
     * Construstor vacio
     */
    public Supraterraneo() {
    }
    /**
     * Constructor Lleno
     * @param numeroLlantas: es el numero de llantas del supraterraneo
     * @param energia: es la energia que utiliza del supraterraneo
     * @param color: color del supraterraneo
     * @param modelo: modelo del supraterraneo
     * @param marca: marca del supraterraneo 
     */
    public Supraterraneo(int numeroLlantas, String energia, 
            String color, String modelo, String marca) {
        super(energia, color, modelo, marca);
        this.numeroLlantas = numeroLlantas;
    }
    /**
     * metodo get
     * @return consigue el numero de llantas del supraterraneo
     */
    public int getNumeroLlantas() {
        return numeroLlantas;
    }
    /**
     * metodo set: Modificar
     * @param numeroLlantas: el numero de llantas del supraterraneo  
     */
    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }
    /**
     * Realizar la accion "Derrapar"
     */
    public void derrapar(){
        /**
         * imprime que el supraterraneo esta derrapando
         */
        System.out.println("waunnnnn");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * el numero de llantas del supraterraneo + los atributos 
     * de la clase superior
     */
    @Override
    public String toString() {
        return "Supraterraneo{" + "numeroLlantas=" + numeroLlantas
                + super.toString()+'}';
    }
    
}
