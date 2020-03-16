package com.qiaolei.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.Qlscenic;
import com.qiaolei.pervue.entity.QlscenicVo;
import com.qiaolei.pervue.mapper.QlscenicMapper;
import com.qiaolei.pervue.service.IQlscenicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-15
 */
@Service
public class QlscenicServiceImpl extends ServiceImpl<QlscenicMapper, Qlscenic> implements IQlscenicService {

    @Autowired
    private QlscenicMapper mapper;

    @Override
    public IPage selectPageVo(Page page, QlscenicVo vo) {
        return mapper.selectPageVo(page,vo);
    }
}
