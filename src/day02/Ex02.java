package day02;

public class Ex02 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수 만들고 초기화
        // i가 1부터 100까지 1씩 증가하면서 반복
        //      만약에 i가 홀수면
        //      총합에 i를 더해서 저장

        Integer sum = 0;

        for (int i = 1; i <= 100; i = i + 1) {
            if(i%2 == 1){
                sum = sum +i;
                System.out.println(sum);
            }
        }

    }
}