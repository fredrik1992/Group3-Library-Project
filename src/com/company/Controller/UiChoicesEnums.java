package com.company.Controller;

public class UiChoicesEnums {

    public static enum librarianSwitchChoices {
        SHOW_ALL_BOOKS,
        SEARCH_BY_TITLE,
        SEARCH_BY_AUTHOR,
        ADD_BOOK,
        REMOVE_BOOK,
        SEE_ALL_BOOKS_OF_USER,
        SHOW_ALL_USERS,
        FIND_USER,
        QUIT,
        DEFAULT

    }
    public  static enum userSwitchChoices {
        SHOW_ALL_BOOKS,
        SEARCH_BY_TITLE,
        SEARCH_BY_AUTHOR,
        ADD_BOOK,
        QUIT,
        DEFAULT

    }
    public static enum loginOrRegister{
        LOGIN,
        REGISTER,
        TERMINATE_PROGRAM,
        DEFAULT
    }
}
