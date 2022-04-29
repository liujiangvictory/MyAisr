package com.liuj.opencrm.lt.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Liu jiang
 * @since 2022-04-29
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class CfgTaskParamValue implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键ID
     */
        private Integer id;

      /**
     * 任务配置ID
     */
      private Integer cfgTaskId;

      /**
     * 参数ID
     */
      private Integer paramId;

      /**
     * N-无限制 E-枚举 V-取值范围 F-自定义格式 T-表查询
     */
      private String paramValue;

      /**
     * 备注
     */
      private String remarks;


}
