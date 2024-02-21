package Cuaderno_2.Ejercicio2_9;

public class Mypoint {
    int x=0;
    int y=0;

    public Mypoint() {
    }

    public Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] duplacoordenadas = new int[2];
        duplacoordenadas[0]=this.x;
        duplacoordenadas[1]=this.y;
        return duplacoordenadas;
    }
    public void setXY(int x, int y){
        int[] duplacoordenadas = new int[2];
        duplacoordenadas[0]=x;
        duplacoordenadas[1]=y;
    }public String toString(){
        return("("+this.x+","+this.y+")");
    }
    public double distance(int x, int y){
        int numero=((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y));
        return Math.sqrt(numero);
    }
    public double distancia(Mypoint otro){
        int numero=((otro.x-this.x)*(otro.x-this.x))+((otro.y-this.y)*(otro.y-this.y));
        return Math.sqrt(numero);
    }
    public double distancia(){
        int numero= (this.x*this.x)+(this.y*this.y);
        return Math.sqrt(numero);
    }
}
