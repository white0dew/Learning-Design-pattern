package com.whitedew.abstractfactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 11:41
 */

//抽象工厂加简单工厂
public class Client3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        User user = new User();
        Department department = new Department();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);

    }
}

//public class Client3 {
//    public static void main(String[] args) {
//        User user = new User();
//        Department department = new Department();
//
//        IUser iUser = DataAccess.CreateUser();
//        iUser.insert(user);
//        iUser.getUser(1);
//
//        IDepartment iDepartment = DataAccess.CreateDepartment();
//        iDepartment.insert(department);
//        iDepartment.getDepartment(1);
//
//    }
//}

