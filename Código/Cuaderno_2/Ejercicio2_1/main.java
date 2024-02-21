package Cuaderno_2.Ejercicio2_1;

public class main {
    public static void main(String[] args) {
        Author miObjeto = new Author("Kiki", "Kikiganadera.com", 'm');
        System.out.println(miObjeto);
        miObjeto.setEmail("laguiri.com");
        System.out.println("El nombre es: " + miObjeto.getName());
        System.out.println("El email es: " + miObjeto.getEmail());
        System.out.println("El género es: " + miObjeto.getGender());
        Book winBook = new Book("Java for win", miObjeto, 14.95, 65); // Test Book's Constructor
        System.out.println(winBook);

        winBook.setPrice(29.95);
        winBook.setQty(28);
        System.out.println("name is: " + winBook.getName());
        System.out.println("price is: " + winBook.getPrice());
        System.out.println("qty is: " + winBook.getQty());
        System.out.println("Author is: " + winBook.getAuthor()); // Author's toString()
        System.out.println("Author's name is: " + winBook.getAuthor().getName());
        System.out.println("Author's email is: " + winBook.getAuthor().getEmail());

        Book anotherBook = new Book("Más Java",
                new Author("Chiara Oliver", "laguiri@somewhere.com", 'm'), 39.95);
        System.out.println(anotherBook); // toString()
        //Otra forma de escribirlo
        System.out.println("Author's name is: " + winBook.getAuthorName());
        System.out.println("Author's email is: " + winBook.getAuthorEmail());
        System.out.println("Author's gender is: " + winBook.getAuthorGender()); // Author's toString()
    }
}

