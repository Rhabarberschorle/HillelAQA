package Lesson04;

public class MyMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 5, 6, 6},
                {5, 8, 13, 8},
                {8, 11, 0, 0}};

        int[][] array1 = new int[3][4];

        System.out.println(array.length);

        for( int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }

        System.out.println();
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printArray(int[] arrayForMethod) {
        for( int elementArray : arrayForMethod ) {
            System.out.print(elementArray + " ");
        }
    }
}
