package com.alioth.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alioth.entity.Person;

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

    @RequestMapping("thymeleaf")
    public String thymeleaf(Model map) {
        map.addAttribute("thText", "th:text设置文本内容 <b>加粗</b>");
        map.addAttribute("thUText", "th:utext 设置文本内容 <b>加粗</b>");
        map.addAttribute("thValue", "thValue 设置当前元素的value值");
        map.addAttribute("thEach", "Arrays.asList(\"th:each\", \"遍历列表\")");
        map.addAttribute("thIf", "msg is not null");
        map.addAttribute("thObject", new Person("zhangsan", 12, "男"));
        return "thymeleafDemo";
    }

    @RequestMapping("standardExpression")
    public String standardExpression(ModelMap map) {
        map.addAttribute("Str", "Blog");
        map.addAttribute("Bool", true);
        map.addAttribute("Array", new Integer[] { 1, 2, 3, 4 });
        map.addAttribute("List", Arrays.asList(1, 3, 2, 4, 0));
        Map<String, String> hashMap = new HashMap<>(2);
        hashMap.put("thName", "${#...}");
        hashMap.put("desc", "变量表达式内置方法");
        map.addAttribute("Map", hashMap);
        map.addAttribute("Date", new Date());
        map.addAttribute("Num", 888.888D);
        return "standardExpression";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
