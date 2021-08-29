package com.test.account;

/**
 * @author HaiYu
 * @version 1.0.0
 * @ClassName Account.java
 * @Description TODO
 * @Time 2021/8/28 17:17
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annual;//年利率

    public Account() {}
    public Account(int id, double balance, double annual) {
        this.id = id;
        this.balance = balance;
        this.annual = annual;
    }


    public double getMonthlyInterest() {
        return annual / 12;
    }

    public void withdraw (double amount) {
        if (amount <= balance & amount >= 0) {
            balance -= amount;
            System.out.println("取款成功");
            System.out.println("账户余额：" + balance);
        }
        else if (amount < 0) {
            System.out.println("不能为负数");
        }
        else {
            System.out.println("余额不足");
            System.out.println("账户余额：" + balance);
        }
    }

    public void deposit (double amount) {
        if (amount < 0) {
            System.out.println("不能为负数");
        }
        else {
            balance += amount;
            System.out.println("存款成功");
            System.out.println("账户余额：" + balance);
        }
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnual() {
        return annual;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }
}
