package com.liuj.opencrm.lt.generator.entity;

import java.util.Date;
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
public class CfgTask implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 任务配置ID
     */
        private Integer cfgTaskId;

      /**
     * 任务名称
     */
      private String taskName;

      /**
     * 任务配置类型
     */
      private String cfgTaskTypeCode;

      /**
     * 接口的业务实现类
     */
      private String businessClass;

      /**
     * 任务执行方式(F,为固定时间;C,为cron周期执行;I,为立即执行)
     */
      private String taskMethod;

      /**
     * 任务配置表达式
     */
      private String taskExpr;

      /**
     * 任务优先级别(越大优先级别越高)
     */
      private Integer sortId;

      /**
     * 配置任务的员工
     */
      private Integer staffId;

      /**
     * 任务创建时间
     */
      private Date createDate;

      /**
     * 任务配置的状态更新时间
     */
      private Date stateDate;

      /**
     * 状态(U,为正常;E,为删除;F,为执行完成;X,为异常执行完成)
     */
      private String state;

      /**
     * 备注
     */
      private String remarks;


}
