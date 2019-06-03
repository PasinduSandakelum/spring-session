import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F5Sort {
    public static void main(String[] args) {
        List<Employee> sortedEmployee=Employee.getListOfEmployees().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee);

        List<Employee> sortedEmployee1=Employee.getListOfEmployees().stream()
                .sorted(Comparator.comparing(Employee::getMarks))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee1);

        List<Employee> sortedEmployee2=Employee.getListOfEmployees().stream()
                .sorted((e1,e2)-> e1.getMarks().compareTo(e2.getMarks()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee2);

        List<Employee> sortedEmployee3=Employee.getListOfEmployees().stream()
                .sorted((e1,e2)-> new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee3);

        List<Employee> sortedEmployee4=Employee.getListOfEmployees().stream()
                .sorted((e1,e2)-> -new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee4);
    }
}
