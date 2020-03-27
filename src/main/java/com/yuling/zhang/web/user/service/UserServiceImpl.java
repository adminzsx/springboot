package com.yuling.zhang.web.user.service;

import com.yuling.zhang.web.user.entity.UserInfo;
import com.yuling.zhang.web.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshixiang
 * @date 2020-03-04 15:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUser() {
        List<UserInfo> list=userInfoMapper.selectAll();
        return list;
    }
}
