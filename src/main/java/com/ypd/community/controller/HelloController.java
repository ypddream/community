package com.ypd.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:HelloController
 * Package:com.ypd.community.controller
 * Description:TODO
 *
 * @Date:2020/2/7 0007 下午 9:13
 * @author:ypd
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World")String name,
                        Model model) {
        //attributeName 绑定的str 必须与 Thymeleaf模板中获取的变量名称相同
        model.addAttribute("str", name);
        return "hello";
    }
}
