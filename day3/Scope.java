package day3;

public class Scope {


    // 함수5
    // 함수6
    // 함수7

    public static void main(String[] args) {
        // 변수가 많아지면 묶어서 관리 -> 배열, 객체
        // 함수가 많아지면 묶어서 관리 -> 클래스
        
        // 함수는 같은 클래스 내에 있는 함수끼리만 호출 및 사용 가능
        
        // 요청을 해야 함.
        double result = Calculator.plus(1, 2);
        System.out.println(result);
        
        // Scope
        // 변수의 유효범위
        
        // 지역에서 만들어져서 지역에서만 사용되는 변수 -> 지역변수
        // 함수 내의 변수는 모두 지역변수
        int a = 10; // a 변수의 유효범위는 main 함수 내부

        {
            int b = 20; // b 변수의 유효범위는 블록 내부
            System.out.println(a);
            System.out.println(b);
        }

        // 같은 함수 내에서는 동일한 이름으로 변수가 "동시"에 2개 이상 존재할 수 없다.
        // 큰 지역에서 먼저 선언된 변수는 후에 작은지역에서 동일한 변수를 선언 할 수 없다.
        int b = 10;
        System.out.println(b);


    }
}
