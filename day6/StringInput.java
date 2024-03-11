package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        //문자열 입력

        Scanner scan = new Scanner(System.in);

        // 문자열 입력1 -> 단어 입력
        // 문자열 입력2 -> 문장 입력

      /*  String str1 = scan.next(); // 단어 입력. 공백은 입력이 끝나는 시점으로 인식 예) hello my name is asdf = hello
        System.out.println(str1);*/

/*        String str2 = scan.nextLine(); // 문장 입력. 엔터를 입력할 때까지 입력을 받음 예) hello my name is asdf = hello my name is asdf
        System.out.println(str2);*/

        System.out.print("나이을 입력해주세요 : ");
/*        String age = scan.nextLine();
        int converterInt = Integer.parseInt(age);*/
        int age = Integer.parseInt(scan.nextLine());


        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();



        System.out.println("\n" +"안녕하세요 " + age + "세 " + name + "입니다");
        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.

    }
}
