package Cuaderno_3.Ejercicio3_3;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
       this.x=x;
       this.y=y;
    }
    public float[] getXY(){
        float[] duplacoordenadas = new float[2];
        duplacoordenadas[0]=this.x;
        duplacoordenadas[1]=this.y;
        return duplacoordenadas;
    }

    @Override
    public String toString() {
        return "Point2D " +
                "x=" + x +
                ", y=" + y +
                ' ';
    }
}
