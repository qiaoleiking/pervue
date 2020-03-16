package com.qiaolei.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.api.ResultEntity;
import com.qiaolei.pervue.entity.QlGoodsVo;
import com.qiaolei.pervue.entity.Qlgoods;
import com.qiaolei.pervue.service.IQlcenterService;
import com.qiaolei.pervue.service.IQlgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ql
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/qlgoods")
public class QlgoodsController {

    @Autowired
    private IQlgoodsService iQlgoodsService;

    @Autowired
    private IQlcenterService iQlcenterService;


    // 商品的列表
    @RequestMapping("goodsList")
    public ResultEntity goodsList(QlGoodsVo vo, @RequestParam(defaultValue = "1") long current, @RequestParam(defaultValue = "3")long size){

        Page page = new Page<>(current,size);
        IPage<QlGoodsVo> pageInfo = iQlgoodsService.selectGoodsList(page,vo);
        return ResultEntity.ok(pageInfo);
    }

    // 商品的列表
    @RequestMapping("deletes")
    public ResultEntity deletes(Integer[] ids){
        boolean flag = false;
        if(ids != null && ids.length > 0 ){

            for (Integer gid:ids) {
                QueryWrapper queryWrapper = new QueryWrapper();
                queryWrapper.eq("gid",gid);
                iQlcenterService.remove(queryWrapper);
            }


            flag = iQlgoodsService.removeByIds(Arrays.asList(ids));

        }

        return ResultEntity.ok(flag);
    }

    @RequestMapping("insert")
    public ResultEntity insert(@RequestBody Qlgoods qlgoods){

        System.err.println("这是处理添加的++++++"+qlgoods);
        qlgoods.setCreated(new Date());
        boolean flag = iQlgoodsService.save(qlgoods);

        return ResultEntity.ok(flag);
    }

    @RequestMapping("getById")
    public ResultEntity insert(Integer gid){

        Qlgoods qlgoods = iQlgoodsService.getById(gid);
        return ResultEntity.ok(qlgoods);
    }

    @RequestMapping("update")
    public ResultEntity update(@RequestBody Qlgoods qlgoods){

        boolean flag = iQlgoodsService.saveOrUpdate(qlgoods);
        return ResultEntity.ok(flag);

    }
}

