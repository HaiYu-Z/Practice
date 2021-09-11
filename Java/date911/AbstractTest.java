package practice.date911;

public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象了，就不可实例化
//        Person p1 = new Person();
//        p1.eat();
    }
}

abstract class Creature {
    public abstract void breath();
}

abstract class Person extends Creature {
    String name;
    int age;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("人走路");
    }
}

class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name,age);
    }

    public void eat() {
        System.out.println();
    }

    @Override
    public void breath() {

    }
}
