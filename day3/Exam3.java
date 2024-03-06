package day3;

public class Exam3 {

    public static double puls(int n1, int n2) {
        System.out.println(n1 + n2);
        return n1 + n2;
    }
    public static double minus(int n1, int n2) {
        System.out.println(n1 - n2);
        return n1 - n2;
    }
    public static double multi(int n1, int n2) {
        System.out.println(n1 * n2);
        return n1 * n2;
    }
    public static double divide(int n1, int n2) {
        System.out.println(n1 / n2);
        return n1 / n2;
    }
    public static double quare(int n1) {
        System.out.println(n1 * 5);
        return n1 * 5;
    }
    public static double isNegative(int no) {
        return no;
    }
    public static void main(String[] args) {
        puls(10, 20);
        minus(10, 20);
        divide(10, 3);
        multi(5, 4);
        quare(5);



    }
}
