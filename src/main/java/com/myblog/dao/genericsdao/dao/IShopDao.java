package com.myblog.dao.genericsdao.dao;

import com.myblog.dao.genericsdao.bean.Shop;

public interface IShopDao extends IBaseDao<Shop> {
    Shop findById(int id);
}
