package day3;

public class Exam4 {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void printEven(int n) {
        for(int i = 1; i<= n; i++){
            if (isEven(i)) {
                System.out.println(i + " ");
            }
        }
        // isEven 메서드를 이용.
        System.out.println();

    }

    public static void main(String[] args) {
        printEven(10);
        printEven(20);
        printEven(5);

    }
}
