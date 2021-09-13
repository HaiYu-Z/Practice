package practice.date913;

public class ComparableCircle extends Circle
        implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    // 若返回值是0，代表相等；若为正数，代表当前对象大
    // 负数代表当前对象小
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
//            if (this.getRadius() > c.getRadius()) {
//                return 1;
//            }
//            else if (this.getRadius() < c.getRadius()) {
//                return -1;
//            }
//            else {
//                return 0;
//            }
            return this.getRadius().compareTo(c.getRadius());
        } else {
            return -99999;
        }
    }
}
