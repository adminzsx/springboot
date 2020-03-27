package com.yuling.zhang.web.user.service;

import com.yuling.zhang.web.user.entity.UserInfo;

import java.util.List;

/**
 * @author zhangshixiang
 * @date 2020-03-04 15:18
 */
public interface UserService {

    /**
     * 取所有用户集合
     *
     * @return
     */
    List<UserInfo> getAllUser();
}
