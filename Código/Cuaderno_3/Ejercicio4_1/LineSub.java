package Cuaderno_3.Ejercicio4_1;

    public class LineSub extends Point {
        Point end; // Ending point


        public LineSub (int beginX, int beginY, int endX, int endY) {
            super(beginX, beginY); // construct the begin Point
            this.end = new Point(endX, endY); // construct the end Point
        }
        public LineSub (Point begin, Point end) { // caller to construct the Points
            super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
            this.end = end;
        }


        public String toString() {
            return "Las coordenadas son: begin=" +super.toString()+"end= "+"(" + end.getX() + "," + end.getY() + ")";
        }

        public Point getBegin() {
            return new Point(getBeginX(),getBeginY());
        }
        public Point getEnd() {
            return new Point(getEndX(),getEndY());
        }
        public void setBegin(int x,int y) {
            super.setX(x);
            super.setY(y);
        }

        public void setEnd(int x,int y) {
            end.setX(x);
            end.setY(y);
        }

        public int getBeginX() {
            return super.getX();
        }
        public int getBeginY() {
            return super.getY();
        }
        public int getEndX() {
            return end.getX();
        }
        public int getEndY() {
            return end.getY();
        }

        public void setBeginX(int x) {
            super.setX(x);
        }
        public void setBeginY(int y) {
            super.setY(y);
        }
        public void setBeginXY(int x,int y) {
            super.setXY(x,y);
        }
        public void setEndX(int x) {
            end.setX(x);
        }
        public void setEndY(int y) {
            end.setY(y);
        }
        public void setEndXY(int x, int y) {
            end.setXY(x,y);
        }

        public double getLength() {
            double xdiff=end.getX()-super.getX();
            double ydiff=end.getY()-super.getY();
            return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
        }
        public double getGradient() {
            double xdiff=end.getX()-super.getX();
            double ydiff=end.getY()-super.getY();
            return Math.atan2(xdiff,ydiff);
        }
    }

