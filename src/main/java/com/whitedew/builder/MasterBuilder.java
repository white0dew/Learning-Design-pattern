package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:44
 */
public class MasterBuilder extends AbstractBuilder {
    @Override
    public void BuildHead() {
        System.out.println("头部：普通人类头");
    }

    @Override
    public void BuildBody() {
        System.out.println("躯干：老迈躯");
    }

    @Override
    public void BuildArms() {
        System.out.println("手臂：骨瘦臂");
    }

    @Override
    public void BuildLegs() {
        System.out.println("腿部：不动冥王腿");
    }

    @Override
    public void ChooseGenius() {
        System.out.println("天赋：无量；洞察；瞬发");
    }

    @Override
    public void ChooseCloth() {
        System.out.println("服饰：大法师袍");
    }

    @Override
    public void ChooseWeapon() {
        System.out.println("武器：瓦巴杰克");
    }

    @Override
    public void SetName() {
        System.out.println("姓名：阿不思·邓布利多");
    }
}
