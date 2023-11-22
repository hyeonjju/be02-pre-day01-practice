package day02;

// 로또 번호 생성기
// 로또 번호는 1~45 중 중복이 없이 6개를 고르는 것
// 변수, 조건문, 반복문, 배열만 사용할 것, 랜덤 숫자 생성

import java.util.Enumeration;

public class Ex08 {
    public static void main(String[] args) {

// 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성
/*
        int[] num = new int[6];00

        for(int i=0; i<=5; i=i+1) {
            int random = (int) (Math.random() * 45) + 1;
            for(int j = 0; j < num.length; j++){
                if(random == num[j]){
                    random = (int) (Math.random() * 45) + 1;
                    j = -1;
                }
            }
            num[i] = random;
            System.out.println(num[i]);
        }

 */
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45)+1;

            for(int j = 0; j < i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
    }
}

// 최근 3회 로또 번호에서 1등이 나온 번호를 제외한 숫자로만 로또 번호 생성해보기.