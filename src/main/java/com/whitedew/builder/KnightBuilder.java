package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:43
 */
public class KnightBuilder extends AbstractBuilder{
    @Override
    public void BuildHead() {
        System.out.println("头部：西方帝国头");
    }

    @Override
    public void BuildBody() {
        System.out.println("躯干：骑士躯");
    }

    @Override
    public void BuildArms() {
        System.out.println("手臂：百战臂");
    }

    @Override
    public void BuildLegs() {
        System.out.println("腿部：千夫长之腿");
    }

    @Override
    public void ChooseGenius() {
        System.out.println("天赋：勇猛；不惧；冲锋");
    }

    @Override
    public void ChooseCloth() {
        System.out.println("服饰：东罗帝国飞羽骑士套");
    }

    @Override
    public void ChooseWeapon() {
        System.out.println("武器：高仿战神枪");
    }

    @Override
    public void SetName() {
        System.out.println("姓名：大骑士长");
    }
}
