package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.Qlcenter;
import com.qiaolei.pervue.service.IQlcenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-14
 */
@Controller
@RequestMapping("/qlcenter")
public class QlcenterController {

    @Autowired
    private IQlcenterService iQlcenterService;

    @RequestMapping("insert")
    public ResultEntity insert(Integer gid,Integer[] mid){
        boolean flag = false;
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("gid",gid);
        iQlcenterService.remove(queryWrapper);

        for (Integer id:mid) {

            Qlcenter qlcenter = new Qlcenter();
            qlcenter.setGid(gid);
            qlcenter.setMid(id);
             flag = iQlcenterService.save(qlcenter);
        }

        return ResultEntity.ok(flag);

        
    }
}

