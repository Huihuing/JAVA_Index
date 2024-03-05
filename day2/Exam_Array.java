package day2;

public class Exam_Array {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for(int a=0; a<arr.length; a++) {
            System.out.println(arr[a]);
        }
        System.out.println("\n");
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arz = {1,2,3,4,5};

        for(int b=0; b<3; b++) {
            for (int c=0; c<arz.length; c++) {
                System.out.println(arz[c]);
            }
        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int[] azz = {1, 3, 5, 7, 9};

    }
}
