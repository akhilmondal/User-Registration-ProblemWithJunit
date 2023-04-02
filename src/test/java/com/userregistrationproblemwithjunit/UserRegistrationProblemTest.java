package com.userregistrationproblemwithjunit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationProblemTest {

    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
    /*
    By using try and catch block we are handling the thrown custom exceptions.
     */

    @Test
    public void checkValidFirstName() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validFirstName());
            System.out.println("First name Test Case Passed: ");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkValidLastName() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validLastName());
            System.out.println("Last name Test Case Passed: ");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void checkValidEmailId() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validEmailId());
            System.out.println("Email id Test Case Passed: ");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkValidPhoneNumber() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validPhoneNumber());
            System.out.println("Phone number Test Case Passed: ");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void checkValidPassword() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validPassword());
            System.out.println(" Test Case for Password Passed: ");
        }catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void checkValidAllEmailId() {
        try {
            Assert.assertEquals(true, userRegistrationProblem.validAllEmailId());
            System.out.println("Test Case for all email id Passed: ");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}

