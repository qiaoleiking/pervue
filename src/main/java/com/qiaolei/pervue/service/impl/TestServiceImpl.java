package com.qiaolei.pervue.service.impl;

import com.qiaolei.pervue.entity.Test;
import com.qiaolei.pervue.mapper.TestMapper;
import com.qiaolei.pervue.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
