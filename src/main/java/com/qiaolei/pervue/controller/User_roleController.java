package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.User_role;
import com.qiaolei.pervue.service.IUser_roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/user_role")
public class User_roleController {

    @Autowired
    private IUser_roleService iUser_roleService;



    @RequestMapping("/insert")
    public ResultEntity insert_role(Integer rids[],Integer uid) {

        try{
            iUser_roleService.insertBatch(rids,uid);
            return ResultEntity.ok(true);
        } catch (Exception e) {
            System.err.println("异常");
            e.printStackTrace();
            //返回结果
            return ResultEntity.error();
        }

    }
}

