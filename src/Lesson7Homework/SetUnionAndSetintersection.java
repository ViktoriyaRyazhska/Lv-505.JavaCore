package Lesson7Homework;


import java.util.HashSet;
import java.util.Set;

public class SetUnionAndSetintersection {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static<E> Set<E> union(Set<E> set1, Set<E> set2){

      Set<E> result =new HashSet<E>(set1);
      result.addAll(set2);
      return result;
  }
    public static<E> Set<E> intersection (Set<E> set4,Set<E> set5){

        Set<E> result1 =new HashSet<E>(set4);
        result1.retainAll(set5);
        return result1;
    }
}
