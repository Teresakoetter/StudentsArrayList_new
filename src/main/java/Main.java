import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Student student1 = new Student("123", "Florian");
        //Student student2 = new Student("456", "Matthias");

        /*Student[] allStudents = new Student[2];

        allStudents[0] = student1;
        allStudents[1] = student2;*/

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(0,new Student("123","Florian"));
        allStudents.add(0,new Student("456","Mattthias"));





        StudentDB studentDB = new StudentDB(allStudents);

        System.out.println(studentDB);
        System.out.println(studentDB.getAllStudents());
        System.out.println(studentDB.randomStudent());
    }
}
