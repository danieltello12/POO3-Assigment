package Cuaderno_3.Ejercicio3_2;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(){
        return"Staff"+super.toString()+", school="+this.school+", pay="+this.pay+"]";
    }

}
