package com.userregistrationproblemwithjunit;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidEmailIdWithParameterisedTest {

    String emailId;
    boolean result;
    public ValidEmailIdWithParameterisedTest(String emailId, boolean result) {
        super();
        this.emailId = emailId;
        this.result = result;
    }
    @Test
    public void addTest() {
        UserRegistrationProblem obj = new UserRegistrationProblem();
        assertEquals(result, obj.validAllEmailIdWithParameter(emailId));
    }
    /*
    Here we are passing all the emails one by one to test our code.
     */
    @Parameterized.Parameters
    public static Collection squareData() {
        return Arrays.asList(new Object[][] {
                {"abc-100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true}
        });
    }
}
