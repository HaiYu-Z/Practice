package practice.date913;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(5);
        System.out.println(c1.compareTo(c2));
    }
}
