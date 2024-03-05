package day2;

public class IncDecOperator {
    public static void main(String[] args) {
        // 증감연산자
        int num = 10;
        System.out.println(num + 5);
        System.out.println(num);

        // 변수의 값을 5증가시키고 싶다.
        /*
        num = 15 <= 증가 X 수정 O
         */
        num = num + 5;
        System.out.println(num);

        num += 5; // 위와 동일한 표현
        System.out.println(num);

        // 변수의 값을 3 감소시키고 싶다.
        num -= 3;
        System.out.println(num);

        // 증감연산자

        // num += 1; 증가값이 1인 경우에 한해서는 num++라고 쓸 수 있다.
        num++;
        System.out.println(num);

        num--;
        System.out.println(num);
    }
}
