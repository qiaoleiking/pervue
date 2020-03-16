package com.qiaolei.pervue.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class QlGoodsVo extends Qlgoods{

    // 省
    private String provinceName;

    //市
    private String cityName;

    //区
    private String districtName;

    //促销名
    private String mname;

    //具体
    private String details;

    //最小 价格
    private BigDecimal priceSmall;

    // 最大 价格
    private BigDecimal priceBig;

    private String ids;
}
