public class F8Array {
    public static void main(String[] args) {
        Employee[] employees = Employee.getListOfEmployees().stream().toArray(Employee[]::new);
        System.out.println(employees.toString());
    }
}
