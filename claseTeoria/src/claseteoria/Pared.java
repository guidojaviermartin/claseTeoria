package claseteoria;

    public class Pared {
    private int posX;
    private int posY;

    public Pared() {
        posX=(int)(Math.random()*75);
        posY=(int)(Math.random()*17);
        System.out.println("Posicion de la pared en (X,Y) = ("+posX+" , ("+posY+")");
       
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
   
}
