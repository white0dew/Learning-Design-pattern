package com.whitedew.abstractfactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:54
 */
public class Department {
    private int _id;
    private String departmentName;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getName() {
        return departmentName;
    }

    public void setName(String name) {
        this.departmentName = name;
    }
}
