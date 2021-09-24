package com.whitedew.abstractfactory;

/**
 * @Author whitedew
 * @Date 2021/9/24 10:55
 */
public interface IDepartment {
    public void insert(Department department);

    public Department getDepartment(int id);
}
