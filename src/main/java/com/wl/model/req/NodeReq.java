package com.wl.model.req;

import lombok.Data;

/**
 * @author 南顾北衫
 */
@Data
public class NodeReq {
    /**
     * 节点Id
     */
    private Long id;

    /**
     * 祖先Id
     */
    private Long ancestorId;

    /**
     * 业务名称
     */
    private String name;

}
