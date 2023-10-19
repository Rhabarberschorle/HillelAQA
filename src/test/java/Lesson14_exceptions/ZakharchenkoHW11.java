package Lesson14_exceptions;

import exceptions.InvalidUserDataException;
import exceptions.PasswordIsLessThanExpectedException;
import exceptions.UserdataIsEmptyException;

import java.util.Scanner;

public class ZakharchenkoHW11 {

    String username;
    String password;

    public ZakharchenkoHW11() {
        username = "XiuXiu";
        password = "randompw";
    }

    public void checkUsersCredentials(String username, String password) throws UserdataIsEmptyException,
            PasswordIsLessThanExpectedException, InvalidUserDataException {
        if (username.isEmpty() || password.isEmpty()) {
            throw new UserdataIsEmptyException("Provided user data is either empty or null");
        } else if (password.length() < 7) {
            throw new PasswordIsLessThanExpectedException("The provided user password is less than 6 chars");
        } else if ((!username.equals(this.username)) || (!password.equals(this.password))) {
            throw new InvalidUserDataException("The username or password provided are not correct");
        } else if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("The login was successful.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ZakharchenkoHW11 basicUserDataChecker = new ZakharchenkoHW11();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String currentUsername = in.nextLine();
        System.out.print("Please enter your password: ");
        String currentPassword = in.nextLine();
        try {
            basicUserDataChecker.checkUsersCredentials(currentUsername, currentPassword);
        } catch (UserdataIsEmptyException userdataIsEmptyException) {
            userdataIsEmptyException.printStackTrace();
        } catch (PasswordIsLessThanExpectedException passwordIsLessThanExpectedException) {
            passwordIsLessThanExpectedException.printStackTrace();
        } catch (InvalidUserDataException invalidUserDataException) {
            invalidUserDataException.printStackTrace();
        } finally {
            System.out.println("This is the end of the program. Thank you for using our services");
        }
    }
}
