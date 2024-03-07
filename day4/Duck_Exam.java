package day4;

public class Duck_Exam {
    public static void main(String[] args) {
        청둥오리 t1 = new 청둥오리();
        흰오리 w1 = new 흰오리();
        고무오리 r1 = new 고무오리();
        고무오리2 r2 = new 고무오리2();
        아수라오리 a1 = new 아수라오리();

        t1.fly();
        t1.sea();
        System.out.println();
        w1.fly();
        w1.sea();
        System.out.println();
        r1.fly();
        r1.sea();
        System.out.println();
        r2.fly();
        r2.sea();
        System.out.println();
        a1.fly();
        a1.sea();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}

class 청둥오리 extends duck {
}
class 흰오리 extends duck {
}
class 고무오리 extends duck {
    // 메서드 오버라이드(재정의)
    // super <= 똑같은 함수이지만 먼저 상속받은 함수를 실행
    void fly () {
        System.out.println("날수 없어요 ㅠㅠ");
    }
    void sea () {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class 고무오리2 extends 고무오리 {

}

// 상속으로 모든 중복을 해결할 수 없다.
// 상속은 다른 클래스에 영향을 미친다. => 캡슐화 깬다.
class 아수라오리 extends duck {
    void sea() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class duck {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다~!!");
    }
    void sea() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }

}