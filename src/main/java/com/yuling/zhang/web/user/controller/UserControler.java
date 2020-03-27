package com.yuling.zhang.web.user.controller;

import com.yuling.zhang.web.user.entity.UserInfo;
import com.yuling.zhang.web.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangshixiang
 * @date 2020-03-04 15:17
 */
@RestController
@RequestMapping("/user")
public class UserControler {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<UserInfo> getAllUser() {
        List<UserInfo> list = userService.getAllUser();
        return list;
    }
}
