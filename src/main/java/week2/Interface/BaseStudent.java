package week2.Interface;

import java.util.UUID;

class BaseStudent {

    private final String id = UUID.randomUUID().toString();
    private final String name;

    public BaseStudent(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}