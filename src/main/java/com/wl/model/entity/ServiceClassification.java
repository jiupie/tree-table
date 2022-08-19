package com.wl.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;



/**
 * 业务分类表
 * @date 2022-08-01 16:28:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceClassification {
    private Long id;

    /**
     * 业务名称
     */
    private String name;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}