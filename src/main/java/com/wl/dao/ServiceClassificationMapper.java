package com.wl.dao;

import com.wl.model.entity.ServiceClassification;

/**
 * 树节点数据
 */
public interface ServiceClassificationMapper {
    /**
     * 根据主键删除记录
     *
     * @param id     主键
     */
    int deleteByPrimaryKey(Long id);

    int insert(ServiceClassification record);

    int insertSelective(ServiceClassification record);

    ServiceClassification selectByPrimaryKey(Long id);

    /**
     * 根据主键更新
     *
     * @param record     记录
     */
    int updateByPrimaryKeySelective(ServiceClassification record);

    int updateByPrimaryKey(ServiceClassification record);
}