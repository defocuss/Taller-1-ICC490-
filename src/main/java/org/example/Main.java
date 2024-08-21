package org.example;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecutarMenu();
    }
    public static String [][]crearMatrizCartas(){
        String cartas[][] = new String[12][2];
        return cartas;
    }
    public static void agregarCartas(String cartas[][],String nombreCartas,String puntaje){
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i][0] == null ){
                cartas[i][0] = nombreCartas;
                cartas[i][1] = puntaje;
                break;
            }
        }
    }
    public static void mostrarMenu() {
        System.out.println("\nJuego de cartas:");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }
    public static void ejecutarMenu(){
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 2);
    }
    public static int leerOpcion() {
        int opcion = 0;
        while (true) {
            Scanner scanner = crearScanner();
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 2) {
                    break;
                } else {
                    System.out.print("Opción inválida. Intente nuevamente: ");
                }
            } else {
                System.out.print("Entrada no válida. Ingrese un número: ");
                scanner.next();
            }
        }

        return opcion;
    }
    public static Scanner crearScanner() {
        return new Scanner(System.in);
    }
    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                Jugar();
                break;
            case 2:
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void inicializarCartasJuego(String cartas[][]){
        agregarCartas(cartas,"as", "11");
        agregarCartas(cartas,"dos", "2");
        agregarCartas(cartas,"tres", "3");
        agregarCartas(cartas,"cuatro", "4");
        agregarCartas(cartas,"cinco", "5");
        agregarCartas(cartas,"seis", "6");
        agregarCartas(cartas,"siete", "7");
        agregarCartas(cartas,"ocho", "8");
        agregarCartas(cartas,"nueve", "9");
        agregarCartas(cartas,"jota", "10");
        agregarCartas(cartas,"quina", "10");
        agregarCartas(cartas,"kaiser", "10");
        for (int i = 0; i < cartas.length; i++){
            if (cartas[i][0] == null){
                break;
            }
            else {
                System.out.println(cartas[i][0] + " /" + cartas[i][1]);
            }

        }
    }
    public static int obtenerCartas(String [][]cartas){
        Random rand = new Random();
        int valorRandom = rand.nextInt(12);
        String cartaElegida1 = cartas[valorRandom][1];
        int cartaElegidaInt1 = Integer.parseInt(cartaElegida1);

        int valorRandom2 = rand.nextInt(12);
        String cartaElegida2 = cartas[valorRandom2][1];
        int cartaElegidaInt2 = Integer.parseInt(cartaElegida2);

        int valorRandom3 = rand.nextInt(12);
        String cartaElegida3 = cartas[valorRandom3][1];
        int cartaElegidaInt3 = Integer.parseInt(cartaElegida3);

        return cartaElegidaInt1 + cartaElegidaInt2 + cartaElegidaInt3;
    }
    public static void Jugar(){
        String matrizCartas[][] = crearMatrizCartas();
        inicializarCartasJuego(matrizCartas);
        int totalJugador1 = obtenerCartas(matrizCartas);
        int totalJugador2 = obtenerCartas(matrizCartas);
        Ganador(totalJugador1,totalJugador2);
    }
    public static void Ganador(int totalJugador1,int totalJugador2){
        if (totalJugador1 > 20){
            System.out.println("El jugador 1 ha perdido con mas de 20 puntos" );
        }
        else if (totalJugador2 > 20){
            System.out.println("El jugador 2 ha perdido con mas de 20 puntos" );
        }
        else {
            if (totalJugador1 > totalJugador2) {
                System.out.println("Ha ganado el jugador 1 con un total de " + totalJugador1 + " pts");
            } else if (totalJugador1 < totalJugador2) {
                System.out.println("Ha ganado el jugador 2 con un total de " + totalJugador2 + "pts");

            } else if (totalJugador2 == totalJugador1) {
                System.out.println("ha habido un empate");
            }
        }
    }

}