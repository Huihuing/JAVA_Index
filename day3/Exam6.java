package day3;

public class Exam6 {
    public static int aint() {
        int num = 10;
        return num;
    }
    public static void main(String[] args) {
            int num = aint();

            System.out.println(num); // 출력 : 10
            String printValue = "";
            if (num == 10) {
                printValue ="안녕";
        }

        System.out.println("안녕");
            // 출력 : 안녕
    }
}