/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author dinos
 * Es un Avión con atributo de capacidad
 * Se extiende a la clase Transporte Aereo
 */
public class Avión extends TransporteAereo {
    /**
     * capacidad: es la capacidad que tiene el avion
     */
    private int capacidad;
    /**
     * Constructor vacio
     */
    public Avión() {
    }
    /**
     * Constructor Lleno
     * @param capacidad: es la capacidad que tiene
     * el avion
     * @param numeroAlerones: es el numero de alerones 
     * del avión
     * @param color: es el color del avión
     * @param modelo: es el modelo del avión
     * @param marca: es la marca del avión
     */
    public Avión(int capacidad, int numeroAlerones, 
            String color, String modelo, String marca) {
        super(numeroAlerones, color, modelo, marca);
        this.capacidad = capacidad;
    }
    /**
     * metodo get
     * @return consigue la capacidad del avión
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * metodo set: Modificar
     * @param capacidad: capacidad que tiene el avión
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    /**
     * Realizar la accion "salir a tiempo"
     */
    public void salirTiempo(){
        /**
         * se imprime que el avion sale a tiempo
         */
        System.out.println("Estamos saliendooo");
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de las variables de la clase: 
     * la capacidad del avión + los atributos de las clases 
     * superiores
     */
    @Override
    public String toString() {
        return "Avi\u00f3n{" + "capacidad=" + capacidad + 
                super.toString()+'}';
    }
    
}
