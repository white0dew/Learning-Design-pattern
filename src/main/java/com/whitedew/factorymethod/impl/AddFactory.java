package com.whitedew.factorymethod.impl;

import com.whitedew.factorymethod.IFactory;
import com.whitedew.factorymethod.Operation;
import com.whitedew.factorymethod.OperationAdd;

/**
 * @Author whitedew
 * @Date 2021/9/23 23:26
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
