/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un metro con atributo de largo del metro
 * Se extiende a las clase Subterraneo
 */
public class Metro extends Subterraneo {
    /**
     * largo: es el largo del metro
     */
    private int largo;
    /**
     * Construstor vacio
     */
    public Metro() {
    }
    /**
     * Constructor Lleno
     * @param largo: es el largo del metro
     * @param numeroBagones: es el numero de 
     * bagones del metro
     * @param energia: es el tipo de energia 
     * del metro
     * @param color: es el color del metro
     * @param modelo: es el modelo del metro
     * @param marca: es la marca del metro 
     */
    public Metro(int largo, int numeroBagones, 
            String energia, String color, String
                    modelo, String marca) {
        super(numeroBagones, energia, color, 
                modelo, marca);
        this.largo = largo;
    }
    /**
     * metodo get 
     * @return conseguir el largo del metro
     */
    public int getLargo() {
        return largo;
    }
    /**
     * metodo set: Modificar
     * @param largo el largo del metro
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     *  Realizar la accion "Prender ventilador"
     */
    public void prenderVentilador(){
        /**
         * imprime que el metro esta encendiendo 
         * el ventilador
         */
        System.out.println("Encendiendo..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la 
     * clase: largo del metro + los atributos de 
     * las clases superiores
     */
    @Override
    public String toString() {
        return "Metro{" + "largo=" + largo + 
                super.toString()+ '}';
    }
    
}
