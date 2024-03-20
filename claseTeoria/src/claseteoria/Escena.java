package claseteoria;

import java.util.Scanner;

public class Escena {

    private Vehiculo vehiculo1;
    private Pared pared1;

    public Escena() {
      //  this.vehiculo1 = new Vehiculo(0, 0);
        this.pared1 = new Pared();
    }

    public void setAuto() {
        vehiculo1.setPosX(0);
        vehiculo1.setPosY(0);
        vehiculo1.setChocado(false);
    }

    public void nuevoVehiculo() {
        vehiculo1.setPosX(0);
        vehiculo1.setPosY(0);
        vehiculo1.setChocado(false);
    }

    public void jugar() {
        boolean terminado = false;
        System.out.println("La pared esta en "+ pared1.getPosX()+" "+pared1.getPosY());
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingres w, s, a, d, t");
            String input = leer.nextLine();
            switch (input.toLowerCase()) {
                case "w":
                    vehiculo1.moverArriba();
                    break;
                case "s":
                    vehiculo1.moverAbajo();
                    break;
                case "a":
                    vehiculo1.moverIzquierda();
                    break;
                case "d":
                    vehiculo1.moverDerecha();
                    break;
                case "t":
                    terminado = true;
                    break;
                default:
                    System.out.println("Entrada no válida.(w, s, a, d o t).");
            }
           if(pared1.getPosX()==vehiculo1.getPosX()&&pared1.getPosY()==vehiculo1.getPosY()){
               System.out.println("GAME OVER!!! CHOCASTE!!!");
               vehiculo1.setChocado(true);
           }            
        } while (!terminado && !vehiculo1.isChocado());
    }
}
