package day3;

public class Calculator {
    public static double plus(int num1, int num2) {
        // 원록적으로는 함수 하나에서 모든걸 만들 수 있음
        // 코드를 함수로 쪼개서 관리
        return num1 + num2;
    }

    public static double minus(int num1, int num2) {
        return num1 - num2;

    }

    public static double multiply(int num1, int num2) {
        return num1 * num2;

    }

    public static double divine(int num1, int num2) {
        return num1 / num2;
    }
        public static void main (String[]args) {


        }


}