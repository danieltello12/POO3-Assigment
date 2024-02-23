package Cuaderno_2.Ejercicio2_9;

public class MyTriangle {
    private Mypoint v1;
    private Mypoint v2;
    private Mypoint v3;

    public MyTriangle(Mypoint v1, Mypoint v2, Mypoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        Mypoint v1= new Mypoint(x1,y1);
        Mypoint v2 = new Mypoint(x2,y2);
        Mypoint v3=new Mypoint(x3,y3);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString(){
        return "MyTriangle[v1="+v1.toString()+", v2="+v2.toString()+",v3="+v3.toString()+"]";
    }
    public double getPerimeter(){
        double lado1= this.v1.distancia(v2);
        double lado2=this.v2.distancia(v3);
        double lado3=this.v2.distancia(v3);
        return lado1+lado2+lado3;
    }
    public String getType(){
        double lado1= this.v1.distancia(v2);
        double lado2=this.v2.distancia(v3);
        double lado3=this.v2.distancia(v3);
        if(lado1==lado2 && lado2==lado3){
            return "Equilatero";
        } else if (lado1==lado2  || lado1==lado3 || lado2==lado3 ) {
            return "Isosceles";
        } else{
            return "Escaleno";
        }
    }
}

