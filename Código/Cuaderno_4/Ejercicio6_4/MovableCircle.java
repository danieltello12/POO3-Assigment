package Cuaderno_4.Ejercicio6_4;

public class MovableCircle implements Movable {
    MovablePoint centro;
    int radio;
    public MovableCircle(int x, int y, int xS, int yS, int radio){
        MovablePoint centro= new MovablePoint(x,y,xS,yS);
        this.centro=centro;
        this.radio=radio;
    }
    public String toString(){
        return this.centro.toString()+"radio "+this.radio;
    }

    @Override
    public void MoveLeft() {
        this.centro.MoveLeft();
    }

    @Override
    public void MoveUP() {
        this.centro.MoveUP();
    }

    @Override
    public void MoveDown() {
        this.centro.MoveDown();
    }

    @Override
    public void MoveRight() {
        this.centro.MoveRight();
    }
}
