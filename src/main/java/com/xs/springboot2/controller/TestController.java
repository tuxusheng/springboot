package com.xs.springboot2.controller;

import com.xs.springboot2.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("我尽量来了");
        return "map";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        System.out.println("你还要我怎么");
        model.addAttribute("hello", "");
        model.addAttribute("user", "涂旭胜");
        return "success";
    }

    @RequestMapping("/UserTest")
    public String UserTest(Model model) {
        User user = new User();
        user.setPassword("123");
        user.setUsername("涂旭胜");
        model.addAttribute("user2", user);
        model.addAttribute("s1", "<button value='哈哈哈'/>");
        return "success";
    }

    @RequestMapping("/requestList")
    public String getList(Model model) {
        List<User> listu = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setUsername("涂旭胜");
        user2.setUsername("哈哈哈");
        user3.setUsername("呵呵呵");
        listu.add(user1);
        listu.add(user2);
        listu.add(user3);
//        String s = "abc";
//        s=s+"add";
//        String a="abc";
//        Integer a = 1;
//        Integer b = 1;
//        System.out.println(b == a);
        model.addAttribute("list", listu);
        return "success";
    }


}
