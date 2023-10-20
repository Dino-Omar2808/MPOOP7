/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;
/**
 *
 * @author dinos
 * Es un transporte acuatico con atributo 
 * de numero de Cascos
 * Se extiende a las clase MediosDeTransporte
 */
public class TransporteAcuatico extends 
        MediosDeTransporte {
    /**
     * numeroCascos: es el numero de cascos 
     * que tiene  el Transporte Acuatico
     */
    public int numeroCascos;
    /**
     * Construstor vacio
     */
    public TransporteAcuatico() {
    }
    /**
     * Constructor Lleno
     * @param numeroCascos:es el numero de cascos 
     * del Transporte Acuatico
     * @param color: color del Transporte Acuatico
     * @param modelo: modelo del Transporte Acuatico
     * @param marca: marca del Transporte Acuatico 
     */
    public TransporteAcuatico(int numeroCascos, 
            String color, String modelo, String marca) {
        super(color, modelo, marca);
        this.numeroCascos = numeroCascos;
    }
    /**
     * metodo get
     * @return consigue el numero de cascos del 
     * Transporte Acuatico
     */
    public int getNumeroCascos() {
        return numeroCascos;
    }
    /**
     * metodo set: Modificar
     * @param numeroCascos: numero de cascos del 
     * Transporte Acuatico
     */
    public void setNumeroCascos(int numeroCascos) {
        this.numeroCascos = numeroCascos;
    }
    /**
     * Realizar la accion "Navegar"
     */ 
    public void navegar(){
        /**
         * imprime que el Transporte Acuatico 
         * esta navegando
         */
        System.out.println("Naveganding...");
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
         * imprime que el Transporte Acuatico esta avanzando
         */
        System.out.println("Avanzanding..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * numero de cascos del Transporte Acuatico + los 
     * atributos de la clase superior 
     */
    @Override
    public String toString() {
        return "TransporteAcuatico{" + "numeroCascos="
                + numeroCascos + super.toString()+ '}';
    }  
}
