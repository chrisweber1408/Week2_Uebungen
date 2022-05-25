package week2.Interface;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student[] actual = studentDB.list();

        // then
        Assertions.assertArrayEquals(students, actual);
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.randomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        assertEquals("[{name: André Schreck}, {name: Thomas Kittlaus}]", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student newStudent = new HistoryStudent("Thomas Kittlaus");
        studentDB.add(newStudent);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { students[0], newStudent };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.removeByIndex(0);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {students[1]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.removeByIndex(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {students[0]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Max Mustermann"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.removeByIndex(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {students[0], students[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudentById() {
        // given
        Student[] students = { new ComputerScienceStudent("André Schreck"), new HistoryStudent("Max Mustermann"), new HistoryStudent("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.removeById(students[1].getId());
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {students[0], students[2]};
        assertArrayEquals(expected, actual);
    }

}