package com.qiaolei.pervue.service.impl;

import com.qiaolei.pervue.entity.Nation;
import com.qiaolei.pervue.entity.NationVo;
import com.qiaolei.pervue.mapper.NationMapper;
import com.qiaolei.pervue.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Autowired
    private NationMapper nationMapper;

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Override
    public List<NationVo> findAll() {

  //      List<NationVo> adress_list = redisTemplate.opsForList().range("adress_list", 0, -1);

//        if (adress_list.size() != 0 && adress_list != null) {
//            System.err.println("redis中查询");
//            return adress_list;
//        } else {
//            System.err.println("MySQl中查询");
        //List<NationVo> nationvoList = nationMapper.findAll();
//          redisTemplate.opsForList().leftPushAll("adress_list",nationvoList.toArray());
            return nationMapper.findAll();
 //      }
    }
}
