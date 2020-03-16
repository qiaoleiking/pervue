package com.qiaolei.pervue.service;

import com.qiaolei.pervue.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaolei.pervue.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
public interface INationService extends IService<Nation> {

    List<NationVo> findAll();

}
