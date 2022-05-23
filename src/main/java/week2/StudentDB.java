package week2;

import java.util.Arrays;
import java.util.Objects;

public class StudentDB {

    private Student[] allMyStudents;

    public StudentDB(Student[] allMyStudents) {
        this.allMyStudents = allMyStudents;
    }

    public Student[] list(){
        return allMyStudents;
    }

    public Student random(){
        int randomIndex = (int) (Math.random()*allMyStudents.length);
        return allMyStudents[randomIndex];
    }

    @Override
    public String toString() {
        return "Unsere Schüler: " + Arrays.toString(allMyStudents);
    }

    public void add(Student studentToAdd) {
        Student[] studArr = new Student[allMyStudents.length+1];
        for (int i = 0; i < allMyStudents.length; i++) {
            studArr[i] = allMyStudents[i];
        }
        studArr[allMyStudents.length] = studentToAdd;
        allMyStudents = studArr;
    }


    public void remove(String removeId) {
        if (!containsId(removeId)){
            System.out.println("Kenn ich nicht");
            return;
        }
        Student[] studArr = new Student[allMyStudents.length-1];
        int counter = 0;
        for (int i = 0; i < studArr.length; i++) {
            if (allMyStudents[i].getId().equals(removeId)){
                counter++;
            }
            studArr[i] = allMyStudents[i+counter];
        }
        allMyStudents = studArr;
    }

    private boolean containsId(String id){
        for (Student s : allMyStudents) {
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}