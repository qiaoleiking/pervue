package com.qiaolei.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.Role;
import com.qiaolei.pervue.entity.RoleVo;
import com.qiaolei.pervue.mapper.RoleMapper;
import com.qiaolei.pervue.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public IPage<RoleVo> selectPageVo(Page page, RoleVo vo) {
        return roleMapper.selectPageVo(page,vo);
    }
}
