package L02;

import java.util.Arrays;

public class Student {

        String name;
        String l_name;
        String age;
        String id;
        String year;
        int[] gradeStudent;


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getL_name() {
                return l_name;
        }

        public void setL_name(String l_name) {
                this.l_name = l_name;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {

                this.age = age;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getYear() {
                return year;
        }

        public void setYear(String year) {
                this.year = year;
        }

        public int[] getGradeStudent() {
                return gradeStudent;
        }

        public void setGradeStudent(int[] gradeStudent) {
                this.gradeStudent = gradeStudent;
        }

        public Student() {

        }
        public Student(String name, String l_name, String id) {
                setName(name);
                this.l_name = l_name;
                this.id = id;
        }

        @Override
        public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", l_name='" + l_name + '\'' +
                        ", age='" + age + '\'' +
                        ", id='" + id + '\'' +
                        ", year='" + year + '\'' +
                        ", gradeStudent=" + Arrays.toString(gradeStudent) +
                        '}';
        }
}
