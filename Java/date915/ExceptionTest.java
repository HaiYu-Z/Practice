package practice.date915;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {

    // ArithmeticException
    @Test
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    // InputMismatchException
    @Test
    public void test5() {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(scan);
    }

    // NumberFormatException
    @Test
    public void test4() {
        String s = "abc";
        System.out.println(Integer.parseInt(s));
    }

    // ClassCastException
    @Test
    public void test3() {
        Object o = new Date();
        String s = (String) o;
    }

    // IndexOutOfBoundsException
    @Test
    public void test2() {
        // ArrayIndexOutOfBoundsException 数组下标越界
        int[] arr = new int[10];
        System.out.println(arr[10]);
        // StringIndexOutOfBoundsException
        String a = "abc";
        System.out.println(a.charAt(3));
    }

    // NullPointerException 空指针异常
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[0]);
    }
}
