package practice.date913;

public class InnerClassTest {
    public static void main(String[] args) {
        // 创建Dog实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();

        // 创建Bird实例（非静态的成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println();

        bird.display("黄鹂");
    }
}

class Person {

    String name = "小明";
    int age;

    public void eat() {
        System.out.println("人，吃饭");
    }

    //静态成员内部类
    static class Dog {
        String name;
        int age;

        public void show() {
            System.out.println("卡拉是条狗");
        }
    }

    //非静态成员内部类
    class Bird {
        String name = "杜鹃";

        public void sing() {
            System.out.println("我是一只小小鸟");
            Person.this.eat();// 调用外部类的非静态属性
        }

        public void display(String name) {
            System.out.println(name);// 方法的形参
            System.out.println(this.name);// 内部类的属性
            System.out.println(Person.this.name);// 外部类的属性
        }
    }

    public void method() {
        //局部内部类
        class AA {

        }
    }

    {
        //局部内部类
        class BB {

        }
    }

    public Person() {
        //局部内部类
        class CC {

        }
    }
}
