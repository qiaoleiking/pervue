package com.qiaolei.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiaolei.pervue.entity.QlGoodsVo;
import com.qiaolei.pervue.entity.Qlgoods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ql
 * @since 2020-03-14
 */
public interface QlgoodsMapper extends BaseMapper<Qlgoods> {
    /**
     *
     * @param page  列表
     * @param vo
     * @return
     */
    IPage<QlGoodsVo> selectGoodsList(Page page, QlGoodsVo vo);

}
