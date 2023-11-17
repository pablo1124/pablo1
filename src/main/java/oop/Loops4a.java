package oop;

public class Loops4a {

    int liczba = 2;

    static int[] tablicaliczb;



    public static void main(String[] args) {
        tablicaliczb = new int[3];


        tablicaliczb[0] = 10;
        tablicaliczb[1] = 20;
        tablicaliczb[2] = 30;

 //     for (int number : tablicaliczb) {
 //           System.out.println("Liczba : " + number);
 //       }




//        for (int i = 0; i < 3; i++) {
//            System.out.println("Liczba : " + tablicaliczb[i]);
//            tablicaliczb[i]++;
 //       }

 //       for (int i = 0; i < 10; i++) {
 //           System.out.println("counter: " + i);
//        }

        for (int i = 0; i <=10; i++) {
            if (i % 2 == 0) {
                System.out.println("liczba: " + i + " jest parzysta");
            }
            else {
                System.out.println("Liczba: " + i + " jest nieparzysta");
            }
        }

        int i = 1;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) System.out.println("jestem w połowie");
        }
    }
}


