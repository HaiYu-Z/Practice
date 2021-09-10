package practice.date907;
import org.testng.annotations.Test;
public class WrapperTest {

    @Test
    public void test() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2);

        Float f1 = new Float(12.3f);
        System.out.println(f1);

        Boolean b1 = new Boolean("true123");
        System.out.println(b1);

        System.out.println("----------------");

        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        float f = f1.floatValue();
        System.out.println(f);
    }

    // String类型 ---> 基本数据类型、包装类：
    // 调用包装类的parseXxx()
    @Test
    public void test1() {
        String str1 = "123";
        int i = Integer.parseInt(str1);
        System.out.println(i + 1);

        String str2 = "true1";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b);
    }

    // 基本数据类型、包装类 ---> String类型
    // 调用String重载的valueOf(Xxx xxx)
    @Test
    public void test2() {
        int num1 = 10;
        String str1 = String.valueOf(num1);
        System.out.println(str1 + 1);

        double b1 = 3.14;
        String str2 = String.valueOf(b1);
        System.out.println(str2);
    }
}
