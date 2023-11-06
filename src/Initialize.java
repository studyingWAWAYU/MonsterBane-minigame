//初始化地图、角色位置、角色生命值
public class Initialize {
    public static String[][] map = InitializeMap();
    public static int[] playerPosition = {2,2};
    public static int[][] monsterPosition = {{0,0},{2,0},{0,2}};

    public static int playerHealth = 100;
    public static int[] monsterHealth = {100,100,100};
    static String[][] InitializeMap(){
        map = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == 0 & col == 0)
                    map[row][col] = "%";
                else if (row == 0 & col == 2)
                    map[row][col] = "%";
                else if (row == 2 & col == 0)
                    map[row][col] = "%";
                else if (row == 2 & col == 2)
                    map[row][col] = "*";
                else
                    map[row][col] = ".";
            }
        }
        return map;
    }
}