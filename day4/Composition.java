package day4;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍 = new 홍길동();
        홍길순 b홍 = new 홍길순();
        이순신주식회사 이주 = new 이순신주식회사();
        사람 a사람 = new 사람();
        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();

        a홍.자바();
        b홍.파이썬();

        a홍.파이썬();
        System.out.println();
        이주.파이썬();
        이주.자바();
        System.out.println();

        System.out.println(a사람.a왼팔.길이);
    }
}

class 홍길동 {

    홍길순 b홍 = new 홍길순();
    public void 자바() {
        System.out.println("자바 17버전 프로그래밍");
    }
    public void 파이썬() {
        b홍.파이썬();
    }

}

class 홍길순 {
    public void 파이썬() {
        System.out.println("파이썬 3.11 프로그래밍");
    }
}

class 이순신주식회사 {
    홍길동 a홍 = new 홍길동();

    public void 자바() {
        a홍.자바();
    }

    public void 파이썬() {
        a홍.파이썬();
    }
}

class 사람 {
    int 나이;
    팔 a왼팔;
}

class 팔 {
    int 길이 = 100;
}