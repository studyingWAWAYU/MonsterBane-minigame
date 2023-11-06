//打印角色位置和角色生命状态
public class Print {
    public static void printPosition(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(Initialize.map[row][col]);
            }
            System.out.println();
        }
    }

    public static void printHealth(){
        System.out.println("Health Player:"+Initialize.playerHealth);
        System.out.println("Health Monster1:"+Initialize.monsterHealth[0]);
        System.out.println("Health Monster2:"+Initialize.monsterHealth[1]);
        System.out.println("Health Monster3:"+Initialize.monsterHealth[2]);
    }
}
