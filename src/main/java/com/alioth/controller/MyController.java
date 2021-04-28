package com.alioth.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alioth.sessionlistener.MyHttpSessionListener;

/**
 * @author ZhaoYanqi
 * @date 2021/4/21 0021
 */
@RestController
public class MyController {
    @RequestMapping("/world")
    public String world(HttpSession session) {
        session.setAttribute("userName", "aaa");
        return "Hello SpringBoot!";
    }

    @RequestMapping("/online")
    public String online() {
        return "当前在线人数为：" + MyHttpSessionListener.online + "人";
    }
}
