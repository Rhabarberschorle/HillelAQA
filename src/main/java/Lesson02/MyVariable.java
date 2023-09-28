package lesson02;

import java.util.Scanner;

public class MyVariable {
    public static void main(String[] args) {
        // Example 1
        double t, k, l;
        double a = 3.5;
        t = 2.5 * 2.5;
        k = a * a;
        l = sqr(4.5);
        System.out.println("Значення змінних: " + "t = " + t);
        System.out.println("Значення змінних: " + "t = " + t + " " + "k = " + k + " " + "l = " + l );

        // Example 2
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
//        int num = in.nextInt();

//        double d = in.nextDouble();

        String str = in.next();

//        System.out.println("Your number: " + num + "\n");
        System.out.println("Your number: " + str + "\n");


//        in.close();


        // Example 3
        double r = -5.5;
//        double d = revert(r);
        System.out.println(r);

        // Example 4
        int c = 1;
        int b = 4;
        int rez;
        rez = c / b;
        System.out.println(rez);
        rez = c % b;
        System.out.println(rez);
    }

    public static double sqr(double x) {
        double result;
        result = x * x;
        return result;
    }
}
