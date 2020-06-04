package HW_6;

import java.util.Comparator;

public class Comparablename extends Student implements Comparator<Student> {
 @Override
 public int compare(Student st,Student st1) {
  return st.getName().compareTo(st1.getName());
 }
}
