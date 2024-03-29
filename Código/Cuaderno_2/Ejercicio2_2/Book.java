package Cuaderno_2.Ejercicio2_2;

public class Book {
    String name;
    Author[] autores;
    double price;
    int qty=0;

    public Book(String name, Author[] autores, double price) {
        this.name = name;
        this.autores = autores;
        this.price = price;
    }

    public Book(String name, Author[] autores, double price, int qty) {
        this.name = name;
        this.autores = autores;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAutores() {
        return autores;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        int i=0;
        Author[] autores=getAutores();
        StringBuilder cadena = new StringBuilder();
        for (;i< autores.length;i++){
            cadena.append(autores[i].toString());

        }
        return("Book[name="+name+", authors={"+cadena+"}, price="+price+", qty="+qty+"]");
    }
    public String getAuthorsNames(){
        int i=0;
        Author[] autores=getAutores();
        StringBuilder cadena = new StringBuilder();
        for (;i< autores.length-1;i++){
            cadena.append(autores[i].getName()).append(",");
        }
        cadena.append(autores[i].getName());
        return cadena.toString();
    }
}



