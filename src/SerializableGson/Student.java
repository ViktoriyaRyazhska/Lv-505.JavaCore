package SerializableGson;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    //
    protected static String bachelor;
    private int id;
    private String name;
    private transient String password;

    public Student(String bachelor,int id,String name, String password) {
        Student.bachelor = bachelor;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student [id=" + id
                + ", name=" + name
                + ", password=" + password
                + ", bachelor=" + bachelor
                + "]";
    }



}
