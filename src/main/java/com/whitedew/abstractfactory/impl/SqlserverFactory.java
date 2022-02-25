package com.whitedew.abstractfactory.impl;

import com.whitedew.abstractfactory.IDepartment;
import com.whitedew.abstractfactory.IFactory;
import com.whitedew.abstractfactory.IUser;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:48
 */
public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
