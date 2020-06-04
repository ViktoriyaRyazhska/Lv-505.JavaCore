package Lesson7Homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    //method printStudents (List students, Integer course), which receives a list of students
// and the course number and prints to the console the names of the students from the list,
// which are taught in this course (use an iterator)
    public String printStudents(List<Student> Studentlist, int course) {

        String s = "";
        Iterator<Student> iterator = Studentlist.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
           // System.out.println(current);
            if (current.getCourse() == course) {
                System.out.println(current.getName());
                s = s + " " + current.getName();
            }
        }
        return s;
    }

    //THE SAME TASK With the  USUAL FOR

      /*String list = "";
        for (int i = 0; i < Studentlist.size(); i++) {
            if (Studentlist.get(i).getCourse() == course) {
                System.out.println(Studentlist.get(i).getName());
                list = list + Studentlist.get(i).getName();

            }
        }

        return list;
    }
*/

    public static class byName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class byCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getCourse());
    }
}
