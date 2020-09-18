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

    }

    public void addCoche(Coche coche){
        coches.add(coche);
        coche.setCircuito(this);
    }



}
