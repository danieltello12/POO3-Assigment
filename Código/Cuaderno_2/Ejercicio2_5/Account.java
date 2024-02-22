package Cuaderno_2.Ejercicio2_5;

public class Account {
    private int id;
    private Customer custumer;
    private double balance=0.0;

    public Account(int id, Customer costumer, double balance) {
        this.id = id;
        this.custumer = costumer;
        this.balance = balance;
    }

    public Account(int id, Customer costumer) {
        this.id = id;
        this.custumer = costumer;
    }

    public int getId() {
        return id;
    }
    public String toString() {
        return "{" +
                custumer + '\'' + "balance=" + String.format("%.2f", balance)+
                '}';

    }

    public Customer getCostumer() {
        return custumer;
    }


    public double getBalance() {
        return balance;
    }

    public String getCostumerName(){
        return custumer.getName();
    }
    public Account deposit(double cantidad){
        this.balance=cantidad+balance;
        return this;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account withdraw(double cantidad){
        if (balance>=cantidad){
            this.balance=balance-cantidad;


        }else{
            System.out.println("La cantidad supera el balance");
        }
        return this;


    }
}
