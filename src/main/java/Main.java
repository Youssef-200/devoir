import java.io.File;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("ouhba","youssef");

        File file = new File("Student1.json");

        student.serialize(student);

        student.deserialize();

    }

}