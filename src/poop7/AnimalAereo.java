/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un aninal Aereo con atributo de numero de alas
 * Se extinete a la clase Animal
 */
public class AnimalAereo extends Animal {
    /**
     * numeroAlas: numero de alas del animal aereo
     */
    private int numeroAlas;
    /**
     * Construstor vacio
     */
    public AnimalAereo() {
    }
    /**
     * Construstor lleno
     * @param numeroAlas:numero de alas del animal aereo
     * @param nombre: nombre del animal aereo
     * @param lugarOrigen: lugar de origen del animal aereo
     * @param color: color del animal aereo 
     */
    public AnimalAereo(int numeroAlas, String nombre, 
            String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * metodo get
     * @return consigue el numero de alas del animal aereo
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * metodo set: modificar
     * @param numeroAlas: numero de alas del animal aereo  
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Realizar la accion "Volar"
     */
     public void volar(){
         /**
         * Imprime que el animal aereo esta volando
         */
        System.out.println("Estoy volando");
    }
    /**
     * metodo sobre escrito debido a que la clase mas 
     * alta de rango ya tiene un metodo "comer"
     */
    @Override //metodod sobre escrito debido a qie la 
            //clase mas lata de rango ya tiene un metodo "comer"
    /**
     * Realizar la accion "Comer"
     */
    public void comer(){
        /**
         * Imprime que el animal aereo esta comiendo gusanos
         */
        System.out.println("Estoy comiendo gusanos");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase:
     * numeros de alas + los atributos de la clase superior
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas 
                + super.toString()+ '}';
    }    
}
