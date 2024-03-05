package day2;

public class Exam3 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
        for (int r=2; r<=9; r++) {
                for(int f=1; f<=9; f++) {
                    if (f % 2 == 0) {
                    System.out.println(r +" X " + f + " = " + (r * f));
                }
            }
        }
        System.out.println("\n");
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (n=n; n<=m; n++) {
            if (n % 2 == 1) {
                for (int g = 1; g <= limit; g++) {
                    if (g % 2 == 0) {
                        System.out.println(n + " X " + g + " = " + (n * g));
                    }
                }
            }
        }
    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190
    */






    }
}
