## 背景
关于树形层级设计有几种设计方案
- 邻接表
- 路径枚举
- 嵌套集
- 闭包表

## 树形结构设计
### 闭包表
#### sql
```sql
CREATE TABLE `service_classification` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '业务名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) COMMENT='业务分类表';

CREATE TABLE `service_path_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ancestor` bigint  COMMENT '祖先Id',
  `descendant` bigint  COMMENT '后代Id',
	`depth`  int comment '层级深度',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) COMMENT='业务路径信息表';
```



