package Lesson02;

import java.util.Scanner;

public class Lesson02HW {
    String firstName;
    String lastName;
    int experienceManual;
    int experienceAutomation;
    public static int userLMSNumber = 8;

    Lesson02HW(String firstName, String lastName, int experienceManual, int experienceAutomation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceManual = experienceManual;
        this.experienceAutomation = experienceAutomation;
    }

    public String toString() {
        return "My name is: " + this.firstName + "\nMy surname is: " + this.lastName +
                "\nExperience in manual testing is: " + this.experienceManual + " years" +
                "\nExperience in automated testing is: " + this.experienceAutomation + " years";
    }

    public int getDivisionResult(int myNumber) {
        return myNumber / userLMSNumber;
    }

    public int getDivisionRemainder(int myNumber) {
        return myNumber % userLMSNumber;
    }

    public int makeNumberOpposite(int newNumber) {
        return newNumber * -1;
    }

    public static void main(String[] args) {
        Lesson02HW student = new Lesson02HW("Sergii", "Zakharchenko", 4, 1);
        System.out.println(student);

        System.out.println();
        System.out.println("Now let's do some simple maths");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int myNumber = in.nextInt();
        System.out.println("The division result is: " + student.getDivisionResult(myNumber));
        System.out.println("The division remainder is: " + student.getDivisionRemainder(myNumber));
        System.out.println();
        System.out.println("And one last thing");
        System.out.print("Input a number: ");
        int newNumber = in.nextInt();
        System.out.println("The opposite number is: " + student.makeNumberOpposite(newNumber));
        System.out.println("That's it! Thank you!");
    }
}