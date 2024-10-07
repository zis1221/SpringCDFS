package com.example.demo.common;

public class UserLogin
{
    public String userName;
    private String password;
    public UserLogin(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
