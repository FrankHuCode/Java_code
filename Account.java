package com.itheima.atmsystem;

public class Account {
    //成员变量 私有
    private String cardId;//卡号
    private String userName;//用户名
    private String password;//密码
    private double money;//账户余额
    private  double quotaMoney;//每次取现额度
    //无参构造器默认存在，先不创建有参构造器

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
