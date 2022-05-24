package week2;

import java.util.Arrays;
import java.util.UUID;

public class GeschichtsStudent implements Student{

    private String name;
    private String id = UUID.randomUUID().toString();
    public GeschichtsStudent(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCourse() {
        return "Geschichts Kurs";
    }

    @Override
    public String toString(){
        return "ID:" + id + " Name: " +  name + " ";
    }


}
