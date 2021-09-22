package com.whitedew.memento;

/**
 * @Author whitedew
 * @Date 2021/6/21 23:59
 */
public class GameClient {

    public static void main(String[] args) {

        // 显示初始状态
        System.out.println("初始状态--");
        Hero hero = new Hero();
        hero.getInitialState();
        hero.displayState();

        // 保存游戏
        System.out.println("保存游戏--");
        CareTaker caretaker = new CareTaker();
        caretaker.saveGame(hero.saveState());

        // 打死大boss
        System.out.println("三拳打死Boss--");
        hero.fight();
        hero.displayState();

        // 升级啦
        System.out.println("经验升级--");
        hero.levelUp();
        hero.displayState();

        // 恢复游戏
        System.out.println("读取存档--");
        hero.loadState(caretaker.loadGame());
        hero.displayState();
    }
}
