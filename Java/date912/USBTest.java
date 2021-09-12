package practice.date912;

public class USBTest {
    public static void main(String[] args) {
        Computer c = new Computer();

        // 1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        c.transferDate(flash);

        System.out.println();


        // 2.创建了接口的非匿名实现类的匿名对象
        c.transferDate(new Printer());

        System.out.println();


        // 3.创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        c.transferDate(phone);

        System.out.println();


        // 4.创建了接口的匿名实现类的匿名对象
        c.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });
    }
}

class Computer {
    public void transferDate(USB usb) {
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}

interface USB {
    // 常量：定义了长、宽、最大的传输速度等

    void start();
    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
