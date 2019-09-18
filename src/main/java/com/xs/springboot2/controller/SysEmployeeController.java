package com.xs.springboot2.controller;

import com.xs.springboot2.pojo.SysEmployee;
import com.xs.springboot2.service.SysEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SysEmployeeController {
    @Resource
    private SysEmployeeService sysEmployeeService;

    @RequestMapping("/findall")
    public String findEmployee(Model model) {
        List<SysEmployee> list = new ArrayList<>();
        list = sysEmployeeService.findSysEmployee();
        model.addAttribute("list", list);
        return "test";
    }
}
