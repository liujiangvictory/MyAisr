package com.liuj.opencrm.lt.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 报文映射关系表
 * </p>
 *
 * @author Liu jiang
 * @since 2022-04-29
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class InOutParamMapping implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer rowId;

      /**
     * 接口id
     */
      private Integer busiId;

      /**
     * 接口交互系统
     */
      private String sysCode;

      /**
     * 取值对象中的属性名
     */
      private String property;

      /**
     * 取值对象名
     */
      private String prarmSource;

      /**
     * 映射成报文名
     */
      private String outProperty;

    private String supeOutProperty;

      /**
     * 参数类型
     */
      private String outPropertyType;

      /**
     * 参数默认值
     */
      private String defaultValue;

    private Integer orderNo;

      /**
     * 转换类
     */
      private String convertClass;

    private String formatMask;

      /**
     * 状态
     */
      private Integer state;

    private String serviceName;


}
