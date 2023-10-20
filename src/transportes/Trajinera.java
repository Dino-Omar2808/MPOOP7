/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es una Trajinera con atributo de tamaño
 * Se extiende a la clase Transporte Acuatico
 */
public class Trajinera extends TransporteAcuatico {
    /**
     * tamaño: es el tamaño de la trajinera
     */
    private int tamaño;
    /**
     * Constructor vacío
     */
    public Trajinera() {
    }
    /**
     * Constructor Lleno
     * @param tamaño: es el tamaño de la trajinera
     * @param numeroCascos: es el numero de cascos 
     * de la trajinera
     * @param color: es el color de la trajinera
     * @param modelo: es el modelo de la trajinera
     * @param marca: es la marca de la trajinera 
     */
    public Trajinera(int tamaño, int numeroCascos, 
            String color, String modelo, String marca) {
        super(numeroCascos, color, modelo, marca);
        this.tamaño = tamaño;
    }
    /**
     * metodo get
     * @return consigue el tamaño de la trajinera
     */
    public int getTamaño() {
        return tamaño;
    }
    /**
     * metodo set: Modificar
     * @param tamaño: el tamaño de la trajinera
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    /**
     * Realizar la accion "Turistear"
     */
    public void turistear(){
        /**
         * se imprime que la trajinera esta turisteando
         */
        System.out.println("Inicia turismo");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * tamaño de la trajinera + los atributos de las 
     * clases superiores 
     */
    @Override
    public String toString() {
        return "Trajinera{" + "tama\u00f1o=" + tamaño + 
                super.toString()+ '}';
    }
    
}
