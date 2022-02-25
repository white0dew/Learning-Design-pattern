package com.whitedew.abstractfactory;

import com.whitedew.abstractfactory.impl.AccessFactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 11:20
 */

//抽象工厂模式
public class Client2 {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        //SqlserverFactory();
        IFactory factory = new AccessFactory();

        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }

}
