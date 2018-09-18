package com.ddw.dd.manage.dao;

import com.ddw.dd.manage.pojo.po.Comment;
import com.ddw.dd.manage.pojo.po.CommentWithBLOBs;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentWithBLOBs record);

    int insertSelective(CommentWithBLOBs record);

    CommentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record);

    int updateByPrimaryKey(Comment record);
}