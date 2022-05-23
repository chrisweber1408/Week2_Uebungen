package week2;
import week2.Student;
import week2.StudentDB;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Christoph", 30, "Männlich", 4);

        System.out.println(student1.list());

    }

}
