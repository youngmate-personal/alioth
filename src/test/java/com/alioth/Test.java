package com.alioth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZhaoYanqi
 * @date 2021/4/22 0022
 */
public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User(1993L, "young", 27);
        User user2 = new User(2001L, "young", 19);
        User user3 = new User(1997L, "young", 23);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users.toString());
        System.out.println(users.stream().min(Comparator.comparing(User::getAge)).get().getAge());
        users = users.stream().sorted(Comparator.comparing(User::getId).reversed()).collect(Collectors.toList());
        System.out.println(users.toString());

    }

}
