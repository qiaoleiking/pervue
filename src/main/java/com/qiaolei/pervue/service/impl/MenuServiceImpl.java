package com.qiaolei.pervue.service.impl;

import com.qiaolei.pervue.entity.Menu;
import com.qiaolei.pervue.mapper.MenuMapper;
import com.qiaolei.pervue.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> listMenus() {
        return menuMapper.listMenus();
    }

    @Override
    public List<Menu> listMenuByUsername(String username) {
        return menuMapper.listMenuByUsername(username);
    }
}
