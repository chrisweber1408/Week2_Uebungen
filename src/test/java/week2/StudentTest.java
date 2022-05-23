package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week2.Student;

public class StudentTest {

    @Test
    void ShouldBeTrueSetName() {
        //Given
        Student student1 = new Student();
        //When
        student1.setName("Christoph Weber");
        String student1Name = student1.getName();
        //Then
        Assertions.assertEquals("Christoph Weber", student1Name);
    }

    @Test
    void ShouldBeTrueSetAge(){
        Student student1 = new Student();
        student1.setAge(30);
        int studentAge = student1.getAge();
        Assertions.assertEquals(30,studentAge);
    }

    @Test
    void ShouldBeTrueSetGender(){
        Student student1 = new Student();
        student1.setGender("Männlich");
        String studentGender = student1.getGender();
        Assertions.assertEquals("Männlich", studentGender);

    }

}
