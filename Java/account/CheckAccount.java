package com.test.account;

/**
 * @author HaiYu
 * @version 1.0.0
 * @ClassName CheckAccount.java
 * @Description TODO
 * @Time 2021/8/28 17:45
 */
public class CheckAccount extends Account {
    private double overdraft;//透支额度
    private double overdraftBalance;//透支余额

    public CheckAccount() {
    }
    public CheckAccount(int id, double balance, double annual, double overdraft) {
        super(id, balance, annual);
        this.overdraft = overdraftBalance = overdraft;
    }

    public void showBalance() {
        System.out.println("账户余额：" + getBalance());
        System.out.println("透支余额：" + overdraftBalance);
    }

    public void withdraw (double amount) {
        if (amount <= getBalance() && amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("取款成功");
            showBalance();
        }
        else if (amount > getBalance() &&
                 amount <= (getBalance() + overdraftBalance)) {
            overdraftBalance -= (amount - getBalance());
            setBalance(0);
            System.out.println("取款成功");
            showBalance();
        }
        else if (amount < 0) {
            System.out.println("不能为负数");
        }
        else {
            System.out.println("余额不足");
            showBalance();
        }
    }

    public void deposit (double amount) {
        if (amount >= 0) {
            if (overdraftBalance != overdraft) {
                double tmp = amount;
                tmp -= (overdraft - overdraftBalance);

                if (tmp < 0) {
                    overdraftBalance += amount;
                    System.out.println("存款成功");
                    showBalance();
                }
                else if (tmp == 0) {
                    overdraftBalance = overdraft;
                    System.out.println("存款成功");
                    showBalance();
                }
                else if (tmp > 0) {
                    setBalance(getBalance() + amount - overdraftBalance);
                    overdraftBalance = overdraft;
                    System.out.println("存款成功");
                    showBalance();
                }
            }
            else {
                setBalance(getBalance() + amount);
                System.out.println("存款成功");
                showBalance();
            }
        }
        else {
            System.out.println("不能为负数");
        }

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}