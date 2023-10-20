/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author dinos
 * Es un aninal con atributos como el nombre, 
 * lugar de origen y color
 */
/*
 * clase object
 */
public class Animal extends Object {
    /**
     * nombre: el nombre del animal, lugarOrigen: 
     * el lugar del origen del animal, color: el color del animal
     */
    private String nombre, lugarOrigen, color;
    /**
     * construcotr vacio
     */
    public Animal() {
    }
    /**
     * Construstor lleno
     * @param nombre:nombre del animal
     * @param lugarOrigen: lugar de origen
     * @param color: color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * metodo get
     * @return consigue el nombre del animal 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo set: modifica
     * @param nombre : nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo get
     * @return consigue el lugar de origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * metodo set: modifica
     * @param lugarOrigen lugar de origen del animal 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * metodo get
     * @return consigue el color del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * metodo set: modifica
     * @param color: color del animal 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Realizar la accion "Hacer Sonido"
     * @param sonido: el sonido que hace el animal 
     */
    public void HacerSonido (String sonido){
        /**
         * Imprime el sonido que hace el animal
         */
        System.out.println("sonido:" + sonido);
    }
    /**
     * Realizar la accion "Comer"
     */
    public void comer(){
        /**
         * imprime que el animal esta comiendo
         */
        System.out.println("estoy cominedo..");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * color, lugar de origen y nombre
     */
    @Override //sobre escritura, se escribio (clase base objet)
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen="
                + lugarOrigen + ", color=" + color + '}';
    }
    
}

