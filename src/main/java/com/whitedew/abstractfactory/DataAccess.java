package com.whitedew.abstractfactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 11:36
 */
//public class DataAccess {
//
//    //更换 Access
//    private static final String db = "Sqlserver";
//
//    public static IUser CreateUser() {
//        IUser result = null;
//        switch (db) {
//            case "Sqlserver":
//                result = new SqlserverUser();
//                break;
//            case "Access":
//                result = new AccessUser();
//                break;
//        }
//        return result;
//    }
//
//    public static IDepartment CreateDepartment() {
//        IDepartment result = null;
//        switch (db) {
//            case "Sqlserver":
//                result = new SqlserverDepartment();
//                break;
//            case "Access":
//                result = new AccessDepartment();
//                break;
//        }
//        return result;
//    }
//}

public class DataAccess {

    private static final String name = "com.whitedew.abstractfactory.impl";
    private static final String db = "Access";//要更换，换成Sqlserver即可

    public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String className = name + "." + db + "User";
        return (IUser) Class.forName(className).newInstance();
    }

    public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String className = name + "." + db + "Department";
        return (IDepartment) Class.forName(className).newInstance();
    }

}