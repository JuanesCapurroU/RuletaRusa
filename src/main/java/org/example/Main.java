package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RuletaRusa ruleta = new RuletaRusa();
        int opcion  = 0;

        do {
            System.out.println("""
                    JUEGO DE LA RULETA RUSA
                    1. Ingresar los jugadores (6)
                    2. Jugar
                    3. Salir
                    """);
            opcion = input.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("INGRESA EL NOMBRE DE LOS 6 JUGADORES: ");
                    for(int i =1; i < 7;i++){
                        System.out.println("Nombre del Jugador: #"+i);
                        String nombre = input.next();
                        ruleta.agregarJugadores(nombre);

                    }
                    ruleta.mostrarInfo();
                }
            }
        }while (opcion!=3);
    }
}