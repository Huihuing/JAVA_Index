package day2;

public class Exam1 {
    public static void main(String[] args) {
        // 출력
        // 1
        // 2
        // 3
        // 4
        // 5
        // ...
        // 100

        // 1~100
        for (int i=0; i<=100; i++) {
            System.out.println(i);
        }

        // 1~100 only even
        for (int i=0; i<=100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 1~100 with even, odd
        for (int i=0; i<=100; i++) {
            if(i % 2 == 0) {
             System.out.println(i + ": even");
            }
            else if (i % 2 == 1) {
             System.out.println(i + ": odd");
            }
        }


    }
}