package week2.Interface;


import java.util.Objects;
import java.util.UUID;

public class HistoryStudent implements Student {

    private final String id = UUID.randomUUID().toString();
    private final String name;

    public HistoryStudent(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return "History";
    }

    @Override
    public String toString() {
        return "{name: " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent student = (HistoryStudent) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}