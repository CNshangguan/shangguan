package com.xdkj.serivce;

import com.xdkj.bean.Emp;
import com.xdkj.dao.EmpDao;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-16 17:47
 */
public class EmpSerivceImpl implements EmpSerivce {

    private EmpDao emp;

    @Override
    public boolean add() {
        boolean add = emp.add();
        return add;
    }

    @Override
    public boolean delete() {
        boolean delete = emp.delete();
        return delete;
    }

    @Override
    public boolean update() {
        boolean update = emp.update();
        return update;
    }

    @Override
    public List<Emp> findAll() {
        List<Emp> all = emp.findAll();
        return all;
    }
}
