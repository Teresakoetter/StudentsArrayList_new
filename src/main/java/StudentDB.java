import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    //private Student[] students;
    private ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int random = (int)(Math.random() * students.size());
        return students.get(random);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
/* @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + ArrayList.toString(students) +
                '}';
    }*/
}
