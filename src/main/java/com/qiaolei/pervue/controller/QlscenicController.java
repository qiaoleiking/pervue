package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.Qlscenic;
import com.qiaolei.pervue.entity.QlscenicVo;
import com.qiaolei.pervue.service.IQlscenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/qlscenic")
public class QlscenicController {

    @Autowired
    private IQlscenicService iQlscenicService;

    @RequestMapping("scenicList")
    public ResultEntity scenicList(QlscenicVo vo,@RequestParam(defaultValue = "1")long current,@RequestParam(defaultValue = "3") long size){

        Page page = new Page(current,size);
        IPage pageInfo = iQlscenicService.selectPageVo(page,vo);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("insert")
    public ResultEntity insert(@RequestBody  Qlscenic qlscenic){
        boolean save = iQlscenicService.save(qlscenic);
        return ResultEntity.ok(save);
    }
}











