package com;

public class Main {
    public static void main(String[] args) {

        Circuito circuito=new Circuito();

        Coche lambo=new Coche(250,1);
        Coche ferrari= new Coche(300,2);
        Coche ford=new Coche(100,3);

        circuito.addCoche(lambo);
        circuito.addCoche(ferrari);
        circuito.addCoche(ford);

        circuito.realizarCarrera();



    }
}
