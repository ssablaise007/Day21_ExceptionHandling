package com.bridgelabz;

import Com.bridgelabz.CustomException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //private UserRegistration UserRegistration;

    void firstNameValidator() throws CustomException {
        try {
            String firstName = "SILAR";
            Assertions.assertEquals(true,  UserRegistration.firstNameValidator(firstName));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void lastNameValidator() throws CustomException {
        try {
            String lastName = "SHOYAB";
            Assertions.assertEquals(true,  UserRegistration.lastNameValidator(lastName));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void passwordValidator() throws CustomException {
        try {
            String password = "Silar@4172";
            Assertions.assertEquals(true,  UserRegistration.paswwordValidator(password));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void contactNumberValidator() throws CustomException {
        try {
            String contactNumber = "9963694234";
            Assertions.assertEquals(true,  UserRegistration.lastNameValidator(contactNumber));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void EmailValidator() throws CustomException {
        try {
            String email = "abc-812929@yahoo.com";
            Assertions.assertEquals(true,  UserRegistration.emailValidator(email));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }

    @ParameterizedTest
    void emailValidation() throws CustomException {
        try {
            String [] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                    "abc-100@abc.net", null, "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com"};
            for(String i: email)
                Assertions.assertTrue(UserRegistration.emailValidator(i));
        }catch(CustomException e) {System.out.println(e.getMessage());}
    }
}
