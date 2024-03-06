package day3;

public class LocalVariable {
    public static int test(){
        int num = 10;
        return num;
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

        person p1 = new person();
        p1.age = 20;
        p1.name = "홍길동";
        p1.home = "서울";

        p1.introduce(); // 안녕하세요 저는 20세입니다 // 자기소개
        p1.addage(); // 나이 1증가 // 나이증가
        p1.introduce(); // 안녕하세요 저는 21세입니다 //바뀐 자기소개

        person p2 = new person();
        p2.name = "이순신";
        p2.age = 26;
        p2.home = "강원";

        p2.introduce();
        p2.addage();
        p2.introduce();


        person.averageAge = 31;

        p1.introduce();
        p2.introduce();





    }
}
