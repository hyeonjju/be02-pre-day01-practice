package day02;

// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하고 배열에 든 숫자들과 총합을 출력

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // 숫자를 입력받을 크기가 10인 배열 만들기
        int[] input = new int[10];

        // 0부터 9까지 반복
        //      배열의 반복 횟수 번째에 1에서 10까지 범위의 정수를 랜덤한 숫자를 생성해서 저장

        for (int i=0; i<=9; i=i+1){
            input[i] = (int)(Math.random()*10)+1;
            System.out.println(input[i]);
        }

        // 모든 수를 저장할 변수를 생성
        // 0부터 9까지 반복
        //      모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장

        int total = 0;
        for(int i=0; i<=9; i=i+1){
            total = total +input[i];
        }

        // 모든 수를 저장한 변수를 출력
        System.out.println(total);
    }
}