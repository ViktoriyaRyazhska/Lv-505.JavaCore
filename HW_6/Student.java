package HW_6;

import java.util.Iterator;
import java.util.List;

public class Student {
 private String name;
 private int course;

 Student(String name, int course) {
  this.name = name;
  this.course = course;
 }
 
 Student(){
  
 }
 
 public String getName() {
  return name;
 }

 public int getCourse() {
  return course;
 }
 
 public void printStudents(List student,Integer course) {
  Iterator it =student.iterator();
  while(it.hasNext()) {
   Student tmp = new Student(null, 0);
   tmp = (Student) it.next();
   if(tmp.course==course) {
    System.out.println(tmp);
   }
  }
 }
 
 
 @Override
 public String toString() {
  return "name is : " + this.name + " "  +"course is : " + this.course;
 }
 
}
