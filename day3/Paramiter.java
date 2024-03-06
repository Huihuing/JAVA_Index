package day3;

public class Paramiter {

    // 함수 정의 -> 변수
    public static void plus(int num1, int num2) { // 매개변수(함수에 들어가야 할건 수가 아닌 변수)
        System.out.println(num1 + num2);
    }
    public static void multiply(int num1, int num2) { // 변수 3개를 넣고 밑에 2개만 넣으면 역시 에러 발생
        System.out.println(num1 * num2);
    }
    public static void main(String[] args) {
        // 함수호출 -> 값(인자, argument)
        plus(10, 20); // 10 + 20 결과를 출력
        plus(30, 40); // 30 + 40 결과를 출력
        
        multiply(10, 20); // 10 * 20 결과를 출력
        multiply(5, 5); // 5 * 5 결과를 출력

        // 인수의 개수와 매개변수의 개수는 일치해야 합니다.
    }
}
