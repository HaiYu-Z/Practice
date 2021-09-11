package practice.date911;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person1.desc;
        Person1 p = new Person1();
    }
}

class Person1 {
    String name;
    int age;
    static String desc = "我是一个人";

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 静态代码块
    // 随着类的加载而执行，而且只执行一次
    static {
        System.out.println("Hello, static block");
    }

    // 非静态代码块
    // 随着对象的创建而执行
    // 每创建一个对象，就执行一次非静态代码块
    {
        System.out.println("Hello, block");
    }




    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
