package org.example;

public class App {
    public void run() {
        Book book = new Book();
        Author author = new Author();
        book.setTitle("The Grapes of Wrath");


        author.setName("John Steinbeck");

        Book[] books = new Book[5];
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Author name: " + author.getName());

    }



}
