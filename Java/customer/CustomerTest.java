package com.test.customer;

import java.util.Scanner;

/**
 * @author HaiYu
 * @version 1.0.0
 * @ClassName CustomerTest.java
 * @Description TODO
 * @Time 2021/8/26 14:12
 */
public class CustomerTest {
    public static void main(String[] args) {
        CustomerList cusList = new CustomerList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("请选择：");
            int input = sc.nextInt();
            switch (input) {

                case 1: {
                    cusList.addCustomer();
                    break;
                }


                case 2: {
                    System.out.print("请输入要删除客户的名字：");
                    String name = sc.next();
                    boolean ret = cusList.deleteCustomer(name);
                    if (ret == false) {
                        System.out.println("删除失败！没有这个客户");
                    } else {
                        System.out.println("删除成功\n");
                    }
                    break;
                }


                case 3: {
                    System.out.print("请输入要查找客户的名字：");
                    String name = sc.next();
                    int index = cusList.searchCustomer(name);
                    if (index == -1) {
                        System.out.println("没有这个客户！");
                    } else {
                        cusList.getCustomer(index);
                    }
                    break;
                }


                case 4: {
                    System.out.print("请输入要修改客户的名字：");
                    String name = sc.next();
                    boolean ret = cusList.replaceCustomer(name);
                    if (ret == false) {
                        System.out.println("修改失败！没有这个客户");
                    } else {
                        System.out.println("修改成功\n");
                    }
                    break;
                }


                case 5: {
                    cusList.showCustomers();
                    break;
                }


                case 0:
                    break;
                default:
                    System.out.println("选择错误！");
                    break;
            }
            if (input == 0) {
                break;
            }
        }

    }

    public static void menu() {
        System.out.println("-----------客户信息管理软件----------");
        System.out.println();
        System.out.println("           1. 添加客户信息");
        System.out.println("           2. 删除客户信息");
        System.out.println("           3. 查找客户信息");
        System.out.println("           4. 修改客户信息");
        System.out.println("           5. 客户列表");
        //System.out.println("           6. 列表排序");
        System.out.println("           0. 退出");
        System.out.println("------------------------------------");
    }

}
