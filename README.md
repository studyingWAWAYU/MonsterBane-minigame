# MonsterBane/minigame
- zh_CN [简体中文版本](README.zh_CN.md)

## Table of Contents
* Background
* How to play
* Directory
* Code logic
* Maintainers
* Contributing
* License

### Background
This is a homework assignment for a Java basic course.
It implements a small game that can be operated in the console using basic Java classes.

### How to play
**Download the code and run the *src/Main.java* file can start the game.**
<br>Upon starting the program, the game will print a 3x3 grid map.
<br>The symbol "*" represents the player, and "%" represents monsters.
<br>**The player can move by inputting "up," "down," "left," or "right" in the console.**
<br>
The initial health for both the player and monsters is 100.
<br>A successful player attack will deduct 50 health points from a monster, while a successful monster attack will deduct 20 health points from the player.
<br>At the end of each round, the current health of the player and monsters will be printed.
<br>If all three monsters are killed, the player **wins**. If the player dies, the player **loses**.
<br>**Player Logic:**
1. If the player attempts to move beyond the boundaries of the map, they will be unable to move and will lose a move.
2. If the player moves towards an adjacent monster, it will be considered an attack. There is a 50% chance of a successful attack. <br>

**Monster Logic:**
1. The monster's movement direction is random each time, with equal probabilities for all four directions.
2. If the monster attempts to move beyond the boundaries of the map, it will be unable to move and will lose a move.
3. If a monster tries to move to the position of another monster, it will be unable to move and will lose a move.
4. If the monster moves towards an adjacent player, it will be considered an attack. There is a 50% chance of a successful attack.
5. If the monster's health reaches 0, the "%" symbol will change to "x," indicating the monster's death. It will no longer be able to move.


### Directory
This project consists of five classes: Initialize, Main, MonsterMove, PlayerMove, Print.
<br>The diagram below shows the specific functionalities of each class.
<img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/Directoryen.png" width="70%" height="70%"/>

### Code logic
The following diagrams illustrate the logic of the Main, PlayerMove, and MonsterMove classes.
<br>**Logic of Main.java class:**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/MainFLOWen.png" width="50%" height="50%"/>
<br>
<br>**Logic of PlayerMove.java class:**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/PlayerMoveFLOWen.png" width="45%" height="45%"/>
<br>
<br>**Logic of MonsterMove.java class:**
<br><img src="https://github.com/studyingWAWAYU/MonsterBane-minigame/blob/main/img/MonsterMoveFLOWen.png" width="60%" height="60%"/>
<br>


### Maintainers
@studyingWAWAYU

### Contributing
Feel free to dive in Open an issue or submit PRs.  
flask-ATM-Simulator follows the Contributor Covenant Code of Conduct.

### License
MIT License
