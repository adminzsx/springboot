package com.yuling.zhang.web.user.entity;

import java.io.Serializable;

/**
 * (UserMessage)实体类
 *
 * @author makejava
 * @since 2020-03-08 19:05:55
 */
public class UserMessage implements Serializable {
    private static final long serialVersionUID = 808524056477636490L;
    
    private Integer id;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 信息
    */
    private String message;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}