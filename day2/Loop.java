package day2;

import java.sql.SQLOutput;

public class Loop {
    public static void main(String[] args) {
        // 반복문을 이용해 동일한 명령을 여러번 실행

        /*while(true) {
            System.out.println("실행");
            break;
        }*/

        // 원하는만큼만 반복
        int ant = 0; // 반복횟수 세는 용도
        while(ant < 5) { // 5번 반복
            System.out.println("action");
            ant++;

        }

        // for문

        for (int antt=0; antt < 5; antt++) {
            System.out.println("walk");
        }

       /* for (int y = 1; y <=10; y++) {
            System.out.println(y);
        }*/

        // 1부터 10까지 짝수 출력
       /* for (int y = 2; y <=10; y+=2) {
            System.out.println(y);
        }*/

        // 1부터 10까지 짝수 출력 v2
        for (int y = 1; y <=10; y++) {
            if (y % 2 == 0) {
               System.out.println(y); // 짝수일 때만 실행
            }

        }
        // 2의 배수 == 짝수
        // 2의 배수는 2로 나누여 떨어진다 -> 나머지가 0이다
        // 나머지 구하는 연산자 %를 사용

        for (int y = 4; y <=10; y+=4) {
            System.out.println(y);
        }



    }
}
