package com.whitedew.abstractfactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:48
 */

////工厂方法
//public interface IFactory {
//    IUser createUser();
//}

//抽象工厂
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
