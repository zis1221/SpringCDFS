package com.example.demo.common;

public class UserEnroll
{
    private String cell;
    private String codenum;
    private String password;
    private String userName;
    public UserEnroll(String cell, String codenum, String password, String userName)
    {
        this.cell = cell;
        this.codenum = codenum;
        this.password = password;
        this.userName = userName;
    }
    public String getCell()
    {
        return cell;
    }
    public void setCell(String cell)
    {
        this.cell = cell;
    }
    public String getCodenum()
    {
        return codenum;
    }
    public void setCodenum(String codenum)
    {
        this.codenum = codenum;
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
