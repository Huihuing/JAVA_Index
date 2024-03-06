package day3;

public class Exam1 {
     public static void hello() {
        System.out.println("안녕하세요!!");
        System.out.println("저는 임희재입니다.");
        System.out.println("자바를 통해");
        System.out.println("프로그램을 만들어보아요.");
     }
     public static  void hi() {
         System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
     }
    public static  void bye() {
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }
    public static  void repeat() {
        for (int i=0; i<13; i++) {
            hello();
        }
    }
    public static void main(String[] args) {
        hello();
        System.out.println();
        hi();
        System.out.println();
        bye();
        System.out.println();
        repeat();

    }
}
