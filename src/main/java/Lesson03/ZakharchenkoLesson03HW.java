package Lesson03;

import java.util.ArrayList;
import java.util.Scanner;

import static org.testng.Assert.assertFalse;

public class ZakharchenkoLesson03HW {
    public static void main(String[] args) {
        //print my school years
        printClasses(1996, 2006);

        //operations with Strings
        //read a String from input and return it reversed word by word
        Scanner in = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String words = in.nextLine();
        System.out.println(reverseString(words));
        System.out.println("============================================");

        //read a String, searchTerm, and replaceTerm from input and replace the searchTerm
        System.out.println("Input a sentence: ");
        String sentence = in.nextLine();
        System.out.println("Input a search term: ");
        String searchTerm = in.nextLine();
        System.out.println("Input a replace term: ");
        String replaceTerm = in.nextLine();
        System.out.println(replaceWords(sentence, searchTerm, replaceTerm));
        System.out.println("============================================");

        //read a, b, and c from input and resolve a * x^2 + b * x + = 0
        System.out.println("Now let's do some simple maths");
        System.out.println("Input a: ");
        int a = in.nextInt();
        assertFalse(isNullOrZero(a), "a can't be zero or null \n");
        System.out.println("Input b: ");
        int b = in.nextInt();
        System.out.println("Input c: ");
        int c = in.nextInt();
        resolveEquation(a, b, c);
        System.out.println("That's it. Thank you!");
        System.out.println("============================================");
    }

    public static void printClasses(int firstYear, int graduateYear) {
        int myClass = 1;
        for (int i = firstYear; i < graduateYear; i++) {
            if (i == 1999) {
                myClass = 5;
            }
            System.out.printf("%d\u002F%d class %d \n", i, i + 1, myClass);
            myClass++;
        }
    }

    public static ArrayList<String> reverseString(String words) {
        String[] newWords = words.split(" ");
        int i;
        String a;
        ArrayList<String> reversedWords = new ArrayList<>();
        for (i = newWords.length - 1; i >= 0; i--) {
            reversedWords.add(newWords[i]);
        }
        return reversedWords;
    }

    public static String replaceWords(String sentence, String searchTerm, String replaceTerm) {
        String newSentence;
        newSentence = sentence.replace(searchTerm, replaceTerm);
        return newSentence;
    }

    public static void resolveEquation(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        int x1;
        int x2;
        if (D > 0) {
            x1 = (int) (-b + Math.sqrt(D) / 2 * a);
            x2 = (int) (-b - Math.sqrt(D) / 2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            x1 = (int) (-b / 2 * a);
            System.out.println("x = " + x1);
        } else {
            System.out.printf("The is no solution.");
        }
    }

    public static boolean isNullOrZero(Integer number) {
        return number == null || number == 0;
    }
}
