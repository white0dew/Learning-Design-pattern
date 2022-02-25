package com.whitedew.factorymethod.impl;

import com.whitedew.factorymethod.IFactory;
import com.whitedew.factorymethod.Operation;
import com.whitedew.factorymethod.OperationDiv;

/**
 * @Author whitedew
 * @Date 2021/9/23 23:30
 */
public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
