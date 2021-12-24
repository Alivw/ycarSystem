package com.darksnow.bean;

public class Tuser {
    private  Integer id;
    private  String userName;
    private  String password;
    private  String trueName;

    public Tuser(Integer id, String userName, String password, String trueName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.trueName = trueName;
    }

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
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", trueName='" + trueName + '\'' +
                '}';
    }
}
