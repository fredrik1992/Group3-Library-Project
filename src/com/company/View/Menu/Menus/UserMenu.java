package com.company.View.Menu.Menus;

import com.company.Modules.Library.Library;
import com.company.Modules.User;
import com.company.View.Menu.UiChoicesEnums;
import com.company.View.Menu.UIdata;

import java.util.Scanner;

public class UserMenu {
    UIdata data = UIdata.getInstance();
    EnterLibraryMenu enterLibraryMenu = new EnterLibraryMenu();
    Library library = data.getProgram().getLibrary();

    //----PRINTS
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    //----

    public UserMenu() {
    }

    public void userMenu() {
        library.getUserMethods().sendReminder((User) data.getAccount());
        String choiceInput;
        Scanner input = new Scanner(System.in);
        UiChoicesEnums.userSwitchChoices choice = UiChoicesEnums.userSwitchChoices.DEFAULT;

        while (!choice.toString().equals("QUIT")) {


            for (UiChoicesEnums.userSwitchChoices choices : UiChoicesEnums.userSwitchChoices.values()) {

                if (!choices.toString().equals("DEFAULT")) {
                    System.out.printf("Write: [%d] to: %s%n%n", choices.ordinal() + 1, choices);
                }

            }
            choiceInput = input.nextLine();
            try {

                choice = UiChoicesEnums.userSwitchChoices.values()[(Integer.parseInt(choiceInput) - 1)];

            } catch (Exception ignored) {
            }


            switch (choice) {
                case ENTER_LIBRARY -> enterLibraryMenu.enterLibrary();

                case SEE_MY_BORROWED_BOOKS -> ((User) data.getAccount()).printBorrowedBooks();

                case QUIT -> {
                }

                default -> System.out.println(RED + "[ Wrong input ]" + RESET);
            }
        }
    }

}

