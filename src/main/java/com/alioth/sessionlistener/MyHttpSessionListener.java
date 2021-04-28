package com.alioth.sessionlistener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ZhaoYanqi
 * @date 2021/4/21 0021
 */
@Slf4j
public class MyHttpSessionListener implements HttpSessionListener {
    public static int online = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("新的session已创建");
        online++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("session已销毁");
        online--;
    }
}
