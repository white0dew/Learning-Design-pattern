package com.whitedew.memento;

import lombok.Data;

/**
 * @Author whitedew
 * @Date 2021/6/21 23:53
 */
@Data
public class SavaLoadMemento {
    private int hp; // 生命力
    private int mp; // 魔法值
    private int atk; // 攻击力
    private int def; // 防御力

    public SavaLoadMemento(int hp, int mp, int atk, int def) {
        this.hp = hp;
        this.mp = hp;
        this.atk = atk;
        this.def = def;

    }
}
