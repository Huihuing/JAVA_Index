package day1;

public class Exam2 {
    public static void main(String[] args) {
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;
        int car = 170;

        if (tunnel1 <= car) {
            System.out.println("crash");
        }
        else if (tunnel2 <= car) {
            System.out.println("crash");
        }
        else if (tunnel3 <= car) {
            System.out.println("crash");
        }
        else {
            System.out.println("pass");
        }
    }
}
