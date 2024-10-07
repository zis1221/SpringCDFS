package com.example.demo.pojo;

public class Uers01 {
    private int id;
    private String userName;
    private String cell;
    private String password;
    private Uers01(int id, String userName, String cell, String password){
        this.id = id;
        this.userName = userName;
        this.cell = cell;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCell() {
        return cell;
    }
    public void setCell(String cell) {
        this.cell = cell;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Uers01 [id=" + id + ", userName=" + userName + ", cell=" + cell + ", password=" + password + "]";
    }
}
