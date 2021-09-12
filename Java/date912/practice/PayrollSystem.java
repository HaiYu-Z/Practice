package practice.date912.practice;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("马森",1001,
                new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("潘雨生",2001,
                new MyDate(1991,6,7),60,240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);
        }
    }
}
