package practice.date921;

/**
 * @Description
 * @ClassName ThreadMethodTest
 * @Author HaiYu
 * @Date 2021/9/21 21:06
 * @Version 1.0
 */

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);

            }
//            if (i % 20 == 0) {
//                 Thread.yield();
//            }
        }
    }

    public MyThread1(String name) {
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1("Thread: 1");
        //m1.setName("线程一");
        m1.start();



        // 给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
            if (i == 20) {
                try {
                    m1.join();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
