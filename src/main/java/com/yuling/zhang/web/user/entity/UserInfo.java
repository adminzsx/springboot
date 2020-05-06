package com.yuling.zhang.web.user.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer id;

    private String userName;

    private String userAccount;

    private String password;

    private Date createTiem;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Date createTiem) {
        this.createTiem = createTiem;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", password='" + password + '\'' +
                ", createTiem=" + createTiem +
                '}';
    }
}