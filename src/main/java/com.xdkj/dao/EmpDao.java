package com.xdkj.dao;

import com.xdkj.bean.Emp;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-15 15:17
 */
public interface EmpDao {

    public boolean add();
    public boolean delete();
    public boolean update();
    public List<Emp> findAll();

}
