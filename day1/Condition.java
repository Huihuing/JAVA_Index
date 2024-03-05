package day1;

public class Condition {
    public static void main(String[] args) {
        // 조건문

        // if 소, 중괄호

        int a = 100;
        if(a > 50) {
            System.out.println("HI");
        }
        /*  예제
            소지금에 따른 야식 메뉴

            20000만원 이상 : 치킨
            20000만원 미만 : 떡볶이
         */

        int money = 30000;

        if (money >= 20000) {

            System.out.println("치킨");
        }
        if (money < 20000) {
            System.out.println("떡볶이");
        }
        System.out.println("\n");



        // 1. 맑음, 2. 흐름, 3.비, 4.눈
        int weather = 4;

        /*
        맑음: 날씨가 맑습니다. 나들이 가세요.
        흐림: 날씨가 흐립니다. 집에 계세요.
        비: 날씨가 비옵니다. 우산을 챙기세요.
        눈: 날씨가 눈옵니다. 눈사람을 만드세요.
         */

        if (weather == 4) {
            System.out.println("날씨가 눈옵니다 눈사람을 만드세요");
        }
        else if (weather == 1) {
            System.out.println("날씨가 맑습니다. 나들이 가세요.");
        }
        else if (weather == 2) {
            System.out.println("날씨가 흐립니다. 집에 계세요.");
        }
        else if (weather == 3) {
            System.out.println("날씨가 비옵니다. 우산을 챙기세요.");
        }



    }
}