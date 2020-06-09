package homework7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    public static class ByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getCourse();
        }
    }

    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return  name +
                ", course: " + course;
    }

    static void printStudents(List<Student> students, int course){
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            if (student.getCourse()==course){
                System.out.println(student.getName());
            }
        }
    }
}
