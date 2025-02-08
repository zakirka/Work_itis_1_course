public class Main {
    public static void main(String[] args){
        Student[] students = new Student[2];
        students[0] = new Student("Zakirov","Azamat","11-404",4);
        students[1] = new Student("Romanov","Slava","11-404",5);
        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}
