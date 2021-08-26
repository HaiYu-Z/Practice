package com.test.customer;

import java.util.Scanner;

public class CustomerList {
    private Customer[] cus;// 用来保存客户对象的数组
    private int total;// 记录已保存客户对象的数量
    private int capacity;//记录数组最大容量

    Scanner sc = new Scanner(System.in);
    public CustomerList() {
        cus = new Customer[5];
        capacity = 5;
    }

    private void Capacity() {
        Customer[] newcus = new Customer[capacity * 2];
        for (int i = 0; i < cus.length; i++) {
            newcus[i] = cus[i];
        }
        capacity *= 2;
        cus = newcus;
    }
    
    public void addCustomer() {
        if (total == capacity) {
            Capacity();
        }


        Customer newcus = new Customer();
        System.out.print("请输入名字：");
        newcus.setName(sc.next());
        System.out.print("请输入性别：");
        newcus.setGender(sc.next().charAt(0));
        System.out.print("请输入年龄：");
        newcus.setAge(sc.nextInt());
        System.out.print("请输入电话：");
        newcus.setPhone(sc.next());
        System.out.print("请输入邮件地址：");
        newcus.setEmail(sc.next());

        cus[total++] = newcus;

    }

//    public String judgeNull(String name) {
//        String str = "";
//        if (sc.hasNext("")) {
//            str = sc.next();
//        }
//        return str.equals("") ? name : str;
//    }

    //修改指定索引客户
    public boolean replaceCustomer(String name) {
        int index = searchCustomer(name);
        if (index == -1) {
            return false;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的名字：");
        cus[index].setName(sc.next());
//        cus[index].setName(judgeNull(cus[index].getName()));

        System.out.print("请输入要修改的性别：");
        cus[index].setGender(sc.next().charAt(0));

        System.out.print("请输入要修改的年龄：");
        cus[index].setAge(sc.nextInt());

        System.out.print("请输入要修改的电话：");
        cus[index].setPhone(sc.next());
        System.out.print("请输入要修改的邮件地址：");
        cus[index].setEmail(sc.next());

        return true;
    }

    public boolean deleteCustomer(String name) {
        int ret = searchCustomer(name);
        if (ret == -1) {
            return false;
        }
        for(int i = ret; i < total - 1; i++) {
            cus[i] = cus[i + 1];
        }
        total--;
        return true;
    }

//    public void getAllCustomers() {
//
//    }

    public int searchCustomer(String name) {
        for (int i = 0; i < total; i++) {
            if(cus[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void getCustomer(int index) {
        System.out.println("\n\n--------------客户列表--------------");
        System.out.println("姓名" + "\t" +
                "性别" + "\t" +
                "年龄" + "\t" +
                "电话" + "\t\t" +
                "邮件");
        System.out.println(cus[index]);
        System.out.println("------------------------------------\n\n");
    }

    public void showCustomers() {
        System.out.println("\n\n--------------客户列表--------------");
        if (total == 0) {
            System.out.println("\n客户列表为空\n");
        }


        System.out.println("姓名" + "\t" +
                "性别" + "\t" +
                "年龄" + "\t" +
                "电话" + "\t\t" +
                "邮件");
        for (int i = 0; i < total; i++) {
            System.out.println(cus[i]);
        }
        System.out.println("------------------------------------\n\n");
    }

    public int getTotal() {
        return total;
    }
}
