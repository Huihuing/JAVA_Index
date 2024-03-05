package day2;

public class Exam2 {
    public static void main(String[] args) {
        int time = 74;
        int score = 0;

        for (time = 74; time <=90; time+=5) {
            if (time >=4) {
                score++;
            }
        }
        System.out.println(score + "점\n");

        // 출력 : 4
        int a = 12;
        int b = 5;


        for (int c = a-=b; c<=10; c++) {
            System.out.println(c);
        }
    }
}
