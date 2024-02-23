package Cuaderno_3.Ejercicio3_5;

public class Shape {
    private String color;
    private boolean filled=true;
    public Shape(){
        this.color=color="red";
        this.filled=filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled==true;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
