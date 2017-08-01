package com.myblog.dao.genericsdao.dao;

import java.util.Vector;

import com.myblog.dao.genericsdao.bean.Word;

//Word Dao接口额外功能
public interface IWordDao extends IBaseDao<Word> {
    Vector<Word> getTableTitle();
}
