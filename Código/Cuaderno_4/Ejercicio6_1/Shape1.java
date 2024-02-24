package Cuaderno_4.Ejercicio6_1;

    public abstract class Shape1 {
        protected String color;
        protected boolean filled=true;

        public Shape1(){
            this.color=color="red";
            this.filled=filled;
        }

        public Shape1(String color, boolean filled) {
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

        public abstract double getArea();


        public abstract double getPerimeter();


        @Override
        public String toString() {
            return "Shape[" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    ']';
        }
}
