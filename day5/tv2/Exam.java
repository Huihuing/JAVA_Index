package day5.tv2;
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
        aTV.이름세팅(); // 이름세팅이라는 함수의 사용이 꼭 필요하지만 실수로 빼먹을 경우 오류나 버그가 발생할 수 있다.
        aTV.켜기();
        // 출력 : 샤오미TV 켜집니다.
        aTV.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // TV 변수에 삼성Tv 객체를 연결한다.
        aTV = a삼성Tv;
        aTV.이름세팅();
        aTV.켜기();
        // 출력 : 삼성TV 켜집니다.
        aTV.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // TV 변수에 LGTv 객체를 연결한다.
        aTV = aLGTv;
        aTV.이름세팅();
        aTV.켜기();
        // 출력 : LGTV 켜집니다.
        aTV.끄기();
        // 출력 : LGTV 꺼집니다.
        aTV.켜기();

        LGTv aLGTv2 = (LGTv)aTV;
        aLGTv2.게임모드전환();


    }
}
 class 샤오미Tv extends TV { /* TV에게 물려받은 켜기 메서드가 내용이 없는
                              추상 메서드이기 때문에 오버라이딩 하지 않으면
                              실행 할 수 없다.*/
     //bString brand = "샤오미Tv"; // 변수 선언(만들기), TV에게 물려받은 brand변수와는 다르다. 샤오미Tv에만 있는 변수다.
     // 연산은 함수에서만 가능.
     // class에는 변수와 함수 선언만 가능하다.
     void 이름세팅() {
         brand = "ㅋㅁㅋㅁ";
     }
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
    //String brand = "삼성Tv";
    void 이름세팅() {
        brand = "삼성Tv";
    }
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

class LGTv extends TV {
    //String brand = "LGTv";
    void 이름세팅() {
        brand = "LGTv";
    }
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
class TV {
    String brand;
    void 켜기() {
        System.out.println(brand + "켜집니다.");
    } // 추상메서드
    void 끄기() {

    }
    void 이름세팅() {

    }
}