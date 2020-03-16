package com.qiaolei.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaolei.pervue.entity.RoleVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {

    IPage<RoleVo> selectPageVo(Page page , RoleVo vo);
}
