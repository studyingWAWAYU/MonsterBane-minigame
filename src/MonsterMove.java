public class MonsterMove {
    static void move() {
        OUT:
        for (int i = 0; i < 3; i++) {
            if (Initialize.monsterHealth[i] <= 0) {//判断怪物是否死亡
                System.out.println("Monster"+(i+1)+" already dead");
                continue OUT;
            } else {
                double random = Math.random(); //随机选方向
                if (random > 0.75) { //direction == up
                    if (Initialize.monsterPosition[i][0] != 0) { //判断移动是否超出边界
                        //判断该位置上是否已有怪物
                        for (int j = 0; j < 3; j++) {
                            if (Initialize.monsterPosition[i][0] - 1 == Initialize.monsterPosition[j][0] && Initialize.monsterPosition[i][1] == Initialize.monsterPosition[j][1] && j != i) {
                                System.out.println("Monster"+(i+1)+" is moving up. Monster already there so it cannot move.");
                                continue OUT;
                            }
                        }
                        //如果攻击玩家
                        if (Initialize.monsterPosition[i][0] - 1 == Initialize.playerPosition[0] && Initialize.monsterPosition[i][1] == Initialize.playerPosition[1]) {
                            double random2 = Math.random();
                            if (random2 >= 0.5) { //如果攻击成功
                                System.out.println("Monster"+(i+1)+" has attacked successfully");
                                Initialize.playerHealth -= 20;
                                if (Initialize.playerHealth > 0)  //如果玩家被攻击后未死亡
                                    continue OUT;
                                else { //如果玩家被攻击后死亡
                                    return;
                                }
                            } else //如果攻击失败
                                System.out.println("Monster"+(i+1)+" has failed to attack");
                        } else { //如果不攻击玩家，就更新怪物位置
                            System.out.println("Monster"+(i+1)+" is moving up");
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = ".";
                            Initialize.map[Initialize.monsterPosition[i][0] - 1][Initialize.monsterPosition[i][1]] = "%";
                            Initialize.monsterPosition[i][0] -= 1;
                        }
                    } else //如果移动超出边界
                        System.out.println("Monster"+(i+1)+" can't go up. Monster"+i+" lose a move.");
                }

                else if (random > 0.5) { //direction == down
                    if (Initialize.monsterPosition[i][0] != 2) { //判断移动是否超出边界
                        //判断该位置上是否已有怪物
                        for (int j = 0; j < 3 ; j++) {
                            if (Initialize.monsterPosition[i][0] + 1 == Initialize.monsterPosition[j][0] && Initialize.monsterPosition[i][1] == Initialize.monsterPosition[j][1]&& j != i) {
                                System.out.println("Monster"+(i+1)+"is moving down. Monster already there so it cannot move.");
                                continue OUT;
                            }
                        }
                        //如果攻击玩家
                        if (Initialize.monsterPosition[i][0] + 1 == Initialize.playerPosition[0] && Initialize.monsterPosition[i][1] == Initialize.playerPosition[1]) {
                            double random2 = Math.random();
                            if (random2 >= 0.5) { //如果攻击成功
                                System.out.println("Monster"+(i+1)+" has attacked successfully");
                                Initialize.playerHealth -= 20;
                                if (Initialize.playerHealth > 0) //如果玩家被攻击后未死亡
                                    continue OUT;
                                else { //如果玩家被攻击后死亡
                                    return;
                                }
                            } else //如果攻击失败
                                System.out.println("Monster"+(i+1)+" has failed to attack");
                        } else { //如果不攻击玩家，就更新怪物位置
                            System.out.println("Monster"+(i+1)+" is moving down");
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = ".";
                            Initialize.map[Initialize.monsterPosition[i][0] + 1][Initialize.monsterPosition[i][1]] = "%";
                            Initialize.monsterPosition[i][0] += 1;
                        }
                    } else //如果移动超出边界
                        System.out.println("Monster"+(i+1)+" can't go down. Monster lose a move.");
                }

                else if (random > 0.25) { //direction == left
                    if (Initialize.monsterPosition[i][1] != 0) { //判断移动是否超出边界
                        //判断该位置上是否已有怪物
                        for (int j = 0; j < 3; j++) {
                            if (Initialize.monsterPosition[i][0] == Initialize.monsterPosition[j][0] && Initialize.monsterPosition[i][1]-1 == Initialize.monsterPosition[j][1] && j!=i) {
                                System.out.println("Monster"+(i+1)+"is moving left. Monster already there so it cannot move.");
                                continue OUT;
                            }
                        }
                        //如果攻击玩家
                        if (Initialize.monsterPosition[i][0] == Initialize.playerPosition[0] && Initialize.monsterPosition[i][1]-1 == Initialize.playerPosition[1]) {
                            double random2 = Math.random();
                            if (random2 >= 0.5) { //如果攻击成功
                                System.out.println("Monster"+(i+1)+" has attacked successfully");
                                Initialize.playerHealth -= 20;
                                if (Initialize.playerHealth > 0) //如果玩家被攻击后未死亡
                                    continue OUT;
                                else //如果玩家被攻击后死亡
                                    return;
                            } else //如果攻击失败
                                System.out.println("Monster"+(i+1)+" has failed to attack");
                        } else { //如果不攻击玩家，就更新怪物位置
                            System.out.println("Monster"+(i+1)+" is moving left");
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = ".";
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]-1] = "%";
                            Initialize.monsterPosition[i][1] -= 1;
                        }
                    } else //如果移动超出边界
                        System.out.println("Monster"+(i+1)+" can't go left. Monster lose a move.");
                }

                else{ //direction == right
                    if (Initialize.monsterPosition[i][1] != 2) { //判断移动是否超出边界
                        //判断该位置上是否已有怪物
                        for (int j = 0; j < 3; j++) {
                            if (Initialize.monsterPosition[i][0]== Initialize.monsterPosition[j][0] && Initialize.monsterPosition[i][1]+1 == Initialize.monsterPosition[j][1] && j!=i) {
                                System.out.println("Monster"+(i+1)+" is moving right. Monster already there so it cannot move.");
                                continue OUT;
                            }
                        }
                        //如果攻击玩家
                        if (Initialize.monsterPosition[i][0]== Initialize.playerPosition[0] && Initialize.monsterPosition[i][1]+1 == Initialize.playerPosition[1]) {
                            double random2 = Math.random();
                            if (random2 >= 0.5) { //如果攻击成功
                                System.out.println("Monster"+(i+1)+" has attacked successfully");
                                Initialize.playerHealth -= 20;
                                if (Initialize.playerHealth > 0) //如果玩家被攻击后未死亡
                                    continue OUT;
                                else  //如果玩家被攻击后死亡
                                    return;
                            } else //如果攻击失败
                                System.out.println("Monster"+(i+1)+" has failed to attack");
                        } else { //如果不攻击玩家，就更新怪物位置
                            System.out.println("Monster"+(i+1)+" is moving right");
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]] = ".";
                            Initialize.map[Initialize.monsterPosition[i][0]][Initialize.monsterPosition[i][1]+1] = "%";
                            Initialize.monsterPosition[i][1] += 1;
                        }
                    } else //如果移动超出边界
                        System.out.println("Monster"+(i+1)+" can't go right. Monster lose a move.");
                }
            }
        }
    }
}
