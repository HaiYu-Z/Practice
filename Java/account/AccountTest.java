package com.test.account;

/**
 * @author HaiYu
 * @version 1.0.0
 * @ClassName AccountTest.java
 * @Description TODO
 * @Time 2021/8/28 17:39
 */
public class AccountTest {
    public static void main(String[] args){
        CheckAccount ca = new CheckAccount(100,3000,0.045,2000);
        ca.showBalance();
        ca.withdraw(4000);
        ca.deposit(0);
    }
}
