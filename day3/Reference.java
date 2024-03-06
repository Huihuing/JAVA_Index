package day3;

public class Reference {
    public static void main(String[] args) {
        person p1 = new person(); // 객체가 힙 메모리에 생성
        person p2 = new person();

        System.out.println(p1);
        System.out.println(p2);

        // 사람 복사

        p1.name = "강신주";
        p1.age = 28;
        p1.home = "서울 관악구";

        System.out.println(p1);

        person p3 = p1; // 강신주 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동은 2명이 된걸까? X
        System.out.println(p1.name);

        p3.name = "손흥민";

        System.out.println(p3.name);
        System.out.println(p1.name);

        // 손흥민을 2명 만들어주세요. (코드 중복 X)

        person p4 = new person();
        p4.name = "손흥민";
        p4.age = 31;
        p4.home = "런던";

        person p5 = new person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        p5.name = "김민재";

        System.out.println(p4.name + p5.name);

        // 객체의 복사
        // 참조값의 복사 -> 얕은 복사
        // 객체값의 복사 -> 깊은 복사




    }
}