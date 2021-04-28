package com.alioth;

import lombok.Data;

/**
 * @author ZhaoYanqi
 * @date 2021/4/22 0022
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
