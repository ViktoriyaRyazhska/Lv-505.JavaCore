package SerializableGson;

import java.io.*;

public class DemoSerialization {

/*
    public static void main(String[] args) {

//Example of serialization в двійковий код
    Student student  =new Student("ComputerScience",1,"Ivanov","12345");

        System.out.println(student);

        //save object in file


        File fw = new File("C:1/demo.cer");


try{
    ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
    ostream.writeObject(student);
    ostream.close();
}
catch (IOException e){
    System.err.println(e);
}


    }

*/

    public static void main(String[] args) {

        Student.bachelor = "Mathematic";
        File fr = new File("C:/1/demo.cer");
        try {
                ObjectInputStream isStream  = new ObjectInputStream(new FileInputStream(fr));
                Student unknown = (Student) isStream.readObject();

                isStream.close();
            System.out.println(unknown);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }



}
