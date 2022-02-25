package com.whitedew.memento;

import lombok.Data;

/**
 *
 * @Author whitedew
 * @Date 2021/6/21 23:40
 */
@Data
public class Hero {
    private int hp;
    private int mp;
    private int atk;
    private int def;

    // 初始角色状态
    public void getInitialState() {
        this.hp = 100;
        this.mp = 50;
        this.atk = 10;
        this.def = 5;
    }

    // 当前状态展示
    public void displayState() {
        System.out.println("角色当前状态：");
        System.out.println("生命值：" + this.hp);
        System.out.println("魔法值：" + this.hp);
        System.out.println("攻击力：" + this.atk);
        System.out.println("防御力： " + this.def);
        System.out.println("******************");
    }

    // 角色经验升级，恢复一定生命、魔法并增加属性
    public void levelUp() {
        this.hp += 20;
        this.mp += 10;
        this.atk += 5;
        this.def += 5;
    }

    // 大战boss
    public void fight() {
        this.hp -= 99;
        this.mp -= 50;
    }

    // 保存现在状态
    public SavaLoadMemento saveState() {
        return (new SavaLoadMemento(hp, mp, atk, def));
    }

    // 恢复之前状态
    public void loadState(SavaLoadMemento memento) {
        this.hp = memento.getHp();
        this.mp = memento.getMp();
        this.atk = memento.getAtk();
        this.atk = memento.getDef();
    }
}
