package com.xdkj.serivce;

import com.xdkj.bean.Emp;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-15 17:03
 */
public interface EmpSerivce {

    public boolean add();
    public boolean delete();
    public boolean update();
    public List<Emp> findAll();
}
