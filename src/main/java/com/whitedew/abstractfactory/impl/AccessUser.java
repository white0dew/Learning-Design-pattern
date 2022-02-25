package com.whitedew.abstractfactory.impl;

import com.whitedew.abstractfactory.IUser;
import com.whitedew.abstractfactory.User;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:41
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表增加记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据id获取User表的记录");
        return null;
    }
}
