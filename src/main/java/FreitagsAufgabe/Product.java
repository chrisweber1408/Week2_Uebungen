package FreitagsAufgabe;

import java.util.UUID;

public class Product {

    private UUID id = UUID.randomUUID();
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
