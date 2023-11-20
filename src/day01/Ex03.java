package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        for (Integer i=0; i<5; i++){
            for (Integer j=0; j<5; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }


        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

        for (Integer i=0; i<5; i++){
            for (Integer j=0; j<i+1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }


        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
        */

        for (Integer i=0; i<5; i=i+1){
            for (Integer j=4-i; j>0; j=j-1){
                System.out.printf(" ");
            }
            for (Integer x=0; x<2*i+1; x=x+1){
                System.out.printf("*");
            }
            System.out.println();

        }



    }
}



