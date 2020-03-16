package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.Role;
import com.qiaolei.pervue.entity.RoleVo;
import com.qiaolei.pervue.service.IMenuService;
import com.qiaolei.pervue.service.IMenu_roleService;
import com.qiaolei.pervue.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @Autowired
    private IMenu_roleService iMenu_roleService;

    @RequestMapping("list")
    public ResultEntity roleList() {
        return ResultEntity.ok(iRoleService.list());
    }

    @RequestMapping("rolelist")
    public ResultEntity roleList(RoleVo vo,
                                 @RequestParam(defaultValue = "1") long current,
                                 @RequestParam(defaultValue = "3") long size) {

        Page page = new Page(current, size);
        IPage<RoleVo> pageInfo = iRoleService.selectPageVo(page, vo);

        return ResultEntity.ok(pageInfo);
    }


    @RequestMapping("deletes")
    public ResultEntity deletes(Integer[] ids) {
        for (Integer id : ids) {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("rid", id);
            iMenu_roleService.remove(queryWrapper);
        }

        //批量删除
        boolean falg = iRoleService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(falg);

    }

    @RequestMapping("getById")
    public ResultEntity getById(Integer id) {
            Role role = iRoleService.getById(id);
            return  ResultEntity.ok(role);
    }

        @RequestMapping("update")
        public ResultEntity update(@RequestBody Role role) {
                boolean flag = iRoleService.saveOrUpdate(role);
                return ResultEntity.ok(flag);
        }

}

