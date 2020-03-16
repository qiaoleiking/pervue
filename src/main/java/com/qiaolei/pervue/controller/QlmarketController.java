package com.qiaolei.pervue.controller;


import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.Qlmarket;
import com.qiaolei.pervue.service.IQlmarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/qlmarket")
public class QlmarketController {

    @Autowired
    private IQlmarketService iQlmarketService;

    @RequestMapping("marketList")
    public ResultEntity marketList(){
        List<Qlmarket> list = iQlmarketService.list();
        return ResultEntity.ok(list);
    }



}

