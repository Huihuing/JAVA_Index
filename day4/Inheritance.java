package day4;

public class Inheritance {


    public static void main(String[] args) {
        // 프로그래밍 -> 중복과의 싸움
        // 데이터의 중복 -> 변수
        // 코드의 중복 -> 함수
        // 변수/함수의 중복 -> 클래스, 객체
        // 객체의 중속 -> 상속
        Animal a1 = new Animal();

        dog d1 = new dog();
        d1.bark();
        d1.breathe();

        cat c1 = new cat();
        c1.meow();
        c1.breathe();
    }
}


// class dog extends Animal 강아지가 동물에 속한다.
class dog extends Animal{
    public void bark() {
        System.out.println("멍멍");
    }

}
class cat extends Animal{
    public void meow() {
        System.out.println("야옹");
    }
}
class Animal {
    public void eat() {
        System.out.println("먹는다");
    }
    public void breathe() {
        System.out.println("숨을 쉰다!!");
    }
}