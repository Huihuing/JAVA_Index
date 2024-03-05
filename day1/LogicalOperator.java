package day1;

public class LogicalOperator {
    public static void main(String[] args) {

        /*
        논리 연산자
        &&(And): 둘 다 true일 때만 true, 그 외에는 false
        System.out.println(true && true);

        ||(Or): 둘 다 false일 때만 false, 그 외에는 true
        System.out.println(true || true);
         */

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println((false && false) + "\n");

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println((false || false) + "\n");

        System.out.println(true || false || true || false);
        System.out.println((true || true || false) + "\n");
        System.out.println(10 > 20 && 1 != 1 && 3 > 2); // false


    }
}
