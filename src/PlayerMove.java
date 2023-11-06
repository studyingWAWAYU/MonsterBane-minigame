import java.util.Scanner;
public class PlayerMove {
    static void move(String direction) {
        if (direction.equals("up")) {
            if (Initialize.playerPosition[0] != 0) { //判断移动是否超出边界
                for (int i = 0; i < 3; i++) {
                    //判断是否攻击怪物
                    if (Initialize.playerPosition[0] - 1 == Initialize.monsterPosition[i][0] && Initialize.playerPosition[1] == Initialize.monsterPosition[i][1]) {
                        if (Initialize.monsterHealth[i] > 0) { //判断怪物是否已经死亡
                            double random = Math.random();
                            if (random >= 0.5) { //判断是否攻击成功
                                System.out.println("You've attacked monster"+(i+1)+" successfully");
                                Initialize.monsterHealth[i]-=50;
                                if (Initialize.monsterHealth[i] > 0) { //判断怪物被攻击后是否死亡
                                    return;
                                } else {
                                    Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = "x";
                                    return;
                                }
                            } else {
                                System.out.println("You've failed to attack monster"+(i+1));
                                return;
                            }
                        } else {
                            System.out.println("Character already dead.");
                            return;
                        }
                    }
                }
                System.out.println("Player is moving up");
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]] = ".";
                Initialize.map[Initialize.playerPosition[0] - 1][Initialize.playerPosition[1]] = "*";
                Initialize.playerPosition[0]-=1;
                return;
            } else
                System.out.println("You can't go up. You lose a move");
        }

        if (direction.equals("down")) {
            if (Initialize.playerPosition[0] != 2) { //判断移动是否超出边界
                for (int i = 0; i < 3; i++) {
                    //判断是否攻击怪物
                    if (Initialize.playerPosition[0] + 1 == Initialize.monsterPosition[i][0] && Initialize.playerPosition[1] == Initialize.monsterPosition[i][1]) {
                        if (Initialize.monsterHealth[i] > 0) { //判断怪物是否死亡
                            double random = Math.random();
                            if (random >= 0.5) { //判断是否攻击成功
                                System.out.println("You've attacked monster"+(i+1)+" successfully");
                                Initialize.monsterHealth[i] -= 50;
                                if (Initialize.monsterHealth[i] > 0) { //判断怪物被攻击后是否死亡
                                    return;
                                } else {
                                    Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = "x";
                                    return;
                                }
                            } else {
                                System.out.println("You've failed to attack monster"+(i+1));
                                return;
                            }
                        } else {
                            System.out.println("Character already dead.");
                            return;
                        }
                    }
                }
                System.out.println("Player is moving down");
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]] = ".";
                Initialize.map[Initialize.playerPosition[0] + 1][Initialize.playerPosition[1]] = "*";
                Initialize.playerPosition[0]+=1;
                return;
            } else
                System.out.println("You can't go down. You lose a move");
        }

        if (direction.equals("left")) {
            if (Initialize.playerPosition[1] != 0) { //判断移动是否超出边界
                for (int i = 0; i < 3; i++) {
                    //判断是否攻击怪物
                    if (Initialize.playerPosition[0]== Initialize.monsterPosition[i][0] && Initialize.playerPosition[1]-1 == Initialize.monsterPosition[i][1]) {
                        if (Initialize.monsterHealth[i] > 0) { //判断怪物是否死亡
                            double random = Math.random();
                            if (random >= 0.5) { //判断是否攻击成功
                                System.out.println("You've attacked monster"+(i+1)+" successfully");
                                Initialize.monsterHealth[i] -= 50;
                                if (Initialize.monsterHealth[i] > 0) { //判断怪物被攻击后是否死亡
                                    return;
                                } else {
                                    Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = "x";
                                    return;
                                }
                            } else {
                                System.out.println("You've failed to attack monster"+(i+1));
                                return;
                            }
                        } else {
                            System.out.println("Character already dead.");
                            return;
                        }
                    }
                }
                System.out.println("Player is moving left");
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]] = ".";
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]-1] = "*";
                Initialize.playerPosition[1]-=1;
                return;
            } else
                System.out.println("You can't go left. You lose a move");
        }

        if (direction.equals("right")) {
            if (Initialize.playerPosition[1] != 2) { //判断移动是否超出边界
                for (int i = 0; i < 3; i++) {
                    //判断是否攻击怪物
                    if (Initialize.playerPosition[0]== Initialize.monsterPosition[i][0] && Initialize.playerPosition[1] +1== Initialize.monsterPosition[i][1]) {
                        if (Initialize.monsterHealth[i] > 0) { //判断怪物是否死亡
                            double random = Math.random();
                            if (random >= 0.5) { //判断是否攻击成功
                                System.out.println("You've attacked monster"+(i+1)+" successfully");
                                Initialize.monsterHealth[i] -= 50;
                                if (Initialize.monsterHealth[i] > 0) { //判断怪物被攻击后是否死亡
                                    return;
                                } else {
                                    Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = "x";
                                    return;
                                }
                            } else {
                                System.out.println("You've failed to attack monster"+(i+1));
                                return;
                            }
                        } else {
                            System.out.println("Character already dead.");
                            return;
                        }
                    }
                }
                System.out.println("Player is moving right");
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]] = ".";
                Initialize.map[Initialize.playerPosition[0]][Initialize.playerPosition[1]+1] = "*";
                Initialize.playerPosition[1]+=1;
                return;
            } else
                System.out.println("You can't go right. You lose a move");
        }
    }
}
