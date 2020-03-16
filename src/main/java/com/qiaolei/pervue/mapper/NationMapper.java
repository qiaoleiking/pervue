package com.qiaolei.pervue.mapper;

import com.qiaolei.pervue.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiaolei.pervue.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface NationMapper extends BaseMapper<Nation> {

    List<NationVo> findAll();

}
