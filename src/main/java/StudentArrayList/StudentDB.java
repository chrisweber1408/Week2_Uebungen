package StudentArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDB {

    private Map<String, Student> students;

    public StudentDB(List<Student> students) {
        this.students = new HashMap<>();
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public Collection<Student> list() {
        return students.values();
    }

    public Student randomStudent() {
        int index = (int) (Math.random() * students.size());
        return new ArrayList<>(students.values()).get(index);
    }

    @Override
    public String toString() {
        return "[" + students.values().stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    public void add(Student newStudent) {
        if (students.containsKey(newStudent.getId())){
            throw new RuntimeException("Selbe ID");
        }
        students.put(newStudent.getId(), newStudent);
    }

    public void removeById(String id) {
        students.remove(id);
    }
}