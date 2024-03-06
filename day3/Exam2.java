package day3;

public class Exam2 {
    public static void paint(int paint1) {
        System.out.println(paint1);
    }

    public static void intro() {
        for (int i=0; i<9; i++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }
    public static void introduce(int introu) {
        for (int i=0; i<introu; i++) {
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }

    }
    public static void main(String[] args) {
        paint(4);
        System.out.println();
        introduce(5);
        System.out.println();
        intro();

    }
}
