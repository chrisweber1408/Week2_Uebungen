package week2;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StudentDBTest {
    @Test
    void shouldReturnAllStudentsWithList(){
        //GIVEN
        Student student1 = new Student("Nicolei");
        Student student2 = new Student("Christoph");
        Student[] myTestStudents ={student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        Student[] actual = testDb.list();
        //THEN
        assertArrayEquals(myTestStudents,actual);
    }
    @Test
    void shouldReturnString(){
        //GIVEN
        Student student1 = new Student("Nicolai");
        Student student2 = new Student("Christoph");
        String stu1id = student1.getId();
        String stu2id = student2.getId();
        Student[] myTestStudents ={student1,student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        String expected = "Unsere Schüler: [ID:"+stu1id+" Name: Nicolai , ID:"+stu2id+" Name: Christoph ]";
        //WHEN
        String actual = testDb.toString();
        //THEN
        assertEquals(expected,actual);
    }


    @Test
    void shouldAddNewStudentToDB(){
        //GIVEN
        Student student1 = new Student("Nicolai");
        Student student2 = new Student("Christoph");
        Student student3 = new Student("Erik");
        Student[] myTestStudents ={student1,student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.add(student3);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(3,actual.length);
        Student newStudent = actual[2];
        assertEquals("Erik",newStudent.getName());
    }

    @Test
    void shouldRemoveStudentFromDB(){
        //GIVEN
        Student student1 = new Student("Nicolai");
        Student student2 = new Student("Christoph");
        Student student3 = new Student("Erik");
        String removeId = student2.getId();
        Student[] myTestStudents ={student1,student2,student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.remove(removeId);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(2,actual.length);
        assertNotEquals("Christoph", actual[0].getName());
        assertNotEquals("Christoph", actual[1].getName());

    }
}
