package com.userregistrationproblemwithjunit;

class CustomException extends Exception{
    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
    public CustomException() {
    }
    public CustomException(String invalidResult) {
        super(invalidResult);
    }
}