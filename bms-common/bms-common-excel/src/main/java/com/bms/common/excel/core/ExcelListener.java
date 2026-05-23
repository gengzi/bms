package com.bms.common.excel.core;

import cn.idev.excel.read.listener.ReadListener;

/**
 * Excel 导入监听
 *
 * @author bms
 */
public interface ExcelListener<T> extends ReadListener<T> {

    ExcelResult<T> getExcelResult();

}
