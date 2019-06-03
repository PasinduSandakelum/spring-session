import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Employee> employeeList=Employee.getListOfEmployees();

        System.out.println("Filter By contains i  \n");
        List<Employee> employees = employeeList.stream().filter(e -> e.getName().contains("i"))
                .collect(Collectors.toList());

        System.out.println(employees);

        System.out.println("\nFilter By length more than 5 \n");
        List<Employee> employees1 = employeeList.stream().filter(e -> e.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println(employees1);

    }
}
