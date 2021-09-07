package practice.date907;


class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001,"Tom");
        Order o2 = new Order(1001,"To");
        System.out.println(o1.equals(o2));
    }
}

public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Order) {
            Order o = (Order) obj;
            return this.orderName.equals(o.orderName) && this.orderId == o.orderId;
        }
        return false;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
