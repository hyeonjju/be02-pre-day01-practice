package day02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 정수로 된 돈의 액수를 입력받아
        // 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전
        // 각 몇개로 변환되는지 출력
        //unit 배열을 활용

        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
        int[] price = new int[9];

        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 숫자를 입력받을 변수 만들기
        int num = 0;

        // 정수로 된 돈의 액수 입력받기
        num = sc.nextInt();
        System.out.println("액수 :" + num);

        for(int i=0; i<unit.length; i=i+1){
            price[i] = num / unit[i];
            num = num - price[i] * unit[i];
            System.out.println(price[i]);
        }



        }
    }
