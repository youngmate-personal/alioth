package com.alioth.entity;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author ZhaoYanqi
 * @date 2021/4/28 0028
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
    /** 性别 */
    private String sex;

    /** 爱好 */
    private List<String> hobby;

    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
