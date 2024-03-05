package day1;

public class OperatorExam {
    public static void main(String[] args) {

        if (true) {
            System.out.println("참\n");
        }

        if (false) {
            System.out.println("거짓\n");
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println("참\n");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓\n");
        }

        if (a > 10) {
            System.out.println("거짓\n");
        }

        if (a >= 10) {
            System.out.println("참\n");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참\n");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println("거짓\n");
        }

        if (c == false) {
            System.out.println("참\n");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참\n");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓\n");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참\n");
        }
    }
}
