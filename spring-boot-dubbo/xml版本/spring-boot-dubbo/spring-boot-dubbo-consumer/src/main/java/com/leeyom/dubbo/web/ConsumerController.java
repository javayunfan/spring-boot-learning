package com.leeyom.dubbo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leeyom.dubbo.api.UserService;
import com.leeyom.dubbo.pojo.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 * @author Leeyom Wang
 * @date 2018年02月07日 11:53
 */
@RestController
public class ConsumerController {

    @Reference
    UserService userService;

    @RequestMapping(value = "/testDubbo")
    public UserEntity testDubbo(Integer userId) {
        return userService.getUserById(userId);
    }
}
