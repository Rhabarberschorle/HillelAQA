package exceptions;

public class PasswordIsLessThanExpectedException extends Exception{
    public PasswordIsLessThanExpectedException(String message) {
        super(message);
    }
}
