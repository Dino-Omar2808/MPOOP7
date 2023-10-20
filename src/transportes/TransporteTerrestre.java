/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;
/**
 *
 * @author dinos
 * Es un Transporte Terrestre con atributos de energia
 * Se extiende a las clase MediosDeTransporte
 */
public class TransporteTerrestre extends
        MediosDeTransporte {
    /**
     * energia: es la energia que tiene  
     * el Transporte Terrestre
     */
    private String energia;
    /**
     * Construstor vacio
     */
    public TransporteTerrestre() {
    }
    /**
     * Constructor Lleno
     * @param energia: es la energia que tiene  
     * el Transporte Terrestre
     * @param color: color del Transporte Terrestre
     * @param modelo: modelo del Transporte Terrestre
     * @param marca: marca del Transporte Terrestre 
     */
    public TransporteTerrestre(String energia, String 
            color, String modelo, String marca) {
        super(color, modelo, marca);
        this.energia = energia;
    }
    /**
     * metodo get
     * @return consigue el tipo de enerfia del
     * Transporte Terrestre
     */
    public String getEnergia() {
        return energia;
    }
    /**
     * metodo set: Modificar
     * @param energia: el tipo de energia del 
     * Transporte Terrestre
     */
    public void setEnergia(String energia) {
        this.energia = energia;
    }
    /**
     * Realizar la accion "Rodar"
     */
    public void rodar(){
        /**
         * imprime que el Transporte terrestre esta rodando
         */
        System.out.println("Rodandoo...");
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
         * imprime que el Transporte Terrestre esta avanzando
         */
        System.out.println("Avanzanding..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * energia del Transporte Terrestre + los atributos de
     * la clase superior
     */
    @Override
    public String toString() {
        return "TransporteTerrestre{" + "energia=" + 
                energia + super.toString()+ '}';
    }
    
}
