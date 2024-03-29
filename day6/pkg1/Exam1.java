package day6.pkg1;

public class Exam1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.SetID(20);
        System.out.println("제 번호는 " + p1.getId() + " 입니다");
        // 구현시작
        // 구현끝
        p1.setAge(20);
        p1.printAge();

        // p1.age = -20;  나이가 음수인 것은 이상하다. 하지만 -20이 들어오는 것을 막을 수 없다.
        p1.setAge(-20);
        p1.printAge();

        // 출력 : 제 번호는 20 입니다.
    }
}
class Person {
    private int id;
    private int age;
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
// 힌트 : 여기에 메소드 2개 추가해야 합니다.

    // 카멜표기법 : 단어 여러개 조합해서 명명할 때 의미가 바뀌는 부분에서 대문자를 넣어주는 방식

    // alt + insert = > getter, setter
    public void SetID(int id) {

        // c, python
        // myName
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setAge(int age) {
        if(age < 0) {
            System.out.println("나이는 음수가 될 수 없습니다.");
            return;
        }
        this.age = age;
    }
    public void printAge() {
        System.out.println("제 나이는 " + this.age + " 입니다");
    }
}