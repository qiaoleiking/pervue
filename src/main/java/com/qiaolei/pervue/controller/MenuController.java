package com.qiaolei.pervue.controller;


import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.Menu;
import com.qiaolei.pervue.entity.User;
import com.qiaolei.pervue.mapper.MenuMapper;
import com.qiaolei.pervue.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("list")
    public ResultEntity list(){
        List<Menu> menus = iMenuService.listMenus();
        return ResultEntity.ok(menus);
    }

    @RequestMapping("menuByname")
    public ResultEntity listMenuByUsername(HttpServletRequest request ,String username){

        System.err.println( "列表:"+request.getSession().getId());
        User user = (User) request.getSession().getAttribute("user");

        if(user != null ){
            username = user.getUsername();
        }

        List<Menu> menus = iMenuService.listMenuByUsername(username);
        return ResultEntity.ok(menus);
    }

}


