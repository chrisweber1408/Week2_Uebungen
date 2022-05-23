package week2;

public class Student {
        private String name = "Name";
        private int age = 0;
        private String gender = "Geschlecht";
        private int id = 0;

    public Student(String name, int age, String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
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

        public String toStringg(){
            return name + " " + age + " " + gender;
        }

    public String list(){
        return name + " " + age + " " + gender + " " + id + "\n";
    }
}



