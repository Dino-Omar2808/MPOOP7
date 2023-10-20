/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un aninal acuatico con atributo de numero de aletas
 * Se extinete a la clase Animal
 */
public class AnimalAcuatico extends Animal {
    /**
     * numeroAletas: numero de aletas del animal acuatico
     */
    private int numeroAletas;
    /**
     * Construstor vacio
     */
    public AnimalAcuatico() {
    }
    /**
     * Construstor lleno
     * @param numeroAletas: numero de aletas del animal acuatico
     * manda a llamar a los atributos de l calase superior
     * @param nombre: nombre del animal acuatico
     * @param lugarOrigen: Lugar de origen del animal acuatico
     * @param color: color del animal acuatico 
     */
    public AnimalAcuatico(int numeroAletas, String nombre, 
            String lugarOrigen, String color) {
        //refrencia a la calase superior
        super(nombre, lugarOrigen, color);//
        this.numeroAletas = numeroAletas;
    }
    /**
     * metodo get
     * @return consigue el numero de aletas del animal acuatico
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * metodo set: modifica
     * @param numeroAletas: numero de aletas del animal acuatico 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Realizar la accion "Nadar"
     */
    public void nadar(){
        /**
         * Imprime que el animal acuatico esta nadando
         */
        System.out.println("Estoy nadando");
    }
    /**
     * metodo sobre escrito debido a que la clase mas alta 
     * de rango ya tiene un metodo "comer"
     */
    @Override 
    /**
     * Realizar la accion "Comer"
     */
    public void comer(){
        /**
         * Imprime que el animal acuatico esta comiendo peces
         */
        System.out.println("Estoy comiendo peces");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * numeros de aletas + los atributos de la clase superior
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas 
                +" "+ super.toString()+  '}'; //mandar a llmar el
        //toString superiro de todos los atributos
    }    
}
