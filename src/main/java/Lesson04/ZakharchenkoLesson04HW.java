package Lesson04;

import java.util.Scanner;

public class ZakharchenkoLesson04HW {

    public static void main(String[] args) {
        //create a char array and check if it's a palindrome
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to set array length");
        char[] testArray = createArray(in.nextInt());
        addCharsToArray(in, testArray);
        printArray(testArray);
        System.out.println();
        isPalindrome(testArray);
        System.out.println("======================");

        //create a 2D int array and print sum of each row as well as all elements of the main diagonal
        System.out.println("Enter a number N to create a 2D array NxN");
        int n = in.nextInt();
        int[][] test2DArray = create2DArray(in, n);
        calculateSumOfEachRow(test2DArray);
        printElementsOfMainDiagonal(test2DArray);
        System.out.println("That's it. Thank you!");
    }

    public static char[] createArray(int n) {
        char[] charArray = new char[n];
        return charArray;
    }

    public static char[] addCharsToArray(Scanner in, char[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Enter a char to add to the array");
            testArray[i] = in.next().charAt(0);
        }
        return testArray;
    }

    public static void printArray(char[] array) {
        System.out.print("The array provided by user is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isPalindrome(char[] array) {
        for (int i = 0, j = array.length - 1; i < (array.length - 1) / 2; i++, j--) {
            if (array[i] == array[j]) {
                continue;
            } else {
                System.out.println("The array provided is not a palindrome");
                return false;
            }
        }
        System.out.println("The array provided is a palindrome");
        return true;
    }

    public static int[][] create2DArray(Scanner in, int n) {
        int[][] test2DArray = new int[n][n];
        for (int i = 0; i < test2DArray.length; i++) {
            for (int j = 0; j < test2DArray[i].length; j++) {
                System.out.printf("Add a number to the 2D array at the following index: %d, %d ", i, j);
                test2DArray[i][j] = in.nextInt();
            }
        }
        return test2DArray;
    }

    public static void calculateSumOfEachRow(int[][] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < testArray[i].length; j++) {
                sumOfRow += testArray[i][j];
            }
            System.out.printf("the sum of all elements of row %d is: %d \n", i, sumOfRow);
        }
    }
    public static void printElementsOfMainDiagonal(int[][] testArray) {
        int j = 0;
        System.out.print("The elements of the main diagonal are: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.printf("%d ", testArray[i][j]);
            j++;
        }
    }
}