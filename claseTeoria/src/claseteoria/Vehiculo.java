
package claseteoria;

public abstract class Vehiculo {
    protected int posX;
    protected int posY;
    protected boolean chocado;

    public Vehiculo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isChocado() {
        return chocado;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setChocado(boolean chocado) {
        this.chocado = chocado;
    }

    public abstract void moverArriba();
     /*   
        if (!chocado && posY != 0) {
            posY -= 1;
            System.out.println("La posición del auto (X,Y) es: " + posX + " " + posY);
        } 
        else {
            System.out.println("No se puede mover a esa posicion. Llego al limite");
        }
    } */

    public void moverAbajo() {
        if (!chocado && posY < 22) {
            posY += 1;
            System.out.println("La posición del auto (X,Y) es: " + posX + " " + posY);
        } else {
            System.out.println("No se puede mover a esa posicion. Llego al limite");
        }
    }

    public void moverIzquierda() {
        if (!chocado && posX != 0) {
            posX -= 1;
            System.out.println("La posición del auto (X,Y) es: " + posX + " " + posY);
        } else {
            System.out.println("No se puede mover a esa posicion. Llego al limite");
        }
    }

    public void moverDerecha() {
        if (!chocado && posX <= 80) {
            posX += 1;
            System.out.println("La posición (X,Y) es: " + posX + " " + posY);
        } 
        else {
            System.out.println("No se puede mover a esa posicion. Llego al limite");
        }
    }
}
