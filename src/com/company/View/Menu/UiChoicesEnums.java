package com.company.View.Menu;

public class UiChoicesEnums {

    public enum librarianSwitchChoices {
        SHOW_ALL_BOOKS,
        SEARCH_BY_TITLE,
        SEARCH_BY_AUTHOR,
        EDIT_LIBRARY_BOOKS,
        SEE_ALL_BOOKS_OF_USER,
        SHOW_ALL_USERS,
        FIND_USER,
        SEE_ALL_LENT_OUT_BOOKS,
        QUIT,
        DEFAULT

    }

    public enum editLibraryBooksChoices {
        ADD_BOOK,
        ADD_LIST_OF_BOOKS,
        REMOVE_BOOK,
        GO_BACK,
        DEFAULT
    }

    public enum userSwitchChoices {

        ENTER_LIBRARY,
        SEE_MY_BORROWED_BOOKS,
        QUIT,
        DEFAULT

    }

    public enum userEnterLibraryChoices {
        SHOW_ALL_BOOKS,
        SHOW_AVAILABLE_BOOKS,
        SEARCH_BY_TITLE,
        SEARCH_BY_AUTHOR,
        BORROW_THE_BOOK,
        RETURN_THE_BORROWED_BOOK,
        GO_BACK,
        DEFAULT
    }

    public enum loginOrRegister {
        LOGIN,
        REGISTER,
        TERMINATE_PROGRAM,
        DEFAULT
    }

    public enum afterShowAllBook {
        SORT_BY_TITLE,
        SORT_BY_AUTHOR,
        GO_BACK,
        DEFAULT
    }
}
