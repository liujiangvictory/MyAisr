package com.liuj.opencrm.lt.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表名：业务量  增长量  分区 分表规则 ；
数据量： ；
备注： ；
 * </p>
 *
 * @author Liu jiang
 * @since 2022-04-29
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class InResponseCfg implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 写上序列编号
     */
      private Integer rowId;

      /**
     * 业务编号
     */
        private Integer busiId;

    private String url;

      /**
     * 调用方法
     */
      private String method;

      /**
     * 响应实现类
     */
      private String responseClass;

      /**
     * 自动绑定类
     */
      private String bindClass;

      /**
     * 模板编号
     */
      private Integer templateId;

      /**
     * 来源
     */
      private String src;

      /**
     * 必须写上CODE_TYPE
     */
      private Integer state;

    private String remark;

    private String ext1;

    private String ext2;

    private String ext3;


}
