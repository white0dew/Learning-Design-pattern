package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:44
 */
public class GiantBuilder extends AbstractBuilder {
    @Override
    public void BuildHead() {
        System.out.println("头部：巨人头");
    }

    @Override
    public void BuildBody() {
        System.out.println("躯干：荒古圣体");
    }

    @Override
    public void BuildArms() {
        System.out.println("手臂：麒麟臂");
    }

    @Override
    public void BuildLegs() {
        System.out.println("腿部：刑天之腿");
    }

    @Override
    public void ChooseGenius() {
        System.out.println("天赋：威压；力巨；不死；");
    }

    @Override
    public void ChooseCloth() {
        System.out.println("服饰：刑天套");
    }

    @Override
    public void ChooseWeapon() {
        System.out.println("武器：刑天斧");
    }

    @Override
    public void SetName() {
        System.out.println("姓名：战神刑天");
    }
}
