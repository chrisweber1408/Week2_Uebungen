package week2.Interface;

public class Main {

    public static void main(String[] args) {

        Student student1 = new InformatikStudent("Nicolei");
        Student student2 = new GeschichtsStudent("Christoph");
        Student student3 = new InformatikStudent("Jan");
        Student student4 = new GeschichtsStudent("Dennis");
        Student[] myTestStudents = {student1, student2, student3, student4};

        System.out.println(myTestStudents.toString());


    }

}
