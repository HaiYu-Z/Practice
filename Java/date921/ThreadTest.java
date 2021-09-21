package practice.date921;

/**
 * @Description 多线程的创建，方式一：继承于Thread类
 * @ClassName ThreadTest
 * @Author HaiYu
 * @Date 2021/9/21 18:08
 * @Version 1.0
 */

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        MyThread t2 = new MyThread();
//        t2.start();

        // 创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    }
                }
            }
        }.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + "Hello World");
        }

    }
}
