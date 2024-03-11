package day6;

import java.util.Scanner;

public class StringInput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        
        // 문자열 -> 숫자 변환
        System.out.println("100" + 100);
        int convertedInt = Integer.parseInt("100"); // 숫자로만 이루어진 문자열이 아니면 에러가 난다.
        System.out.println(convertedInt + 100); //200



/*        System.out.print("나이을 입력해주세요 : ");
        String age = scan.nextLine();

        scan.nextLine(); // 버퍼 지우기

        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();



        System.out.println("\n" +"안녕하세요 " + age + "세 " + name + "입니다");*/
        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.
        
        
    }
}
