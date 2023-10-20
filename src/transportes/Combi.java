/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un combi con atrubuto de ruta
 * Se extiende a las clase Supraterraneo
 */
public class Combi extends Supraterraneo {
    /**
     * ruta: es la ruta de la combi
     */
    private int ruta;
    /**
     * Construstor vacio
     */
    public Combi() {
    }
    /**
     * Constructor lleno
     * @param ruta: es la ruta de la combi
     * @param numeroLlantas:el numero de llantas 
     * de la combi
     * @param energia: el tipo de energia de la combi
     * @param color: el color de la combi
     * @param modelo: el modelo de la combi
     * @param marca: la marca de la combi 
     */
    public Combi(int ruta, int numeroLlantas, String 
            energia, String color, String modelo, String marca) {
        super(numeroLlantas, energia, color, modelo, marca);
        this.ruta = ruta;
    }
    /**
     * metodo get
     * @return consigue la ruta de la combi
     */
    public int getRuta() {
        return ruta;
    }
    /**
     * metodo set: Modifica
     * @param ruta  la ruta de la combi
     */
    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
    /**
     * Realizar la accion "hacer Paradas"
     */
    public void hacerParadas(){
        /**
         * imprime que la combi esta haciendo la 
         * primera parada
         */
        System.out.println("Primera parada");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * la ruta de la combii + los atributos de las clases
     * superiores
     */
    @Override
    public String toString() {
        return "Combi{" + "ruta=" + ruta + 
                super.toString()+ '}';
    }
    
}
