/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un subterraneo con atributo de numero 
 * de bagones
 * Se extiende a las clase Transporte Terrestre
 */
public class Subterraneo extends 
        TransporteTerrestre {
    /**
     * numeroBagones: es el numero de 
     * Bagones del subterraneo
     */
    private int numeroBagones;
    /**
     * Construstor vacio
     */
    public Subterraneo() {
    }
    /**
     * Construccion lleno
     * @param numeroBagones: es el numero de 
     * bagones del subterraneo
     * @param energia: el tipo de energia del
     * subterraneo
     * @param color: el color del subterraneo
     * @param modelo: el modleo del subterraneo
     * @param marca: la marca del subterraneo 
     */
    public Subterraneo(int numeroBagones, String 
            energia, String color, String modelo, 
            String marca) {
        super(energia, color, modelo, marca);
        this.numeroBagones = numeroBagones;
    }
    /**
     * metodo get
     * @return consigue el numero de bagones 
     * del subterraneo 
     */
    public int getNumeroBagones() {
        return numeroBagones;
    }
    /**
     * metodo set
     * @param numeroBagones:el numero de bagones
     * del subterraneo   
     */
    public void setNumeroBagones(int numeroBagones) {
        this.numeroBagones = numeroBagones;
    }
    /**
     * Realizar la accion "Atrasar"
     */
    public void atrasar(){
        /**
         * se imprime que el subterraneo esta atrasandose
         */
        System.out.println("Sistema atrasado");
    }
    /**
     * se sobre escribe la referencia
     * @return los valores de las variables de la 
     * clase: el numero de bagones del subterraneo + 
     * los atributos de la clase superior
     */
    @Override
    public String toString() {
        return "Subterraneo{" + "numeroBagones=" + 
                numeroBagones + super.toString()+ '}';
    }
    
}
