package com.company.Controller;

import com.company.Modules.Library;
import com.company.Modules.Person;

import java.util.List;

public class RegisterValidator {



    Library library;

    public RegisterValidator(Library library) {
        this.library = library;
    }


    public boolean usernameValidation(String username){
        boolean usernameValidated = true;

        List<Person> persons = library.getAllPersonsToList();

        for (Person user : persons) {
            if(username.equals(user.getUsername())){

                usernameValidated = false;
            }
        }
        if(usernameValidated == true){
            String validateUsernameForm = "[a-zA-Z0-9]{5,20}";
            if (!username.matches(validateUsernameForm)){
                usernameValidated = false;
            }

        }
        return usernameValidated;
    }
     public boolean passwordValidation(String password){
        boolean passwordValidated = true;
         System.out.println("in pass");

        String validatePassForm = "";
        if (!password.matches(validatePassForm)){
            passwordValidated = false;
        }
        return passwordValidated;
    }

}
