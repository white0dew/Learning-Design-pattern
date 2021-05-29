package com.whitedew.builder;

/**
 * @Author whitedew
 * @Date 2021/5/29 21:32
 */
abstract public class AbstractBuilder {
    public abstract void BuildHead ();
    public abstract void BuildBody ();
    public abstract void BuildArms();
    public abstract void BuildLegs();
    public abstract void ChooseGenius();
    public abstract void ChooseCloth();
    public abstract void ChooseWeapon();
    public abstract void SetName();
}
