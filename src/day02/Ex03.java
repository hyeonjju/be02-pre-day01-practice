package day02;

// 배열을 사용해 6개의 숫자를 입력받고 6개의 숫자를 거꾸로 출력하시오.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너

        // 숫자를 입력받을 크기가 6인 배열 만들기

        // 0부터 5까지 반복
        //      배열의 반복 횟수 번째에 숫자를 입력받아서 저장

        // 5부터 0까지 반복
        //      배열의 반복 횟수 번째에 숫자를 출력

        Scanner sc = new Scanner(System.in);
        Integer[] input = new Integer[6];

        for(int i=1; i<=5; i++){
            System.out.println("숫자 입력");
            input[i] = sc.nextInt();
        }

        for(Integer i=5; i>=0; i = i - 1) {
            System.out.println(input[i]);
        }

    }
}