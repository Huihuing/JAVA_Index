package day5;

public class Exam_con {
    public static void main(String[] args) {
        person p1 = new person(27, "홍길동");
        person p2 = new person(25, "홍길순");
        System.out.println();
        p1.introduce();
        p2.introduce();
        System.out.println();

        car c1 = new car("소나타", "하얀색", 100);
        car c2 = new car("모닝", "검정색", 70);
        System.out.println();
        c1.drive();
        c2.drive();
        System.out.println();

        cat cat1 = new cat("아리", 4, "러시안블루");
        cat cat2 = new cat("망고", 6, "샴");
        System.out.println();
        cat1.meow();
        cat2.meow();
        System.out.println();

        warrior w1 = new warrior("이순신", 20, 20);
        warrior w2 = new warrior("강감찬", 15, 15);
        System.out.println();
        w1.status();
        w2.status();
        System.out.println();
        w1.attack();
        w2.attack();
        System.out.println();
        w1.defense();
        w2.defense();
        System.out.println();

/*    사람2 a사람 = new 사람2();
    a사람.나이 = 10;
    a사람.a왼팔 = new 팔2();
    System.out.println(a사람.길이 + "cm");
    // 출력 : 100cm*/
    }
}
    class person {
        int age;
        String name;

        public person(int age, String name) {
            this.age = age;
            this.name = name;
            System.out.println("사람이 태어납니다");
        }

        public void introduce() {
            System.out.println("안녕하세요 " + age + "세 " + name + "입니다.");
        }

    }

    class car {
        int speed;
        String model;
        String color;

        public car(String model, String color, int speed) {
            this.speed = speed;
            this.model = model;
            this.color = color;
            System.out.println("자동차가 만들어집니다.");
        }

        public void drive() {
            System.out.println(color + model + " 이/가 " + speed + " 로 달립니다.");
        }

    }

    class cat {
        int age;
        String name;
        String kind;

        public cat(String name, int age, String kind) {
            this.age = age;
            this.name = name;
            this.kind = kind;
            System.out.println("고양이가 태어납니다.");
        }

        public void meow() {
            System.out.println(age + "세 " + kind + " 고양이 " + name + "가 야용하고 웁니다.");
        }
    }

    class warrior {
        String name;
        int attack;
        int defense;

        public warrior(String name, int attack, int defense) {
            System.out.println("전사가 태어납니다");
            this.name = name;
            this.attack = attack;
            this.defense = defense;
        }

        public void status() {
            System.out.println("이름 : " + name + ", 공격력 : " + attack + ", 방어력 : " + defense);
        }

        public void attack() {
            System.out.printf("%s이 %d의 데미지를 입힙니다.\n", name, attack);
        }

        public void defense() {
            System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
        }
    }
/*class 사람2 {
    int 나이;
    팔2 a왼팔;
}*/
/*
class 팔2 {
    int 길이;

    public 팔2() {
        this.길이 = 100;
    }
}*/
