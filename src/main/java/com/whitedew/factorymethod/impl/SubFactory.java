package com.whitedew.factorymethod.impl;

import com.whitedew.factorymethod.IFactory;
import com.whitedew.factorymethod.Operation;
import com.whitedew.factorymethod.OperationSub;

/**
 * @Author whitedew
 * @Date 2021/9/23 23:29
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}