package practice.date915;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SuperClass());
    }

    public void display(SuperClass s) {
        try {
            s.method();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {
    public void method() throws IOException {

    }
}

class SUbClass extends SuperClass {
    public void method() throws FileNotFoundException {

    }
}
