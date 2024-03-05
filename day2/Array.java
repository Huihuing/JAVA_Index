package day2;

public class Array {
    public static void main(String[] args) {
        
        // 값이 많아지면 변수가 많이지고 변수가 많아지면 힘들다
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;

        // 모든 변수를 출력. 
        
        // 배열을 사용하면 변수를 하나로 묶을 수 있따.
        
        // 배열 선언

        int[] tot = {10, 20, 30, 40, 50, 60, 70};

        // 배열은 length라는 길이 정보를 가지고 있다.
        System.out.println(tot.length);

        // 배열은 순서(Index)에 따라 값을 꺼낼 수 있다.
        // 배열의 시작 인덱스는 0부터
        for (int q=0; q<tot.length; q++) {
            System.out.println(tot[q]);
        }
        
        // 배열을 미리 만들어놓고 저장하기
        
        // 100개 배열 만든다.
        // 자료형[개수]
        int[] hap = new int[15];
        
        // 3번째 인덱스에 100을 저장
        hap[2] = 100;

        // 문자열 30개 저장하는 배열 만들어보세요

        String[] mun = new String[30];
        mun[11] = "문장";

        for (int z=0; z<mun.length; z++) {
            System.out.println(mun[z]);
        }

        int[] bune = new int[3];

        bune[0] = 10;
        bune[1] = 20;
        bune[2] = 312;
    }
}
