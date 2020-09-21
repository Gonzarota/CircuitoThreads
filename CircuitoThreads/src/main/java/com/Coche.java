package com;

public class Coche extends Thread{
    private int velocidad;
    private int id;
    private Circuito circuito;
    private int tiempo;
    private long resultado;

    public Coche(int velocidad,int id){
        this.velocidad=velocidad;
        this.id=id;
    }


    @Override
    public void run(){
        long tiempoInicial= System.currentTimeMillis();
        this.tiempo= circuito.longitud/velocidad;
        System.out.println("Empiezo la carrera, soy el coche nº: "+id);
        try {
            this.join(tiempo);
            System.out.println("Finish "+ id);
            long tiempoFinal=System.currentTimeMillis();
            this.resultado=tiempoFinal-tiempoInicial;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public long getResultado() {
        return resultado;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
}
