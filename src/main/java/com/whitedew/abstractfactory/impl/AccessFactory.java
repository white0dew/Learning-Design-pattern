package com.whitedew.abstractfactory.impl;

import com.whitedew.abstractfactory.IDepartment;
import com.whitedew.abstractfactory.IFactory;
import com.whitedew.abstractfactory.IUser;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:49
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
