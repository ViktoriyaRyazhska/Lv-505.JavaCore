package Main.logic.listString;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static List<String>words =new ArrayList<>();

    public Main() {

    }





    public void addStringtoList(String...strings){
        for(String string :strings){
            words.add(string);
        }
    }



}
