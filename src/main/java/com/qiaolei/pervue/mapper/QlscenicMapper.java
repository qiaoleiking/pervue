package com.qiaolei.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.Qlscenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiaolei.pervue.entity.QlscenicVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ql
 * @since 2020-03-15
 */
public interface QlscenicMapper extends BaseMapper<Qlscenic> {

    IPage selectPageVo(Page page, QlscenicVo vo);

}
