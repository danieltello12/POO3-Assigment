package Cuaderno_3.Ejercicio3_4;

public class MovablePoint extends Point {

    float xSpeed=0.0f;
    float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x,float y){
        this.xSpeed=x;
        this.ySpeed=y;
    }
    public float[] getSpeed(){
        float[] duplavelocidad = new float[2];
        duplavelocidad[0]=this.xSpeed;
        duplavelocidad[1]=this.ySpeed;
        return duplavelocidad;
    }
    public String toString(){
        return super.toString()+"speed("+this.xSpeed+","+this.ySpeed+")";
    }
}
