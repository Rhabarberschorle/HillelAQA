package lesson03;

public class MyString {
    public static void main(String[] args) {
        String str = "Hello world!!!!!!";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        str = str + " some words";
        System.out.println(str);

        System.out.println(str.length());

        char c = str.charAt(2);
        System.out.println(c);
        System.out.println(str.lastIndexOf('!'));

        str.toCharArray();

        String str1;
        str1 = str.replace("o", "i");
        System.out.println(str1);

        String[] split = str1.split("\\ ");

//        System.out.println();
//
//        for(String s : split) {
//            System.out.println(s);
//        }
    }
}
