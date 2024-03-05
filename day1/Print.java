package day1;

public class Print {
    public static void main(String[] args) {
        System.out.println(553);

        
        // \n은 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");
        
        // 문자 합치기
        System.out.println("안녕하세요, " + "임희재입니다 " + "반갑습니다.");

        // 숫자 출력
        System.out.println(12 * 23);
        System.out.println(995 + 23);

        // 문자열과 숫자 더하기
        System.out.println("올해는 " + 2024 + "년입니다. '100'");

        // 숫자와 문자는 정확히 구별해서 사용
        System.out.println("100" + "200"); // "" 붙은경우 문자열 (문자 only 출력)
        System.out.println(100 + 200); // 숫자열 (연산가능)

        // 문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // + 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123 + 465 = " + 123 + 465);
        System.out.println(123 + 465 + "123 + 465 = ");

        // 정답 숫자열에 ()를 붙혀 계산
        System.out.println("123 + 465 = " + (123 + 465) + "\n");

        // 숫자 곱하기 (*)
        System.out.println(100 * 200 + "\n");

        System.out.println("──────────────");
        for (int i = 2; i <20 ; i+=2) {
            System.out.println("┃" + i + " 입니다 ┃");
        }
        System.out.println("──────────────\n");

        // 구구단 2단을 출력. 단, 출력문은 한번만 사용.
        System.out.println("\n 2 X 1 = " + (2) + "\n 2 X 2 = " + (2 * 2) + "\n 2 X 3 = " + (2 * 3) + "\n 2 X 4 = " + (2 * 4) + "\n 2 X 5 = " + (2 * 5) + "\n 2 X 6 = " + (2 * 6) + "\n 2 X 7 = " + (2 * 7) + "\n 2 X 8 = " + (2 * 8) + "\n 2 X 9 = " + (2 * 9));


        System.out.println();

    }
}
