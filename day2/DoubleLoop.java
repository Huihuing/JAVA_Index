package day2;

public class DoubleLoop {
    public static void main(String[] args) {


        /*for(int i=0; i<3; i++) {
            for(int a=1; a<=5; a++) {
                System.out.println(a);
            }
            System.out.println("실행");
            System.out.println("됩니다.");
        }*/

        // 구구단 2~9단 출력
        /*int dan = 2;

        for (int q=2; q<=9; q++) {
            System.out.println("\n" + q + "단");
            for (int i=1; i <=9; i++) {
                System.out.println( dan +" X " + i + " = " + (dan * i));
            }
            dan++;
        }*/

        for (int dan2=2; dan2<9; dan2++) {
            System.out.println("\n" + dan2 + "단");
            for (int i=1; i <=9; i++) {
                System.out.println( dan2 +" X " + i + " = " + (dan2 * i));
            }
        }

        // 2단 8번 만들어보겠다
    }
}
