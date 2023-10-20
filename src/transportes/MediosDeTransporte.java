/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Medio de Transporte con atributos como color, modelo, marca
 * Se extinete a la clase Object
 */
public class MediosDeTransporte extends Object {
    /**
     * ATRIBUTOS
     * color: el color del Medio de Transporte
     * modelo: el modelo del Medio de Transporte
     * marca: la marca del Medio de Transporte
     */
    private String color, modelo, marca;
    /**
     * construcotr vacio
     */
    public MediosDeTransporte() {
    }
    /**
     * Constructor Lleno
     * @param color: el color del Medio de Transporte
     * @param modelo: el modelo del Medio de Transporte
     * @param marca: la marca del Medio de Transporte 
     */
    public MediosDeTransporte(String color, String 
            modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }
    /**
     * metodo get
     * @return consigue el color del Medio de Transporte
     */
    public String getColor() {
        return color;
    }
    /**
     * metodo set: Modificar
     * @param color: color del Medio de Transporte 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * metodo get
     * @return consigue el modelo del Medio de Transporte
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * metodo set: modificar
     * @param modelo: modelo del Medio de Transporte 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * metodo get
     * @return consegue la marca del Medio de Transporte
     */
    public String getMarca() {
        return marca;
    }
    /**
     * metodo set: Modificar
     * @param marca: la marca del Medio de Transporte 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     *Realizar la accion "Hacer Sonido" 
     * @param sonido: el sonido que hace el animal 
     */
    public void hacerSonido(String sonido){
        /**
         * Imprime el sonido que hace el animal
         */
        System.out.println("Sonido "+ sonido);
    }
    /**
     * Realizar la accion "Avanzarr"
     */ 
    public void avanzar(){
        /**
         * imprime que el Medio de Transporte esta avanzando
         */
        System.out.println("Estoy avanzado");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * color, modelo y marca del Medio de Transporte
     */
    @Override
    public String toString() {
        return "MediosDeTransporte{" + "color=" + color +
                ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
}
