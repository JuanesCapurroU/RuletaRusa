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
                case 2->{
                    if (ruleta.getJugadores().size() < 6) {
                        System.out.println("No hay completado los jugadores para iniciar, por favor ingresa los jugadores en el menu opcion 1.");
                        break;
                    }
                    System.out.println("MUCHA SUERTEEEE!");
                    System.out.println("\nGirando Tamborrrr...");
                    System.out.println("\nGirando Tamborrrr........");
                    while (ruleta.getJugadores().size() > 1) {
                        System.out.println("\nPresiona Enter para disparar..");
                        input.nextLine();
                        ruleta.disparar();
                        ruleta.mostrarInfo();
                    }
                    System.out.println("El juego TERMINO......");
                    System.out.println("EL GANADOR ES: " + ruleta.getJugadores().get(0));
                }
                case 3->{
                    System.out.println("Saliendo... vuelve prontooo....");
                }
            }
        }while (opcion!=3);
    }
}