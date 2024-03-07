package day4;

public class Exam1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        System.out.println((double)num1 / num2); // 출력 : 2.5

        
        무기 k무기 = new 칼();
        k무기.공격();

        k무기 = new 활();
        k무기.공격();
    }
}
class 칼 extends 무기{
    public void 공격() {
        System.out.println("칼로 공격합니다");
    }
}

class 활 extends 무기{
    public void 공격() {
        System.out.println("활로 공격합니다");
    }
}

class 무기 {
    public void 공격() {
        System.out.println("공격합니다.");
    }
}
