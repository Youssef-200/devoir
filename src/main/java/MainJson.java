import com.google.gson.Gson;
import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainJson {

    public static void main(String[] args) {

        Student student = new Student("OUHBA","YOUSSEF");

        //library gson

        Gson gson = new Gson();

        String myJson = gson.toJson(student);

        // serialization

        try(FileWriter writer = new FileWriter("Student.json")){
            gson.toJson(student,writer);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        // deserialization

        try(FileReader fileReader = new FileReader("Student.json")){
            Student student1 = gson.fromJson(fileReader,Student.class);
            System.out.println(student1);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}