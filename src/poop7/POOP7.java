/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import transportes.Avión;
import transportes.Barco;
import transportes.Combi;
import transportes.Helicoptero;
import transportes.MediosDeTransporte;
import transportes.Metro;
import transportes.Subterraneo;
import transportes.Suburbano;
import transportes.Supraterraneo;
import transportes.Taxi;
import transportes.Trajinera;
import transportes.TransporteAcuatico;
import transportes.TransporteAereo;
import transportes.TransporteTerrestre;

/**
 *
 * @author dinos
 * 
 */
public class POOP7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*******ANIMALES*******");
        Animal animal= new Animal("Max",
                "CDMX","Cafe");
      /**
       * se llama al metodo to STRING
       */
        System.out.println(animal.toString());
        System.out.println("*******ANIMAL ACUATICO*******");
        AnimalAcuatico animalAcuatico=new AnimalAcuatico();
        animalAcuatico.setNombre("Leo");
        animalAcuatico.setLugarOrigen("Australia");
        animalAcuatico.setColor("Rojo");
        animalAcuatico.setNumeroAletas(4);
        
        System.out.println(animalAcuatico.toString());
         
        Ballena ballena=new Ballena (30,2,
                "Wilson","canada","gris");     
        System.out.println(ballena.toString());
        
        System.out.println("*******ANIMAL TERRESTRE*******");
        
        AnimalTerrestre animalTerrestre =new AnimalTerrestre();
        animalTerrestre.setNombre("Lu");
        animalTerrestre.setLugarOrigen("US");
        animalTerrestre.setColor("negro");
        animalTerrestre.setNumeroPatas(4);
        
        System.out.println(animalTerrestre.toString());
        
        Perro perro = new Perro("verde",4,
                "pedro","US","cafe");      
        System.out.println(perro.toString());
        
        System.out.println("*******ANIMAL AEREO*******");
        
        AnimalAereo animalAereo=new AnimalAereo();
        animalAereo.setNombre("Rio");
        animalAereo.setLugarOrigen("Brasil");
        animalAereo.setColor("AZUL");
        animalAereo.setNumeroAlas(2);
        
        System.out.println(animalAereo.toString());
        
        Pajaro pajaro=new Pajaro("Chato",2,
                "Xolot","México","Verde"); 
        System.out.println(pajaro.toString());
        
        System.out.println("*******MEDIOS DE TRASNPORTE*******");
        
        MediosDeTransporte mdt= new MediosDeTransporte(
                "rojo","XY23","54F");
        System.out.println(mdt.toString());
        
        System.out.println("*******TRASNPORTE ACUATICO*******");
        
        TransporteAcuatico tAcuatico =new TransporteAcuatico();
        tAcuatico.setColor("Rojo");
        tAcuatico.setModelo("XRAS");
        tAcuatico.setMarca("JEEP");
        tAcuatico.setNumeroCascos(5);
        
        System.out.println(tAcuatico.toString());
        
        Barco barco = new Barco("De carga",4,
                "Azul","Q7ET","NISSAN");
        System.out.println(barco.toString());
        
        Trajinera trj= new Trajinera(30 ,1 ,
                "Cafe" ,"ST2X8" ,"Artesanal");
        System.out.println(trj.toString());
        
        System.out.println("*******TRASNPORTE AEREO*******");
        
        TransporteAereo tAereo =new TransporteAereo();
        tAereo.setColor("Negro");
        tAereo.setModelo("YSW23");
        tAereo.setMarca("Aeromexico");
        tAereo.setNumeroAlerones(2);
        
        System.out.println(tAereo.toString());
        
        Avión avion= new Avión(89,4,
                "Gris","AXW12","VISA");
        System.out.println(avion.toString());
        
        Helicoptero hcp = new Helicoptero(2,
                1,"Naranja","QW12N",
                "NASA");
        System.out.println(hcp.toString());
        
        System.out.println("*******TRASNPORTE TERRESTRE*******");
        
        TransporteTerrestre tt =new TransporteTerrestre();
        tt.setColor("Blanco");
        tt.setModelo("SDZE5");
        tt.setMarca("Toyota");
        tt.setEnergia("electrica");
        
        System.out.println(tt.toString());
        
        System.out.println("*******Supraterraneo*******");
        
        Supraterraneo spr = new Supraterraneo(4,
                "Gasolina","Verde","QWE29",
                "Mini Cooper");
        System.out.println(spr.toString());
        
        Combi cmb=new Combi(96,4,"Gas",
                "Morado","QYTS26","Nissan");
        System.out.println(cmb.toString());
        
        Taxi taxi = new Taxi (54,4,
                "Gasolina","Hueso","OUR23",
                "Audi");
        System.out.println(taxi.toString());
        
        System.out.println("*******Subterraneo*******");
        
        Subterraneo sbr = new Subterraneo(6,
                "Electricidad","Ocre","LNDIE45",
                "AYAY");
        System.out.println(sbr.toString());
        
        Metro mtr= new Metro(54,5,"Electrica",
                "Amarilla","VXRT32","BSUISD");
        System.out.println(mtr.toString());
        
        Suburbano sbur = new Suburbano(28,8,
                "Vapor","Lila","YHR34",
                "QWSUEEER");
        System.out.println(sbur.toString());
        
        System.out.println("*******FIN DEL PROGRAMA*******");
    }
    
}
//actividad clase terminar el diagrama
//activida extra hacer el diagrama del previo

//entregar los diagramas d los dos, 
/*documntar todo
piner en git hub
investigar como llamar la informacion de
*/