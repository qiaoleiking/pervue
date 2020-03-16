package com.qiaolei.pervue.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.qiaolei.pervue.entity.User_role;
import com.qiaolei.pervue.mapper.User_roleMapper;
import com.qiaolei.pervue.service.IUser_roleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@Service
public class User_roleServiceImpl extends ServiceImpl<User_roleMapper, User_role> implements IUser_roleService {


    @Autowired
    private User_roleMapper user_roleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertBatch(Integer[] rids,Integer uid) throws Exception{
        //先删除
        QueryWrapper queryWrapper = Wrappers.query();
        queryWrapper.eq("uid",uid);
        user_roleMapper.delete(queryWrapper);


       // int i = 1/0;

        //执行保存
        if(rids != null && rids.length > 0 ){
            for (Integer rid:rids
            ) {
                //创建用户角色对象
                User_role user_role = new User_role();
                //设置用户的id值
                user_role.setUid(uid);
                //设置用户的角色id值
                user_role.setRid(rid);
                //加入到集合中
                user_roleMapper.insert(user_role);
            }
        }
    }
}
