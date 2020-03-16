package com.qiaolei.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.Qlscenic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaolei.pervue.entity.QlscenicVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ql
 * @since 2020-03-15
 */
public interface IQlscenicService extends IService<Qlscenic> {

    IPage selectPageVo(Page page, QlscenicVo vo);

}
