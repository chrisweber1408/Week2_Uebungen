package StudentArrayListTest;


import StudentArrayList.Student;
import StudentArrayList.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        List<Student> students = List.of(new Student("André Schreck"), new Student("Thomas Kittlaus"));
        StudentDB studentDB = new StudentDB(students);

        // when
        Collection<Student> actual = studentDB.list();

        // then
        Assertions.assertEquals(2, actual.size());
        Assertions.assertTrue(actual.containsAll(students));
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        List<Student> students = List.of(new Student("André Schreck"), new Student("Thomas Kittlaus"));
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.randomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    @Disabled("Der Test macht so jetzt eigentlich keinen Sinn mehr")
    void shouldReturnStringRepresentation() {
        // given
        List<Student> students = List.of(new Student("André Schreck"), new Student("Thomas Kittlaus"));
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        assertEquals("[{name: André Schreck}, {name: Thomas Kittlaus}]", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        List<Student> students = List.of(new Student("André Schreck"));
        StudentDB studentDB = new StudentDB(students);

        // when
        Student newStudent = new Student("Thomas Kittlaus");
        studentDB.add(newStudent);
        Collection<Student> actual = List.copyOf(studentDB.list());

        // then
        List<Student> expected = List.of(students.get(0), newStudent);

        Assertions.assertEquals(2, actual.size());
        Assertions.assertTrue(actual.containsAll(expected));
    }

    @Test
    void shouldRemoveIntermediateStudentById() {
        // given
        List<Student> students = List.of(new Student("André Schreck"), new Student("Max Mustermann"), new Student("Thomas Kittlaus"));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.removeById(students.get(1).getId());
        Collection<Student> actual = List.copyOf(studentDB.list());

        // then
        List<Student> expected = List.of(students.get(0), students.get(2));

        Assertions.assertEquals(2, actual.size());
        Assertions.assertTrue(actual.containsAll(expected));
    }

    @Test
    void shouldTryCatchBecauseSameID(){
        List<Student> students = List.of(new Student("Hans"));
        StudentDB studentDB = new StudentDB(students);

        Student newStudent = new Student("Günther");
        studentDB.add(newStudent);

        try {
            studentDB.add(newStudent);
            fail();
        } catch (RuntimeException e){

        }

    }


}