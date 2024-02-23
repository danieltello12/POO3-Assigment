package Cuaderno_4.Ejercicio4_1;

public class Line {
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line (Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end=end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end=new Point(endX,endY);
    }

    // Public methods
    public String toString() {
        return "x1,y1="+begin+" x2,y2= "+end;
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;

    }
    public void setBegin(Point begin) {
        this.begin=begin;
    }
    public void setEnd(Point end) {
        this.end=end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return  begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        double x=begin.getX()-end.getX();
        double y=begin.getX()-end.getY();
        return Math.sqrt(x*x+y*y);
    }
    public double getGradient() {
        double xdiff=begin.getX()-end.getX();
        double ydiff=begin.getX()-end.getY();
        return Math.atan2(xdiff,ydiff);
    }
}

