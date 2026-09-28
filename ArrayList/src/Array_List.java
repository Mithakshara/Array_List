import java.util.ArrayList;
public class Array_List {

    static Student findStudent(ArrayList<Student> student, int id){

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == id){
                return student.get(i);
            }

        }

        return null;
    }

    public static void main(String[] args) {
        int[] marks1 = {75, 80, 65};
        int[] marks2 = {90, 85, 78};
        int[] marks3 = {55, 60, 70};

        Student student1 = new Student(1001, "Dilshan", marks1);
        Student student2 = new Student(1002, "Kamal", marks2);
        Student student3 = new Student(1003, "Nimal", marks3);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

    Student child = findStudent(students , 1003);
            if (child != null){
                child.displayReport();
            }
            else {
                System.out.println("Student not found");
            }




//        for (int i = 0; i < students.size(); i++) {
//            students.get(i).getStudentId();
//        }

    }
}




