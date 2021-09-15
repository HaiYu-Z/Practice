package practice.date915;

public class StudentTest {
    public static void main(String[] args) {

        try {
            Student s = new Student();
            s.register(-1001);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student {
    private int id;

    public void register(int id) throws Exception{
        if (id > 0) {
            this.id = id;
        } else {
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
