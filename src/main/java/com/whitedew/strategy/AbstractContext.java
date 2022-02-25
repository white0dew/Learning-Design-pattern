package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:33
 */
public class AbstractContext {
    AbstractStrategy strategy;

    //初始化时传入具体的策略对象
    public AbstractContext(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口，调用策略的具体方法
    public void ContextInterface() {
        strategy.ItsInterface();
    }
}
