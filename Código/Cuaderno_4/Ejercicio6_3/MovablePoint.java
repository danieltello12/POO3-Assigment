package Cuaderno_4.Ejercicio6_3;


public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+this.x+","+this.y+"), Speed= ("+xSpeed+","+ySpeed+")";
    }

    @Override
    public void MoveDown() {
        this.y=this.y-this.ySpeed;
    }

    @Override
    public void MoveUP() {
        this.y=this.y+this.ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.x=this.x-this.xSpeed;
    }

    @Override
    public void MoveRight() {
        this.x=this.x+this.xSpeed;
    }

}
