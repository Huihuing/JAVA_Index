package day1;

public class Variable {

    public static void main(String[] args) {

        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수타입 변수명
        // 정수형 변수

        // 숫자형 변수

        int number;

        // 변수에 값 저장
        number = 100; // 변수가 왼쪽, 저장 대상이 오른쪽

        // 40 = number;
        // 순서 거꾸로 못함

        // 숫자형 변수 선언
        //int =  변수

        int number2;
        // number2 = "임희재"; // 숫자 변수에 문자를 저장하려고 하면 안됨

        // String => 자바에서 문자열을 의미

        String name;
        name =  "임희재";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용

        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("임희재");
        System.out.println("임희재");

        // 자기소개 10번 출력
        // 안녕하세요. 나이 ~~입니다.

        String introduce;
        introduce = "안녕하세요. ";

        int old;
        old = 27;

        String intro_name;
        intro_name = "세 임희재입니다.";


        for (int i = 0; i < 10; i++) {
            System.out.println(introduce + old + intro_name);
        }

        // 변수 주의사항
        // 변수명은 중복되지 않도록 지어야 한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수는 재활용 가능하다.

    }
}
