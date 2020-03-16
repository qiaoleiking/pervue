package com.qiaolei.pervue.controller;


import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/nation")
public class NationController {

    @Autowired
    private INationService iNationService;

    @RequestMapping("list")
    public ResultEntity list(){
        return ResultEntity.ok(iNationService.findAll());

    }
}

