package com.wl.dao;

import com.wl.model.entity.ServicePathInfo;

/**
 * 树节点关系数据
 */
public interface ServicePathInfoMapper {
    /**
     * 根据主键删除记录
     *
     * @param id     主键
     */
    int deleteByPrimaryKey(Long id);

    int insert(ServicePathInfo record);

    int insertSelective(ServicePathInfo record);

    ServicePathInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新
     *
     * @param record     记录
     */
    int updateByPrimaryKeySelective(ServicePathInfo record);

    int updateByPrimaryKey(ServicePathInfo record);
}