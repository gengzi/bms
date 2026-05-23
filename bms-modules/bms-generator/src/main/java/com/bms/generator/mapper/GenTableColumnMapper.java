package com.bms.generator.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.bms.common.mybatis.core.mapper.BaseMapperPlus;
import com.bms.generator.domain.GenTableColumn;

/**
 * 业务字段 数据层
 *
 * @author bms
 */
@InterceptorIgnore(dataPermission = "true", tenantLine = "true")
public interface GenTableColumnMapper extends BaseMapperPlus<GenTableColumn, GenTableColumn> {

}
