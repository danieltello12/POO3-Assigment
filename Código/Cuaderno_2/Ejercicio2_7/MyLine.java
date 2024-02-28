package Cuaderno_2.Ejercicio2_7;

public class MyLine {
    private Mypoint begin;
    private Mypoint end;
    public MyLine(int x1,int x2,int y1,int y2){
        this.begin=new Mypoint(x1,y1);
        this.end=new Mypoint(x2,y2);
    }
    public MyLine(Mypoint begin, Mypoint end){
        this.begin=begin;
        this.end=end;
    }

    public Mypoint getBegin() {
        return begin;
    }

    public Mypoint getEnd() {
        return end;
    }

    public void setBegin(Mypoint begin) {
        this.begin = begin;
    }

    public void setEnd(Mypoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setX(y);
    }

    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public int[] getBeginXY(){
        return this.begin.getXY();
    }

    public void setBeginXY(int x,int y){
        this.begin.setXY(x,y);
    }
    public int[] getEndXY(){
        return this.end.getXY();
    }

    public void setEndXY(int x,int y){
        this.end.setXY(x,y);
    }
    public double getLength(){
        Mypoint x=new Mypoint(this.end.getX()-this.begin.getX(),this.end.getY()-this.begin.getY());
        return x.distancia();
    }

    public double getGradient(){
        return Math.atan2(this.end.getX()-this.begin.getX(),this.end.getY()-this.begin.getY());
    }

    public String toString(){
        return "MyLine[" +
                "begin" + '\'' + "="+begin+
                "," +"end"+"="+end+
                '}';
    }



}