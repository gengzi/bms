package com.bms.demo.mapper;

import com.bms.common.mybatis.annotation.DataColumn;
import com.bms.common.mybatis.annotation.DataPermission;
import com.bms.common.mybatis.core.mapper.BaseMapperPlus;
import com.bms.demo.domain.TestTree;
import com.bms.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author bms
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
