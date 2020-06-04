package HW_6;

import java.util.Comparator;

public class Comparablecourse extends Student implements Comparator<Student> {
 
 @Override
 public int compare(Student st,Student st1) {
  return st.getCourse() - st1.getCourse();
 }
}
