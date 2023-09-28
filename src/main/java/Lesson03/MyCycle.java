package lesson03;

public class MyCycle {
    public static void main(String[] args) {
        int s;
        s = 10;

        while(s <= 10 && s >= 0) {
            System.out.println(s);

            if ( s == 7 ) {
                System.out.println("continue");
                s = s - 1;   //s--;
                continue;
            }


            if ( s == 5) {
                break;
            }

            s = s - 1;   //s--;
        }
        System.out.println("==================");

//        System.out.println("===================");
//        s = 11;
//        do {
//            System.out.println(s);
//            s = s-1;   //s--;
//        } while ( s <= 10 && s >= 0 );


        for(int i = 1; i <= 10; i+=2 ) {
            System.out.println(i);
            if ( i == 5) {
                break;
            }
        }

        System.out.println("==========");
        for(int i = 10; i >= 1; i-- ) {
            System.out.println(i);
        }

    }
}
