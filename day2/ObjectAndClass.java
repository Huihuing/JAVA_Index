package day2;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 객체 -> 폴더
        
        // 사람 표현
        // 이름, 나이, 거주지

        // 사람 1명
        String erum = "홍길동";
        int nai = 20;
        String zip = "서울";

        System.out.println(zip + " 사는 " + nai + " 세 " + erum + "입니다.");

        String sunh = "이순신";
        int eun = 64;
        String gut = "부산";

        System.out.println(gut + " 사는 " + eun + " 세 " + sunh + "입니다.");


        // 이순신 정보 복사

        String name = sunh;
        int age = eun;
        String home = gut;

        // =================================================

        /* 홍길동이 자기 정보를 기입
         이력서 복사

         복사본에다가 홍길동의 정보를 기입

         이순신 자기 정보를 기입
         이력서 원본 복사

         복사본에다가 이순신 정보를 기입 */

        person p1 = new person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "일산";

        person p2 = new person();
        p2.name = "이순신";
        p2.age = 42;
        p2.home = "서초";

        // 객체, 오브젝트, 인스턴트 <-- 모두 비슷한 의미의 말

        // 홍길동 자기소개
        System.out.println(p1.home + " 거주하는 " + p1.age  + " 세 " + p1.name + "입니다.");

        // 이순신 자기소개
        // 객체 복사
        person p3 = p2;

        System.out.println(p3.name);

        car v1 = new car();
        v1.model = "소나타";
        v1.year = 3;
        v1.price = 1199;

    }
}

// 새로운 클래스 생성
class person {
    // 이름 나이 거주자
    String name;
    int age;
    String home;
}

class car {
    String model;
    int year;
    int price;
 }