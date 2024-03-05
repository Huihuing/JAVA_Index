package day2;

public class Exam4 {
    public static void main(String[] args) {
        // 배열 x
         String[] star = {"*", "**", "***", "****", "*****", "******", "*******"};

         for (int a = 0; a<3; a++) {
             System.out.print(star[a]);
         }

        System.out.println("\n");
        for (int b = 0; b<5; b++) {
            System.out.println(star[b]);
        }

        System.out.println("\n");
        for (int c = 0; c<7; c++) {
            System.out.println(star[c]);
        }

        int height1 = 3;
        System.out.println("높이 : [" + height1 + "]\n");
        for (int i = 0; i < height1; i++) {
            for (int j = 0; j < height1 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
    }
}
