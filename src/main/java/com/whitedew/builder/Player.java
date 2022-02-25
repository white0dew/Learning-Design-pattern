package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:35
 */
public class Player {
    private AbstractBuilder abstractBuilder;

    public Player(AbstractBuilder abBuilder) {
        abstractBuilder=abBuilder;
    }

    public void CreateCharacter(){
        System.out.println("创建角色中......");
        abstractBuilder.BuildHead();
        abstractBuilder.BuildBody();
        abstractBuilder.BuildArms();
        abstractBuilder.BuildLegs();
        abstractBuilder.ChooseGenius();
        abstractBuilder.ChooseCloth();
        abstractBuilder.ChooseWeapon();
        abstractBuilder.SetName();
        System.out.println("角色创建完毕！");
    }
}
