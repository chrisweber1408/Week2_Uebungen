package LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalListItemTest {

    @Test
    void shouldAddAnimalToList(){
        //given
        AnimalList animalList = new AnimalList();
        Animal cat = new Animal("Cat");
        //when
        animalList.add(cat);
        //then
        Assertions.assertEquals("Cat", animalList.findLast());


    }

}
