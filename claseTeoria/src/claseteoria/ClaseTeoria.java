package claseteoria;

import java.util.Scanner;

public class ClaseTeoria {
   
    public static void main(String[] args) {
        System.out.println("Ingrese");
        Scanner leer = new Scanner(System.in);
        int opcion = 5;
        Escena escena1 = new Escena();
        while (opcion != 0) {
            System.out.println("MENU");
            System.out.println("1. Jugar");
            System.out.println("2. Nueva Partida");
            System.out.println("3. Controles");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Pulse 't' para terminar el juego");
                    escena1.jugar();
                    break;
                case 2:
                    escena1.nuevoVehiculo();
                    break;
                case 3:
                    System.out.println("Los controles son: ");
//                    opcion = 0;
                    break;
                case 4:
                    System.out.println("¿Está seguro que desea salir (S/N)?");
                    leer.nextLine();
                    String salida = leer.nextLine();
                    if (salida.toUpperCase().equals("S")) {
                        System.out.println("Saliendo del programa...");
                        opcion = 0;
                        break;
                    } else {
                        if (!salida.toUpperCase().equals("N")) {
                            System.out.print("\u001B[31m");
                            System.out.println( "Error. Opcion incorrecta");
                            break;
                        }
                        break;
                    }
                default : 
                    System.out.println("Error vuelva a ingresar la opcion");
            }
        }
    }
}
