package day02;

//양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 점수의 평균을 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 숫자를 입력받을 크기가 10인 배열 만들기
        Integer[] input = new Integer[10];

        // 0부터 9까지 반복
        //      배열의 반복 횟수 번째에 숫자를 입력받아서 저장

        for(int i=0; i<=9; i++){
            input[i] = sc.nextInt();
        }

        // 모든 수를 저장할 수 변수를 생성
        // 0부터 9까지 반복
        //      모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        int total =0;

        for(int i=0; i<=9; i++){
            total = total +input[i];
        }


        // 모든 수를 저장한 변수에 배열의 크기만큼 나눠서 출력
        System.out.println(total / input.length);



    }
}