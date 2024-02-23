package Cuaderno_2.Ejercicio2_8;

public class Mycircle {
    private Mypoint centro= new Mypoint(0,0);
    private int radio=0;

    public Mycircle() {
    }

    public Mycircle(Mypoint centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Mycircle(int x, int y, int radio){
        Mypoint centro= new Mypoint(x,y);
        this.centro= centro;
        this.radio= radio;
    }

    public Mypoint getCentro() {
        return centro;
    }

    public int getRadio() {
        return radio;
    }
    public int getCenterX(){
        return this.centro.getX();
    }
    public int getCentery(){
        return this.centro.getY();
    }
    public int[] getXY(){
        return this.centro.getXY();
    }

    public void setCentro(Mypoint centro) {
        this.centro = centro;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void setCenterX(int x){
        this.centro.setX(x);
    }
    public void setCenterY(int y){
        this.centro.setY(y);
    }
    public void setCenterXY(int x, int y){
        this.centro.setXY(x,y);
    }
    public String toString(){
        return "Mycircle[radius="+radio+", center="+this.centro.toString()+"]";
    }
    public double getArea(){
        return  (Math.PI)*this.radio*this.radio;
    }
    public double getCircumference(){
        return 2*(Math.PI)*this.radio;
    }
    public double distancia(Mycircle otro){
        return this.centro.distancia(otro.centro);
    }
}
