package com.wl.service.impl;

import com.wl.dao.ServiceClassificationMapper;
import com.wl.dao.ServicePathInfoMapper;
import com.wl.model.entity.ServiceClassification;
import com.wl.model.entity.ServicePathInfo;
import com.wl.model.req.NodeReq;
import com.wl.service.ITreeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 树节点  祖先  后代 层级深度信息
 *
 * @author 南顾北衫
 */
@Service
public class ClosureTableService implements ITreeInfoService {

    @Resource
    private ServiceClassificationMapper serviceClassificationMapper;

    @Resource
    private ServicePathInfoMapper servicePathInfoMapper;


    @Override
    public void addNode(NodeReq nodeReq) {
        ServiceClassification serviceClassification = new ServiceClassification();
        serviceClassification.setName(nodeReq.getName());

        ServicePathInfo servicePathInfo = new ServicePathInfo();

        if (Objects.isNull(nodeReq.getAncestorId())) {
            //没有祖先节点，顶级节点
            //插入数据
            serviceClassificationMapper.insertSelective(serviceClassification);

            //插入节点  祖先后代 具体信息
            servicePathInfo.setAncestor(serviceClassification.getId());
            servicePathInfo.setDescendant(serviceClassification.getId());
            servicePathInfo.setDepth(1);

            servicePathInfoMapper.insertSelective(servicePathInfo);
        } else {
            //有祖先节点，非顶级节点

            serviceClassificationMapper.insertSelective(serviceClassification);

        }
    }
}
