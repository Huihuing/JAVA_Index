package day1;

public class Exam4 {
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        if(20 <= age && age <= 59) {
            System.out.println("할인대상이 아닙니다");
        }
        else {
            System.out.println("할인대상입니다");
        }

        // 구현 끝

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}




/*                if (age <= 19) {
        System.out.println("할인대상입니다.");
        }
                else if (age >= 60)  {
        System.out.println("할인대상입니다.");
        }
                else {
                System.out.println("할인 대상이 아닙니다.");
        }
    */
