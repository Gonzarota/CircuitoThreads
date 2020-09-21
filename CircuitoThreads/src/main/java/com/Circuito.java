package com;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    List<Coche> coches= new ArrayList<>();
    int longitud=2000;

    public void realizarCarrera(){

        for(Coche coche: coches) {
            coche.start();
        }

        for(Coche coche:coches){
            try {
                coche.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        posicionesCoches();

    }

    public void posicionesCoches(){
        coches.sort(new CocheComparetor());
        int posicion=1;

        System.out.println("Resumen de la carrera: ");

        for(Coche coche:coches){
            System.out.println("El coche "+coche.getId()
                    +" en la posición "+ posicion
                    +" con un tiempo de "+coche.getResultado());
            posicion++;
        }
    }

    public void addCoche(Coche coche){
        coches.add(coche);
        coche.setCircuito(this);
    }



}
