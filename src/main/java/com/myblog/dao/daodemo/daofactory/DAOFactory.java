package com.myblog.dao.daodemo.daofactory;

import com.myblog.dao.daodemo.dao.IEmpDAO;
import com.myblog.dao.daodemo.daoimpl.EmpDAOProxyImpl;

public class DAOFactory {
    public static IEmpDAO getInstance() {
        IEmpDAO dao = null;
        try {
            dao = new EmpDAOProxyImpl();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dao;
    }
}