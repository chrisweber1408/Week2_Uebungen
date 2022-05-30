package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListItemTest {

    @Test
    void shouldAddAnimalToEmptyList() {
        AnimalList animalList = new AnimalList();
        Animal dog = new Animal("Dog");

        animalList.add(dog);

        assertEquals("Dog", animalList.toString());
    }

}
