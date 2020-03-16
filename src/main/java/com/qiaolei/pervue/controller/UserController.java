package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.User;
import com.qiaolei.pervue.entity.UserVo;
import com.qiaolei.pervue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/user")
//@CrossOrigin // 支持跨域访问
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current, UserVo vo,@RequestParam(defaultValue = "3")long size){

        Page page = new Page(current,size);
    //  Page pageInfo = iUserService.page(page, null);
        IPage<UserVo> pageInfo = iUserService.selectPageVo(page,vo);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("delete")
    public ResultEntity delete(Integer[] ids){

        boolean flag = iUserService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody User user){

        boolean flag = iUserService.save(user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/update")
    public ResultEntity updateUser(@RequestBody User user){

        boolean flag = iUserService.updateById(user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("login")
    public ResultEntity login(HttpServletRequest request,@RequestBody  User entiy){

        HttpSession session = request.getSession();
        System.err.println("登录:"+ session.getId());
        QueryWrapper queryWrapper  = new QueryWrapper();
        queryWrapper.eq("username",entiy.getUsername());
        User user = iUserService.getOne(queryWrapper);

        if(user != null ){
          if(user.getPassword().equals(entiy.getPassword())){
              session.setAttribute("user",user);
              return ResultEntity.ok(user);
          }
        }
        return ResultEntity.error(10002,"用户名或密码错误");
    }


    @RequestMapping("outLogin")
    public ResultEntity login(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return  ResultEntity.ok(true);
    }
}

