package day2;

public class Exam4 {
    public static void main(String[] args) {

         int[] tot = new int [2];
         String[] star = new String[3];
         star[tot.length] = "*";

         for (int a = 0; a<star.length; a++) {
             for (int b=0; b<tot.length; b++) {
                 System.out.println(star[tot.length]);
             }

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
