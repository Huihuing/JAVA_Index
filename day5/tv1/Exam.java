package day5.tv1;

public class Exam {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // TV 리모콘을 만든다.
        TV aTV; // abstract 할 경우 TV aTV = new TV(); 이게 아닌, TV aTV 이렇게 해야한다.

        // TV 변수에 샤오미Tv 객체를 연결한다.
        aTV = a샤오미Tv;
        aTV.켜기();
        // 출력 : 샤오미TV 켜집니다.
        aTV.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // TV 변수에 삼성Tv 객체를 연결한다.
        aTV = a삼성Tv;
        aTV.켜기();
        // 출력 : 삼성TV 켜집니다.
        aTV.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // TV 변수에 LGTv 객체를 연결한다.
        aTV = aLGTv;
        aTV.켜기();
        // 출력 : LGTV 켜집니다.
        aTV.끄기();
        // 출력 : LGTV 꺼집니다.


        LGTv aLGTv2 = (LGTv)aTV;
        aLGTv2.게임모드전환();
    }
}
 class 샤오미Tv extends TV { /* TV에게 물려받은 켜기 메서드가 내용이 없는
                              추상 메서드이기 때문에 오버라이딩 하지 않으면
                              실행 할 수 없다.*/
    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
     void 켜기() {
         System.out.println("샤오미Tv 켜집니다.");
     }
     void 끄기() {
         System.out.println("샤오미Tv 꺼집니다.");
     }
 }

class 삼성Tv extends TV {
    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
    void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }
    void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }
}

class LGTv extends TV { // default 접근제어자
    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
    void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }
    void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }
}


// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩 해서 사용해야 단.
abstract class TV {
    abstract void 켜기(); // 추상메서드
    abstract void 끄기() ;
}