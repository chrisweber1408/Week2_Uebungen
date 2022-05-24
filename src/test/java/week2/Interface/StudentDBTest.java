package week2.Interface;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StudentDBTest {
    @Test
    void shouldReturnAllStudentsWithList(){
        //GIVEN
        Student student1 = new InformatikStudent("Nicolei");
        Student student2 = new GeschichtsStudent("Christoph");
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
        Student student1 = new GeschichtsStudent("Nicolai");
        Student student2 = new InformatikStudent("Christoph");
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
        Student student1 = new InformatikStudent("Nicolai");
        Student student2 = new GeschichtsStudent("Christoph");
        Student student3 = new InformatikStudent("Erik");
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
        Student student1 = new GeschichtsStudent("Nicolai");
        Student student2 = new InformatikStudent("Christoph");
        Student student3 = new GeschichtsStudent("Erik");
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

    @Test
    void shouldTestTheCourses(){
        //GIVEN
        Student student1 = new InformatikStudent("Nicolei");
        Student student2 = new GeschichtsStudent("Christoph");
        Student student3 = new InformatikStudent("Jan");
        Student student4 = new GeschichtsStudent("Dennis");
        Student[] myTestStudents = {student1, student2, student3, student4};

    }
}
