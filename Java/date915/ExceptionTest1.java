package practice.date915;

import org.testng.annotations.Test;

public class ExceptionTest1 {

    @Test
    public void test1() {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello --- 1");
        }
        catch(NumberFormatException e) {
            // System.out.println("出现了数值转换异常");

            // 1. System.out.println(e.getMessage());
            // 2.
            e.printStackTrace();
        }

        System.out.println("hello --- 2");
    }
}
