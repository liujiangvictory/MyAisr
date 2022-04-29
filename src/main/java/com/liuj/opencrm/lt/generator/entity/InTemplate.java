package com.liuj.opencrm.lt.generator.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表名：接口模板存储表 ；
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
public class InTemplate implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer rowId;

      /**
     * 模板编号，根据序列生成
     */
      private Integer tplId;

      /**
     * 模板名称
     */
      private String tplName;

    private String tplContent;

      /**
     * 1:落地业务请求
     */
      private Integer tplType;

      /**
     * 记录状态0-历史；1-在用
     */
      private Integer state;

      /**
     * 操作组织单元
     */
      private Integer orgId;

      /**
     * 操作员
     */
      private Integer opId;

    private Date doneDate;

      /**
     * 操作流水
     */
      private String doneCode;

      /**
     * 规范版本
     */
      private String version;

      /**
     * 备注
     */
      private String remark;


}
