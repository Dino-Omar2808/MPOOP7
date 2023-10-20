/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un aninal Terrestre con atributo de numero de patas
 * Se extinete a la clase Animal
 */
public class AnimalTerrestre extends Animal {
    /**
     * numeroPatas: numero de patas del animal terrestre
     */
    private int numeroPatas;
    /**
     * Construstor vacio
     */
    public AnimalTerrestre() {
    }
    /**
     * Construstor lleno
     * @param numeroPatas:numero de patas del animal terrestre
     * manda a llamar a los atributos de l calase superior
     * @param nombre: nombre del animal terrestre
     * @param lugarOrigen: lugar de origen del animal terrestre
     * @param color:color del animal terrestre 
     */
    public AnimalTerrestre(int numeroPatas, String nombre, 
            String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * metodo get
     * @return consigue el numero de patas del animal terrestre
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * metodo set: modificar
     * @param numeroPatas: numero de patas del animal terrestre 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Realizar la accion "Correr"
     */
     public void correr(){
         /**
         * Imprime que el animal terrestre esta corriendo
         */
        System.out.println("Estoy Corriendo");
    }
    /**
     * metodo sobre escrito debido a que la clase mas alta 
     * de rango ya tiene un metodo "comer"
     */
    @Override //metodod sobre escrito debido a qie la clase 
           // mas lata de rango ya tiene un metodo "comer"
    /**
     * Realizar la accion "Comer"
     */
    public void comer(){
        /**
         * Imprime que el animal terrestre esta comiendo croquetas
         */
        System.out.println("Estoy comiendo croquetas");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: numeros 
     * de patas + los atributos de la clase superior
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + 
                super.toString()+'}';
    }    
}
