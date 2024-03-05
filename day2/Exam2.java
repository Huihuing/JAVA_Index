package day2;

public class Exam2 {
    public static void main(String[] args) {
        int time = 74;
        int score = 0;

        for (time = 74; time <= 90; time += 5) {
            if (time >= 4) {
                score++;
            }
        }
        System.out.println(score + "점\n");

        // 출력 : 4

        int a = 12;
        int b = 5;

        if (a < b) {
            for (int i = a; i < b; i++) {
                System.out.print(i + " ");
            }
        }
        // 그렇지 않으면 b부터 시작하여 a까지 출력
        else {
            for (int i = b + 1; i < a; i++) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        if (a > b) {
            for (int i = a-1; i > b; i--) {
                System.out.print(i + " ");
            }
        }
        // 그렇지 않으면 b부터 시작하여 a까지 출력
        else {
            for (int i = b; i > a; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
