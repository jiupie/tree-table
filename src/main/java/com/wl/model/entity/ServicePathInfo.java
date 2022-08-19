package com.wl.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 业务路径信息表
 * @date 2022-08-01 16:28:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicePathInfo {
    private Long id;

    /**
     * 祖先Id
     */
    private Long ancestor;

    /**
     * 后代Id
     */
    private Long descendant;

    /**
     * 层级深度
     */
    private Integer depth;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}