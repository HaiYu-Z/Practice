package practice.date911;

/**
 * 抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());// 匿名对象

        // 创建了一个匿名子类的对象：p
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸");
            }
        };
        method1(p);

        System.out.println("----------------");

        // 创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸新鲜空气");
            }
        });

    }
    public static void method1(Person s) {
        s.eat();
        s.breath();
    }

    public static void method(Student s) {

    }
}

class Worker extends Person {

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}
