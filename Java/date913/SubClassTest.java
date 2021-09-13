package practice.date913;

public class SubClassTest {
    public static void main(String[] args) {
       SubClass s = new SubClass();
//       接口中定义的静态方法，只能通过接口来调用
//       s.method1();
//       SubClass.method1();

        // 通过实现类的对象，可以调用接口中的默认方法
        CompareA.method1();

        s.method2();
        s.method3();
        s.myMethod();
    }
}

class SubClass extends SuperClass implements CompareA,CompareB {

    public void method2() {
        System.out.println("CompareA: 上海");
    }

    public void method3() {
        System.out.println("CompareA: 深圳");
    }

    public void myMethod() {
        method3();//调用自己定义的方法
        super.method3();//调用的是父类中声明的方法

        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }

}
