package day6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 출력 : 프로그램이 어떤 값을 콘솔창(표준 출력) 에 출력
        // 입력 : 프로그램에 어떤 값을 콘솔창(표준 출력 = 키보드) 에 입력

        System.out.println();

        Scanner scan = new Scanner(System.in); // 표준입력

       /* int num = scan.nextInt(); // 정수 입력

        System.out.println("aaa");
        System.out.printf("당신이 입력한 값은 : %d", num);

        String line = scan.next();
        System.out.printf("당신이 입력한 문자열은 : %s\n", line);
*/
        // 구구단의 단을 입력받아 해당 단을 출력해주는 프로그램을 만들어주세요

        // 예시)
        // 단을 입력해주세요 : 3
        // 3단 출력

        // 단을 입력해주세요 : 3
        // 3단 출력

        int dan = scan.nextInt();
        System.out.printf("단을 입력해주세요 : %d\n", dan);

        for (int n = dan; dan<dan*10; dan++) {
            System.out.println(dan);

        }

    }
}
