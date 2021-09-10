package practice.date910;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);


    }
}
//饿汉式
class Bank {
    private int id = 1;

    private Bank() {

    }

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
