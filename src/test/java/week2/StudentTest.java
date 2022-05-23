package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week2.Student;

public class StudentTest {

    @Test
    void ShouldBeTrueGetName() {
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich");
        //When
        String student1Name = student1.getName();
        //Then
        Assertions.assertEquals("Christoph Weber", student1Name);
    }

    @Test
    void ShouldBeTrueSetAge(){
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich");
        //When
        int student1Age = student1.getAge();
        //Then
        Assertions.assertEquals(30, student1Age);
    }

    @Test
    void ShouldBeTrueSetGender(){
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich");
        //When
        String student1Gender = student1.getGender();
        //Then
        Assertions.assertEquals("Männlich", student1Gender);
    }

}
