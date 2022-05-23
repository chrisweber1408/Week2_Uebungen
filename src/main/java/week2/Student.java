package week2;

public class Student {
        private String name = "Name";
        private int age = 0;
        private String gender = "Geschlecht";

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getGender(){
            return gender;
        }

        public String toString(String name, int age, String gender){
            return name + " " + age + " " + gender;
        }
}



