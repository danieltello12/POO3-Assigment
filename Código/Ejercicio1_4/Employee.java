package Ejercicio1_4;

public class Employee{
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private int  Salary;
    public Employee(int id, String nombre, String segundoNombre,int Salary){
        this.id=id;
        this.primerNombre=nombre;
        this.segundoNombre=segundoNombre;
        this.Salary=Salary;
    }
    public int getId(){
        return id;
    }
    public String getprimerNombre(){
        return primerNombre;
    }
    public String getSegundoNombre(){
        return segundoNombre;
    }
    public String getName(){
        return primerNombre+segundoNombre;
    }
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int salario){
        this.Salary=salario;
    }
    public int getAnnualSalary(){
        return Salary*12;
    }
    public int raiseSalary(int percent){
        int nuevoSalario=((Salary*percent)/100)+Salary;
        this.Salary=nuevoSalario;
        return Salary;
    }
    public String toString(){
        return "Employee[id="+id+",name="+primerNombre+segundoNombre+",salary="+Salary+"]";
    }


}