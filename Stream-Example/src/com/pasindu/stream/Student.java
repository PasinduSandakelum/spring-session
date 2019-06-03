import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    String name;
    LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Pasi",new LocalDate(1993,9,4)));
//        studentList.add(new Student("Pasindu",new Date(1993,9,04)));
//        studentList.add(new Student("Saman",new Date(2003,10,12)));
//        studentList.add(new Student("Suja",new Date(1983,02,25)));
//        studentList.add(new Student("Ishara",new Date(1996,12,23)));
//        studentList.add(new Student("Kanishka",new Date(2005,6,02)));
//        studentList.add(new Student("Sumane",new Date(1992,4,01)));

        return studentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth+
                '}';
    }
}
