package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:44
 */
public class ArcherBuilder extends AbstractBuilder {
    @Override
    public void BuildHead() {
        System.out.println("头部：精灵脑袋");
    }

    @Override
    public void BuildBody() {
        System.out.println("躯干：精灵身体");
    }

    @Override
    public void BuildArms() {
        System.out.println("手臂：精灵手臂");
    }

    @Override
    public void BuildLegs() {
        System.out.println("腿部：精灵腿");
    }

    @Override
    public void ChooseGenius() {
        System.out.println("天赋：鹰眼；急性；弯弓；");
    }

    @Override
    public void ChooseCloth() {
        System.out.println("服饰：初级弓箭手套装");
    }

    @Override
    public void ChooseWeapon() {
        System.out.println("武器：新手木弓");
    }

    @Override
    public void SetName() {
        System.out.println("姓名：潘德初级射手");
    }
}
