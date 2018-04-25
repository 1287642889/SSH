package com.wzf.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    //设置属性的set方法，才能接受传过来的name值
    //设置属性的get方法，才能在跳转的页面获取该属性值
    private String userName;
    private String password;


    public String login(){
        System.out.println(userName+"----"+password);
        return SUCCESS;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
