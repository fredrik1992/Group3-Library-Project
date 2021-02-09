package com.company.Modules;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Serializable {
    //  List<Object> borrowedBooks = ArrayList;

    @Serial
    private static final long serialVersionUID = 6897230677316227865L;
    List<Book> myBorrowedBooks = new ArrayList();

    public User() { }

    public List<Book> getMyBorrowedBooks() {
        return myBorrowedBooks;
    }

    public void addToBorrowedBooks(Book book){
        myBorrowedBooks.add(book);
        System.out.println(book);
    }

    public void removeFromBorrowedBooks(Book book){
        myBorrowedBooks.remove(book);
        System.out.println("[ Book returned ]");
    }

    public void printBorrowedBooks(){
        if (myBorrowedBooks.size()>0){
            myBorrowedBooks.forEach(book -> System.out.printf("%s Return date:%s   Pending days to return: %s%n",book.getTitle(),book.getReturnDate(), book.pendingReturndays(book)));
        }else {
            System.out.println("You haven't borrowed any books yet.");

        }
    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
