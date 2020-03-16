package com.qiaolei.pervue.service.impl;

import com.qiaolei.pervue.entity.Employee;
import com.qiaolei.pervue.mapper.EmployeeMapper;
import com.qiaolei.pervue.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ql
 * @since 2020-03-03
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
