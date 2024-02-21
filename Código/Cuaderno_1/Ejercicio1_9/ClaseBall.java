package Cuaderno_1.Ejercicio1_9;

public class ClaseBall {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public ClaseBall(float x,float y, int radius, float xDelta,float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }
    public float getX(){
        return x;
    }

    public float getY(){
        return y;

    }

    public void setX(float newX){
        this.x=newX;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setY(float newY){
        this.y=newY;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta=-xDelta;

    }
    public void reflectVertical(){
        this.yDelta=-yDelta;

    }
    public String toString(){

        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";

    }
}
