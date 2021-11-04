package com.whitedew.abstractfactory;

import com.whitedew.abstractfactory.impl.SqlserverFactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:50
 */

//工厂方法实现的客户端
//1
public class Client1 {
    public static void main(String[] args) {
        User user = new User();

        //换成AccessFactory()即可更换数据库
        IFactory factory = new SqlserverFactory();

        IUser iUser = factory.createUser();

        iUser.insert(user);
        iUser.getUser(1);
    }
}
