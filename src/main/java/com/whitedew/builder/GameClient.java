package com.whitedew.builder;

import java.util.ArrayList;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:42
 */
public class GameClient {
    public static void main(String[] args) {
        ArcherBuilder archerBuilder =new ArcherBuilder();
        KnightBuilder knightBuilder =new KnightBuilder();
        MasterBuilder masterBuilder =new MasterBuilder();
        GiantBuilder giantBuilder =new GiantBuilder();

        ArrayList<AbstractBuilder> builders =new ArrayList<>();
        builders.add(archerBuilder);
        builders.add(knightBuilder);
        builders.add(masterBuilder);
        builders.add(giantBuilder);
        System.out.println("世界角色构造中，请稍候......");
        for (AbstractBuilder builder:builders
             ) {
            Player player =new Player(builder);
            player.CreateCharacter();
            System.out.println("" +
                    "");
        }
        System.out.println("世界角色构造完毕，祝您游戏愉快！");
    }
}
