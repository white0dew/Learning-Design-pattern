package com.whitedew.abstractfactory.impl;

import com.whitedew.abstractfactory.Department;
import com.whitedew.abstractfactory.IDepartment;

/**
 * @Author whitedew
 * @Date 2021/9/24 11:18
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Sqlserver中给Department表增加记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Sqlserver中根据id获取Department表的记录");
        return null;
    }
}
