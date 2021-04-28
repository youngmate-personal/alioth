package com.alioth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhaoYanqi
 * @date 2021/4/28 0028
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "你好，thymeleaf~");
        return "Hello";
    }
}
