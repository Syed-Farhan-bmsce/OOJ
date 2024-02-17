// Create a class Book which contains four members: name, author, price, num_pages. Include a constructor to set the values for the members. Include methods to set and get the details of the objects. Include a toString( ) method that could display the complete details of the book. Develop a Java program to create n book objects.

import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor to set the values for the members
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Method to set details of the book
    public void setDetails(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Method to get the details of the book
    public String getDetails() {
        return "Name: " + name + ", Author: " + author + ", Price: $" + price + ", Number of Pages: " + numPages;
    }

    // toString() method to display the complete details of the book
    @Override
    public String toString() {
        return getDetails();
    }
}

public class Create_n_book_objects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Number of Pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nDetails of Books:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Book " + (i + 1) + ":");
            System.out.println(books[i]);
        }
    }
}

