# MonsterBane/minigame

- en [English Version](README.md)

## 目录
* 背景
* 如何开始
* 项目目录
* 代码逻辑
* 管理者
* 贡献
* 许可证

### 背景
这是一个java基础课程的课程作业，用java基础的类实现了一个在控制台操作的小游戏。

### 如何开始
**下载此代码，运行*src/Main.java*文件即可开始游戏.**
<br>程序开始运行后，游戏会先打印出一个3x3的网格地图。
<br>其中“*”表示玩家，“%”表示怪物。
<br>**玩家通过在控制台输入"up", "down", "left"或"right"实现位置移动。**
<br>
玩家和怪物的初始生命值为100.
<br>玩家攻击成功将扣取怪物50的血量。怪物攻击成功将扣取玩家20的血量。
<br>每一轮结束时会打印当前玩家和怪物的血量。
<br>如果三个怪物全部死亡则玩家**获胜**，如果玩家死亡则玩家**失败**。
<br>**玩家逻辑**：
1. 如果玩家试图移动超出地图边界，将会无法移动，失去一次移动机会。
2. 如果玩家向相邻怪物移动，将会视作为攻击怪物，每次攻击有50%的机会成功。
<br>

**怪物逻辑**：
1. 怪物每次移动方向都是随机的，四个方向的概率相同。
2. 如果怪物试图移动超出地图边界，将会无法移动，失去一次移动机会。
3. 如果怪物试图移动到另一个怪物的位置，将会无法移动，失去一次移动机会。
4. 如果怪物向相邻玩家移动，将会视作为攻击玩家，每次攻击有50%的机会成功。
5. 如果怪物生命值为0，则将“%”标志换位“x”。表示该怪物死亡，之后无法移动。

### 项目目录
本项目由五个类组成：Initialize, Main, MonsterMove, PlayerMove, Print
<br>下图展示了每个类的具体功能。
<img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/Directoryzh.png" width="70%" height="70%"/>

### 代码逻辑
下面将展示Main, PlayerMove, MonsterMove三个重要类的流程图。
<br>**Main.java类的逻辑：**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/MainFLOWzh.png" width="50%" height="50%"/>
<br>
<br>**PlayerMove.java类的逻辑：**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/PlayerMoveFLOWzh.png" width="45%" height="45%"/>
<br>
<br>**MonsterMove.java类的逻辑：**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/MonsterMoveFLOWzh.png" width="60%" height="60%"/>
<br>

### 管理者
@studyingWAWAYU

### 贡献
Feel free to dive in Open an issue or submit PRs.  
MonsterBane-minigame follows the Contributor Covenant Code of Conduct.

### 许可证
MIT License
