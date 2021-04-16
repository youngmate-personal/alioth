package com.alioth.annotation;

import java.lang.annotation.*;

/**
 * @author ZhaoYanqi
 * @date 2021/4/16 0016
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
}

@MyAnnotation
class Test {
    @MyAnnotation
    private String text;

    @MyAnnotation
    void getText() {

    }
}
