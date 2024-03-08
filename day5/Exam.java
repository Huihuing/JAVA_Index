package day5;

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
    }
}
 class 샤오미Tv extends TV {
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

class LGTv extends TV {
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

class TV {
    void 켜기() {
    }
    void 끄기() {
    }
}