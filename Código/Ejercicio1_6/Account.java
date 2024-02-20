package Ejercicio1_6;

public class Account {
    String id;
    String Name;
    int Balances=0;
    public Account(String id, String Name){
        this.id=id;
        this.Name=Name;
    }
    public Account(String id, String Name,int balance){
        this.id=id;
        this.Name=Name;
        this.Balances=balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getBalance(){
        return Balances;
    }
    public int credit(int amount){
        this.Balances=(Balances+amount);
        return Balances;
    }
    public int debit (int amount){
        if(amount<=Balances){
            this.Balances=(Balances-amount);

        }
        else{
            System.out.println("Amount exceed balance");
        }
        return Balances;
    }
    public int transferTo(Account another, int amount){
        if(amount<=Balances){
            another.Balances= another.Balances+amount;
            this.Balances=(Balances-amount);
        }
        else{
            System.out.print("Amount exceed balance");
        }
        return Balances;
    }
    public String toString(){
        return "Account[id="+id+", name="+Name+", balance="+Balances+"]";

    }

}