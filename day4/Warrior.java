package day4;

public class Warrior {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        weapon weapon1 = new weapon();

/*        a전사.나이 = 20;
        a전사.weapon1 = new Bow();
        a전사.weapon1 = new Sword();*/

    }
}
class 전사 {
    String 이름;
    int 나이;
    weapon weapon1;
  /*  String 자기소개; X*/
    void 자기소개() {
        System.out.println();
    }
    void 공격 () {
        System.out.println();
    }
    public void attack(){
    }

}
class Sword extends 전사 {
    public void attack() {
        System.out.println("칼로 공격합니다.");
    }
}

class Bow extends 전사 {
    public void attack() {
        System.out.println("활로 공격합니다.");
    }
}

class weapon{
}
