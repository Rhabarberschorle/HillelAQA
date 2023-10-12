package Lesson13_Locators;

import java.util.Arrays;

public class ZakharchenkoHW10_p2 {

    public static String[] revertString(String[] stringArray) {
        int newIndex = stringArray.length - 1;
        String replacement;
        for (int i = 0; i < stringArray.length / 2; i++) {
            //take the first element of array
            replacement = stringArray[i];
            //replace first element with last element
            stringArray[i] = stringArray[newIndex];
            //replace last element with first element
            stringArray[newIndex] = replacement;
            newIndex--;
        }
        return stringArray;
    }

    public static void main(String[] args) {
        String[] testArray = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(revertString(testArray)));
        ;
    }
}
