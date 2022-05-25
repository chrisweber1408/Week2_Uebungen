package week2.Interface;


import java.util.Objects;
import java.util.UUID;

public class ComputerScienceStudent implements Student {

    private final BaseStudent baseStudent;

    @Override
    public String getSubject() {
        return "Computer Science";
    }

    public ComputerScienceStudent(String name) {
        baseStudent = new BaseStudent(name);
    }

    @Override
    public String getId() {
        return baseStudent.getId();
    }

    @Override
    public String getName() {
        return baseStudent.getName();
    }

    @Override
    public String toString() {
        return "{name: " + getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent student = (ComputerScienceStudent) o;
        return Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getName());
    }
}