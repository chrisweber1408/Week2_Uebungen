package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week2.Student;
import week2.StudentDB;

public class StudentTest {

    @Test
    void ShouldBeTrueGetName() {
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich", 1);
        //When
        String student1Name = student1.getName();
        //Then
        Assertions.assertEquals("Christoph Weber", student1Name);
    }

    @Test
    void ShouldBeTrueSetAge(){
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich", 2);
        //When
        int student1Age = student1.getAge();
        //Then
        Assertions.assertEquals(30, student1Age);
    }

    @Test
    void ShouldBeTrueSetGender(){
        //Given
        Student student1 = new Student("Christoph Weber", 30, "Männlich", 3);
        //When
        String student1Gender = student1.getGender();
        //Then
        Assertions.assertEquals("Männlich", student1Gender);
    }


    @Test
    void ShouldBeTrueMethod(){
        Student student1 = new Student("Christoph Weber", 30, "Männlich", 4);
        String raus = student1.toStringg();
        Assertions.assertEquals("Christoph Weber 30 Männlich", raus);
    }

    @Test
    void ShouldBeTrueList(){
        Student student1 = new Student("Christoph", 30, "Männlich", 4);
        Student student2 = new Student("Hans", 30, "Männlich", 5);
        Student student3 = new Student("Wurst", 30, "Männlich", 4);
        String raus1 = student1.list();
        String raus2 = student2.list();
        String raus3 = student3.list();
        Assertions.assertEquals("Christoph 30 Männlich 4\nHans 30 Männlich 5\nWurst 30 Männlich 4\n", raus1 + raus2 + raus3);


    }

}
