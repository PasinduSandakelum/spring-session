import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessStudents {
    public static void main(String[] args) {
        System.out.println(Student.getStudentList());
        System.out.println();

        System.out.println("Filter age > 18\n");
        List<Student> students = Student.getStudentList().stream()
                .filter(e-> (new Date().getYear() - e.getDateOfBirth().getYear()) > 18)
                .collect(Collectors.toList());
        System.out.println(students);

        System.out.println(new Date());
    }
}
