package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static String [][]crearMatrizCartas(){
        String cartas[][] = new String[12][2];
        return cartas;
    }
    public static void agregarCartas(String nombreCartas,String puntaje,String cartas[][]){
        for (int i = 0; i < crearMatrizCartas().length; i++) {
            if (cartas[i][0] == null ){
                cartas[i][0] = nombreCartas;
                cartas[i][1] = puntaje;
                break;
            }
        }
    }
    public static void mostrarMenu() {
        System.out.println("\nJuego de cartas:");
    }
    public static int leerOpcion() {
        int opcion = 0;
        while (true) {
            Scanner scanner = crearScanner();
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion > 1 && opcion <= 2) {
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
    public static void ejecutarOpcion(int opcion, String[][] vinilos) {
        switch (opcion) {
            case 1:
                ;
                break;
            case 2:
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void inicializarCartasJuego(){
        agregarCartas("as", "11");
        agregarCartas("dos", "2");
        agregarCartas("tres", "3");
        agregarCartas("cuatro", "4");
        agregarCartas("cinco", "5");
        agregarCartas("seis", "6");
        agregarCartas("siete", "7");
        agregarCartas("ocho", "8");
        agregarCartas("nueve", "9");
        agregarCartas("jota", "10");
        agregarCartas("quina", "10");
        agregarCartas("kaiser", "10");

    }
    public static int
}