package Cuaderno_2.Ejercicio2_4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return this.customer.getId();
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public int getCustomerDiscount(){
        return this.customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        int x=this.customer.getDiscount();
        double fin=this.amount-(this.amount*((double) x /100));
        return fin;
    }
    public String toString(){
        return "Invoice[Id"+id+", customer="+customer.toString()+", amount="+amount+"]";
    }
}
