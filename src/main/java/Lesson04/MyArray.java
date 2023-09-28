package Lesson04;

public class MyArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, -4, 5, 6};

        int[] array1 = new int[6];



        for(int elementArray : array) {
            System.out.print(elementArray + " ");
        }

        array[2] = 3;
        System.out.println();
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//        System.out.println(array[10]);

        System.out.println();
        for(int elementArray1 : array1) {
            System.out.print(elementArray1 + " ");
        }
        System.out.println();

        boolean[] array2 = new boolean[4];
        for(boolean elementArray2 : array2) {
            System.out.print(elementArray2 + " ");
        }
        System.out.println();

        String[] array3 = {"Vasyl", "Ivan", "Anton"};
        for(String elementArray3 : array3) {
            System.out.print(elementArray3 + " ");
        }
        System.out.println();

//        System.out.println(array);
//        System.out.println(array1);
//        System.out.println(array2);
//        System.out.println(array3);


        System.out.println();
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println();
        for(int i = 0, j = array.length-1; i < array.length; i++, j--) {
            System.out.println(array[i] + "   " + array[j]);
        }
        System.out.println();
    }



}
