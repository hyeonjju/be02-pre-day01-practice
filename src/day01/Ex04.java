package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        /*
        Integer Scissors=1;
        Integer Rock = 2;
        Integer Paper = 3;
         */

        Player player1 = new Player();
        Player player2 = new Player();

        player1.name = "player01";
        player2.name = "player02";


        while (player1.weapon == player2.weapon) {
            player1.weapon = (int) (Math.random() * 3) + 1;
            player2.weapon = (int) (Math.random() * 3) + 1;

            System.out.println("player1 : " + player1.weapon);
            System.out.println("player2 : " + player2.weapon);

        }
        // 1은 가위, 2는 바위, 3은 보
        if (player1.weapon == 1 && player2.weapon==3 || player1.weapon == 2 && player2.weapon==1 || player1.weapon == 3 && player2.weapon==2) {
            System.out.println("player1 승리");
        }
        else {
            System.out.println("player2 승리");
        }

    }
}



        
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복

        // 무승부면 반복
        //      player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
        //      객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장

        //      player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        //      객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장

        //      둘 중에 이긴 사람 이름 출력


