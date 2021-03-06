package com.company.View.Menu.Menus;

import com.company.Modules.Library.Library;
import com.company.View.Menu.UiChoicesEnums;
import com.company.View.Menu.UIdata;

import java.util.Scanner;

public class AfterShowAllBooks {
    UIdata data = UIdata.getInstance();
    Library library = data.getProgram().getLibrary();

    public AfterShowAllBooks() {
    }

    //----PRINTS
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    //----

    public void afterShowAllBooks() {
        Scanner input = new Scanner(System.in);
        String choiceInput;

        UiChoicesEnums.afterShowAllBook choice = UiChoicesEnums.afterShowAllBook.DEFAULT;

        while (!choice.toString().equals("GO_BACK")) {


            for (UiChoicesEnums.afterShowAllBook choices : UiChoicesEnums.afterShowAllBook.values()) {

                if (!choices.toString().equals("DEFAULT")) {
                    System.out.printf("Write: [%d] to: %s%n%n", choices.ordinal() + 1, choices);
                }

            }
            choiceInput = input.nextLine();

            try {

                choice = UiChoicesEnums.afterShowAllBook.values()[(Integer.parseInt(choiceInput) - 1)];

            } catch (Exception ignored) {
            }


            switch (choice) {

                case SORT_BY_TITLE -> library.getPrints().sortByTitle();

                case SORT_BY_AUTHOR -> library.getPrints().sortByAuthor();

                case GO_BACK -> {
                }

                default -> System.out.println(RED + "[ Wrong input ]" + RESET);

            }
        }
    }
}
