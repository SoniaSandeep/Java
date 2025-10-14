import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;

    
    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    
    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = s.nextInt();

        Book[] b = new Book[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = s.next();

            System.out.print("Enter author name: ");
            String author = s.next();

            System.out.print("Enter price: ");
            int price = s.nextInt();

            System.out.print("Enter number of pages: ");
            int numPages = s.nextInt();

            b[i] = new Book(name, author, price, numPages);
        }

        
        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + " details:");
            System.out.println(b[i]);
        }

        s.close();
    }
}    
