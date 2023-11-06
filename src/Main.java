import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if(num==1){
                Print.printPosition();
            }
            System.out.println();
            System.out.println("Round " + num);
            num++;
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.next();
            //判断输入的是否有效位置
            if(direction.equals("up") || direction.equals("down") || direction.equals("left")||direction.equals("right")){
                PlayerMove.move(direction);
            }else {
                System.out.println("Use only keywords up, down, left, right.");
                continue;
            }
            MonsterMove.move();
            Print.printPosition();
            Print.printHealth();


            boolean WINfalg = true; //判断三个怪物是否全部死亡，玩家是否获胜
            for (int i = 0; i < 3; i++) {
                if (Initialize.monsterHealth[i] > 0) {//判断怪物是否死亡
                    WINfalg = false;
                }
            }
            if (WINfalg == true) {
                System.out.println();
                System.out.println("YOU WIN");
                break;
            }

            if (Initialize.playerHealth <= 0) { //判断玩家是否失败
                System.out.println();
                System.out.println("YOU LOSE");
                break;
            }
        }
    }
}