/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Barco con atributo de tipo de barco
 * Se extiende a la clase Transporte Acuatico
 */
public class Barco extends TransporteAcuatico {
    /**
     * tipoBarco: es el tipo de barco 
     */
    private String tipoBarco;
    /**
     * Constructor vacío
     */
    public Barco() {
    }
    /**
     * Constructor Lleno
     * @param tipoBarco: es el tipo de barco 
     * @param numeroCascos: el numero de cascos 
     * del barco
     * @param color: color del barco
     * @param modelo: modelo del barco
     * @param marca: marca del barco 
     */
    public Barco(String tipoBarco, int numeroCascos, 
            String color, String modelo, String marca) {
        super(numeroCascos, color, modelo, marca);
        this.tipoBarco = tipoBarco;
    }
    /**
     * metodo get
     * @return consigue el tipo de barco 
     */
    public String getTipoBarco() {
        return tipoBarco;
    }
    /**
     * metodo set: Modificar
     * @param tipoBarco: el tipo de barco
     */
    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }
    /**
     * Realizar la accion "Atracar"
     */
    public void Atracar(){
        /**
         * se imprime que el barco esta atracando
         */
        System.out.println("Atracando...");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la 
     * clase: el tipo de barco + los atributos de 
     * las clases superiores 
     */
    @Override
    public String toString() {
        return "Barco{" + "tipoBarco=" + tipoBarco 
                + super.toString()+ '}';
    }
    
}
