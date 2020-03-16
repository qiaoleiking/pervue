package com.qiaolei.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiaolei.pervue.entity.UserVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<UserVo> selectPageVo(Page page, UserVo vo);

}
