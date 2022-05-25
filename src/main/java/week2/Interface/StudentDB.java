package week2.Interface;


import java.util.Arrays;
import java.util.stream.Collectors;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    public Student randomStudent() {
        int index = (int) (Math.random() * students.length);
        return students[index];
    }

    @Override
    public String toString() {
        return "[" + Arrays.stream(students).map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    public void add(Student newStudent) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = newStudent;
        students = newStudents;
    }

    public void removeByIndex(int index) {
        Student[] newStudents = new Student[students.length - 1];
        System.arraycopy(students, 0, newStudents, 0, index);
        System.arraycopy(students, index + 1, newStudents, index, students.length - (index + 1));
        students = newStudents;
    }

    public void removeById(String id) {
        int index = findIndex(id);
        if (index >= 0) {
            removeByIndex(index);
        }
    }

    private int findIndex(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}