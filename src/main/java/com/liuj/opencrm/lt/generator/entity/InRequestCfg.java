package com.liuj.opencrm.lt.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表名：请求流程配置 ；
数据量： ；
备注：
 * </p>
 *
 * @author Liu jiang
 * @since 2022-04-29
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class InRequestCfg implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
      private Integer rowId;

      /**
     * 业务编号
     */
        private Integer busiId;

      /**
     * 服务地址
     */
      private String url;

      /**
     * 调用方法
     */
      private String method;

      /**
     * 请求流程实现类
     */
      private String requestClass;

      /**
     * 请求类型
     */
      private String requestType;

      /**
     * 模板编号
     */
      private Integer templateId;

      /**
     * 1 通过VELOCTIY模板方式生成XML
    对应IN_TEMPLATE表
2 仅生成HashMap
     */
      private Integer templateType;

      /**
     * 绑定类
     */
      private String bindClass;

      /**
     * 来源
     */
      private String src;

      /**
     * 记录状态
     */
      private Integer state;

      /**
     * 备注
     */
      private String remark;

    private String ext1;

    private String ext2;

    private String ext3;


}
