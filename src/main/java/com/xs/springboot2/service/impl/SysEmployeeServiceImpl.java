package com.xs.springboot2.service.impl;

import com.xs.springboot2.mapper.SysEmployeeMapper;
import com.xs.springboot2.pojo.SysEmployee;
import com.xs.springboot2.service.SysEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysEmployeeServiceImpl implements SysEmployeeService {

    @Resource
    private SysEmployeeMapper sysEmployeeMapper;

    @Override
    public List<SysEmployee> findSysEmployee() {
        return sysEmployeeMapper.findSysEmployee();
    }
}

