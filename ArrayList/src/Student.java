public class Student {
    private int studentId;
    private String name;
    private int[] mark;

    public Student(int studentId, String name, int[] mark) {
        this.studentId = studentId;
        this.name = name;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public double calculateTotal(){
        double total = 0;

        for (int i = 0; i < mark.length; i++) {
            total = total + mark[i];
        }return total;
    }

    public double calculateAverage(){
        double average =(double) calculateTotal()/ mark.length;
        return average;
    }

    public String calculateGrade(){
        double average =calculateAverage();

        if (average >= 75) {
            return "A";
        } else if (average >= 65) {
            return "B";
        } else if (average >= 55) {
            return "C";
        } else if (average >= 35) {
            return "S";
        } else {
            return "F";
        }

    }

    public void displayReport() {

        System.out.println("==============================");
        System.out.println("       STUDENT REPORT");
        System.out.println("==============================");

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);

        System.out.println("\nMarks:");

        for (int i = 0; i < mark.length; i++) {

            System.out.println("Subject " + (i + 1) + ": " + mark[i]);
        }

        System.out.println("\nTotal: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());

        System.out.println("==============================");
    }

}
