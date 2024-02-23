package Cuaderno_3.Ejercicio3_3;

public class Point3D extends Point2D{
    private float z=0.0f;
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        setX(x);
        setY(y);
        this.z=z;
    }

    public float[] getXYZ() {
        float[] result = new float[3]; // construct an array of 2 elements
        result[0] = getX();
        result[1] = getY();
        result[2]=this.z;
        return result; // return the array
    }

    @Override
        public String toString() { // in Cylinder class
            return "Point3D: Las coordenadas son: " + super.toString() // use Circle's toString()
                    + " z=" + z;
        }
}
