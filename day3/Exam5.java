package day3;

class peo {

    int ag;
    String na;

    public void intr() {
        System.out.println("저는 " + ag +  "살 " + na + " 입니다.");
    }
}
public class Exam5 {

            public static void main(String[] args) {
                peo a1 = new peo();
                a1.na = "홍길동";
                a1.ag = 22;

                a1.intr();
                // 출력 : 저는 22살 홍길동 입니다.

                peo a2 = new peo();
                a2.na = "홍길순";
                a2.ag = 25;

                a2.intr();
                // 출력 : 저는 25살 홍길순 입니다.

                a1.intr();
                // 출력 : 저는 22살 홍길동 입니다.
            }
        }