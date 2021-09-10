package practice.date910;

class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("123456",100);
        System.out.println(a1);
        System.out.println(a2);
    }
}


public class Account {
    private int id;
    private String pwd;
    private double balance;
    private static double interestRate;
    private static int init = 1;

    public Account() {
        id = init++;
        pwd = "000000";
    }

    public Account(String pwd, double balance) {
        this.pwd = pwd;
        this.balance = balance;
    }




    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
