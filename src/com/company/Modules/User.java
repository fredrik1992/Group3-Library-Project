package com.company.Modules;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Serializable {
    //  List<Object> borrowedBooks = ArrayList;
    String email = null;
    List<Book> myBorrowedBooks = new ArrayList();

    public User( String username, String password) {
        super( username, password);
    }

    public List<Book> getMyBorrowedBooks() {
        return myBorrowedBooks;
    }


    public void addToBorrowedBooks(Book book){
        myBorrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
