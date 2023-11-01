package com.company;

class Library {
    String[] books;
    int number_of_books;

    Library() {
        this.books = new String[100];
        this.number_of_books = 0;
    }

    void addbooks(String book) {
        this.books[number_of_books] = book;
        number_of_books++;
        System.out.println(books + "    this book is added");
    }

    void avialablebooks() {
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(" *" + book);
        }
    }

    void issuebooks(String book) {
        for (int i = 0; i < book.length(); i++) {
            if (this.books[i].equals(book)) {
                System.out.println("this book is issued");
                this.books[i]=null;
            } else
                System.out.println("we dont have this book");
        }
    }
    void returnbook(String book){
        addbooks(book);
    }
}

public class cwh_51_ex4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addbooks("Think and grow Rich");
        centralLibrary.addbooks("Algorithms");
        centralLibrary.addbooks("C++");
        centralLibrary.avialablebooks();
        centralLibrary.avialablebooks();
        centralLibrary.returnbook("C++");
        centralLibrary.avialablebooks();
        
    }
}
