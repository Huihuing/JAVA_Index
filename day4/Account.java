package day4;

public class Account {
    int remainder = 0;
    // 해당 변수를 밖으로 빼야 누적되는 수를 확인 가능
    // 밑 deposit 에 넣으면 deopsitmoney가 실행될 때마다 초기화됨.
    // 두 함수가 같이 사용해야 할 경우 더더욱 지역변수 밖으로 빼야한다.

    public void deposit(int depositmoney) {

        remainder += depositmoney;
        System.out.println(depositmoney + "원을 예금했습니다.");
        System.out.println("잔액: " + remainder + "원입니다.");
    }

    // int money = a1.withdraw, int remainder = a1.getRemainder();
    // 와 같이 int에게 값을 받고 있을 경우 public int 와 return값을 주어야한다.
    public int withdraw(int withdrawmoney) {
        remainder -= withdrawmoney;
        System.out.println(remainder);

        return withdrawmoney;
    }

    public int getRemainder() {
        return remainder;
    }


}