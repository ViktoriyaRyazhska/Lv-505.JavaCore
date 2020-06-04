package HW_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SecondAppl {
 public static void main(String[] args) {
  Map<String,String> personMap = new HashMap<>();
  
  personMap.put("Didula", "Max");
  personMap.put("Chernyk", "Yuliya");
  personMap.put("Skaskiv", "Roman");
  personMap.put("Grinchuk", "Yura");
  personMap.put("Buriy", "Marki");
  
  Iterator it = personMap.entrySet().iterator();
    
  
  for (Iterator i = personMap.entrySet().iterator(); i.hasNext();){
      Map.Entry entry = (Map.Entry) i.next();
     if(entry.getValue().equals("Orest")) {
      i.remove();
     }
   }
  for (Iterator i = personMap.entrySet().iterator(); i.hasNext();){
      Map.Entry entry = (Map.Entry) i.next();
      System.out.println(entry.getKey() + " " + entry.getValue());
   }

  
 } 
 
 
}
