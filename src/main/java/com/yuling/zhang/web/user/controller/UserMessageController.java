package com.yuling.zhang.web.user.controller;

import com.yuling.zhang.web.user.entity.UserMessage;
import com.yuling.zhang.web.user.service.UserMessageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserMessage)表控制层
 *
 * @author makejava
 * @since 2020-03-08 19:08:39
 */
@RestController
@RequestMapping("userMessage")
public class UserMessageController {
    /**
     * 服务对象
     */
    @Resource
    private UserMessageService userMessageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping(value = "selectOne", method = RequestMethod.POST)
    public UserMessage selectOne(@RequestParam("id") Integer id) {
        return this.userMessageService.queryById(id);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public UserMessage add(UserMessage userMessage) {
        return this.userMessageService.insert(userMessage);
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<UserMessage> list(int offset, int limit) {
        return this.userMessageService.queryAllByLimit(offset, limit);
    }

}