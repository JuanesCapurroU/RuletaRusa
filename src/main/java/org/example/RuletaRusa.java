package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {
    private List<String> jugadores  =  new ArrayList<>();
    private Random random;
    private int posicionarBala = 0;
    private int posicionActual = 0;

    @Override
    public String toString() {
        return "RuletaRusa{" +
                "jugadores=" + jugadores +
                ", random=" + random +
                ", posicionarBala=" + posicionarBala +
                ", posicionActual=" + posicionActual +
                '}';
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<String> jugadores) {
        this.jugadores = jugadores;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getPosicionarBala() {
        return posicionarBala;
    }

    public void setPosicionarBala(int posicionarBala) {
        this.posicionarBala = posicionarBala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public RuletaRusa() {
        this.random = new Random();
    }

    public RuletaRusa(List<String> jugadores, Random random, int posicionarBala, int posicionActual) {
        this.jugadores = jugadores;
        this.random = random;
        this.posicionarBala = posicionarBala;
        this.posicionActual = posicionActual;
    }
    public void agregarJugadores(String nombre){
        jugadores.add(nombre);
    }
    public void posicionarBala(){
        this.posicionarBala =  random.nextInt(6);
        this.posicionActual = 0;
        System.out.println("Tambor girado y bala puesta...");
    }

    public boolean disparar(){
            posicionarBala();
            if (posicionarBala==posicionActual){
                System.out.println("Muere el jugador: " + jugadores.get(posicionActual));
                jugadores.remove(posicionActual);
                posicionarBala();
                return true;
            }else {
                System.out.println("Se salvo el jugador: " + jugadores.get(posicionActual));
                posicionActual+=1% jugadores.size();
                return false;
            }

    }
    public void mostrarInfo(){
        System.out.println("""
                \nJUEGO PREPARADO: \n
                NUMERO DE JUGADORES: """+jugadores.size() +
                """
                \nNOMBRES: """+jugadores+
                """
                \nPOSICION DE LA BALA: """+posicionarBala+
                """
                \nPOSICION DEL TAMBOR: """+posicionActual+"\n"
                );
    }
}
