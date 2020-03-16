package com.qiaolei.pervue.mapper;

import com.qiaolei.pervue.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {

        List<Menu> listMenus();

        /*
        根据用户查询菜单资源
         */
        List<Menu> listMenuByUsername(String username);
 }
