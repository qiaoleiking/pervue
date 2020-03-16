package com.qiaolei.pervue.service;

import com.qiaolei.pervue.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> listMenus();


    /*
    根据用户查询菜单资源
     */
    List<Menu> listMenuByUsername(String username);
}
