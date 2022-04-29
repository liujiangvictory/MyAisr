package com.liuj.opencrm.lt.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表名：接口业务配置表 ；
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
public class InBusiCfg implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 业务编号
     */
        private Integer busiId;

      /**
     * 业务名称
     */
      private String busiName;

      /**
     * 调用方法
     */
      private String method;

      /**
     * 业务归属系统
     */
      private String sysCode;

      /**
     * WEBSERVICE调用方法
     */
      private String webserviceMethod;

      /**
     * 回单类型
     */
      private String replyType;

      /**
     * 协议类型
     */
      private Integer protocolType;

      /**
     * 最大重试次数
     */
      private Integer maxRetryTimes;

      /**
     * 延迟时间单位秒
     */
      private Integer delayTime;

      /**
     * 备注
     */
      private String remark;


}
