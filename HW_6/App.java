package HW_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Appl {
 public static void main(String[] args) {
  List<Student> list = new ArrayList<>();
  list.add(new Student("Max", 7));
  list.add(new Student("Yuliya", 1));
  list.add(new Student("Roman", 2));
  list.add(new Student("Yura", 3));
  list.add(new Student("Marki", 4));

//  printList(list);

  Student tmp = new Student();
  tmp.printStudents(list, 1);

  
    Iterator it = list.iterator();
    
    list.sort(new Comparablecourse());
    
    printList(list);
    
    list.sort(new Comparablename());
    
    printList(list);
   
 }

 static void printList(List list) {
  for (Object obj : list) {
   System.out.println(obj);
  }
  System.out.println("\n");
 }

}
