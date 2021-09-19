package project.team.test;

import org.testng.annotations.Test;
import project.team.domain.Employee;
import project.team.service.NameListService;
import project.team.service.TeamException;

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {
        NameListService n = new NameListService();
        Employee[] e = n.getAllEmployees();
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    @Test
    public void testGetEmployees() {
        NameListService n = new NameListService();
        try {
            Employee e = n.getEmployees(13);
            System.out.println(e);
        } catch (TeamException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
